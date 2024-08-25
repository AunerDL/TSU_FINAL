using Amazon.Runtime.Internal.Endpoints.StandardLibrary;
using AutoMapper;
using final.Common.Web.DataTransfer;
using final.Common.Web.Dto;
using final.Infraestructure;
using final.Models;
using MongoDB.Bson;
using NLog;
using Swashbuckle.Swagger.Annotations;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using System.Web.Http.Description;
using ZstdSharp.Unsafe;

namespace final.Controllers
{
    public class ArticuloController : ApiController
    {
        private static readonly NLog.Logger loggerDb = LogManager.GetLogger("databasearticulos");
        private readonly IArticuloRepository _articuloRepository;
        private IMapper _mapper;
        public ArticuloController(IArticuloRepository articuloRepository)
        {
            this._articuloRepository = articuloRepository;
        }

        //INSERCION
        //Insertar datos
        [HttpPost]
        [Route("articulo/registro")]
        [ResponseType(typeof(ResponseWrapper<ArticuloDto>))]
        [SwaggerResponse(HttpStatusCode.OK,
            "Se obtiene de forma exitosa la insercion de la entidad articulo",
            typeof(ResponseWrapper<List<Articulo>>))]
        [SwaggerResponse(HttpStatusCode.InternalServerError,
            "Existe un error al obtener la insercion de la entidad del tipo articulo")]
        [SwaggerOperation("Devuelve una entidad del tipo articulo")]
        public IHttpActionResult Create(Articulo articulo)
        {
            try
            {
                _articuloRepository.Create(articulo);
                return Ok(articulo);
            }
            catch (Exception ex)
            {
                loggerDb.Error(ex);
                return BadRequest("No se pudo insertar la entidad de forma exitosa");
            }
        }

        // CONSULTAR DATOS
        //Consultar datos
        [HttpGet]
        [Route("articulo")]
        [ResponseType(typeof(ResponseWrapper<List<ArticuloDto>>))]
        [SwaggerResponse(HttpStatusCode.OK,
            "Se obtiene de forma exitosa la carga de todas las entidades",
            typeof(ResponseWrapper<List<Articulo>>))]
        [SwaggerResponse(HttpStatusCode.InternalServerError,
            "Existe un error al obtener la entidades del tipo de articulo")]
        [SwaggerOperation("Devuelve un listado de entidades del tipo articulo")]
        public IHttpActionResult Get()
        {
            var articulo = _articuloRepository.GetAll();
            return Ok(new ResponseWrapper<List<ArticuloDto>>
            {
                StatusCode = HttpStatusCode.OK,
                Message = "Se encontraron resultados para esta consulta realizada.",
                Data = AutoMapper.Mapper.Map<List<ArticuloDto>>(articulo)
            });
        }

        [HttpGet]
        [Route("articulo/{DescripCorta}")]
        [ResponseType(typeof(ResponseWrapper<List<ArticuloDto>>))]
        [SwaggerResponse(HttpStatusCode.OK, "Se obtiene de forma exitosa la carga del tipo articulo",
            typeof(ResponseWrapper<List<ArticuloDto>>))]
        [SwaggerResponse(HttpStatusCode.InternalServerError, "Existe un error al obtener la entidad")]
        [SwaggerOperation("Devuelve una entidad de tipo articulo")]
        public IHttpActionResult GetByDescripCorta(string descripCorta)
        {
            try
            {
                List<Articulo> articulos = _articuloRepository.GetDescriptionCorta(descripCorta);
                if (articulos is null)
                {
                    return NotFound();
                }
                return Ok(new ResponseWrapper<List<ArticuloDto>>
                {
                    StatusCode = HttpStatusCode.OK,
                    Message = "Se encontraron resultados para esta consulta realizada",
                    Data = AutoMapper.Mapper.Map<List<ArticuloDto>>(articulos)
                });
            }
            catch (Exception ex)
            {
                loggerDb.Error(ex);
                return BadRequest("No se encuentra la entidad articulo de forma exitosa");
            }
        }

        //BORRAR
        //Eliminar datos
        [HttpDelete]
        [Route("articulo/{DescripCorta}")]
        [ResponseType(typeof(ResponseWrapper<List<ArticuloDto>>))]
        [SwaggerResponse(HttpStatusCode.OK, "Se obtiene de forma exitosa la carga del tipo articulo",
            typeof(ResponseWrapper<List<ArticuloDto>>))]
        [SwaggerResponse(HttpStatusCode.InternalServerError, "Existe un error al obtener la entidad")]
        [SwaggerOperation("Devuelve una entidad de tipo articulo")]
        public IHttpActionResult Delete(string DescripCorta)
        {
            try
            {
                _articuloRepository.Delete(DescripCorta);
                return Ok();
            }
            catch (Exception ex)
            {
                loggerDb.Error(ex);
                return BadRequest("No se pudo eliminar la entidad de forma exitosa");
            }
        }

        ////Consultar datos con ID
        //[HttpGet]
        //[Route("articulo/{id}")]
        //[ResponseType(typeof(ResponseWrapper<List<ArticuloDto>>))]
        //[SwaggerResponse(HttpStatusCode.OK,
        //    "Se obtiene de forma exitosa la carga de todas las entidades",
        //    typeof(ResponseWrapper<List<Articulo>>))]
        //[SwaggerResponse(HttpStatusCode.InternalServerError,
        //    "Existe un error al obtener la entidades del tipo de articulo")]
        //[SwaggerOperation("Devuelve una entidad del tipo articulo")]
        //public IHttpActionResult GetPersonaByEntidad(string id)
        //{
        //    var objectId = new ObjectId(id);
        //    Articulo articulo = _articuloRepository.GetById(objectId);
        //    if (articulo == null)
        //    {
        //        return NotFound();
        //    }
        //    return Ok(new ResponseWrapper<ArticuloDto>
        //    {
        //        StatusCode = HttpStatusCode.OK,
        //        Message = "Seencontraron resultadospara esta consulta realizada.",
        //        Data = AutoMapper.Mapper.Map<ArticuloDto>(articulo)
        //    });
        //}

        ////consultar datos por nombre
        //[HttpGet]
        //[Route("articulo/{nombre}")]
        //[ResponseType(typeof(ResponseWrapper<List<ArticuloDto>>))]
        //[SwaggerResponse(HttpStatusCode.OK,
        //    "Se obtiene de forma exitosa la carga de entidad articulo",
        //    typeof(ResponseWrapper<List<ArticuloDto>>))]
        //[SwaggerResponse(HttpStatusCode.InternalServerError,
        //    "Existe un error al obtener la entidades del tipo de articulo")]
        //[SwaggerOperation("Devuelve una entidad del tipo articulo")]
        //public IHttpActionResult GetPersonaByName(string name)
        //{
        //    try
        //    {
        //        List<Articulo> articulos = _articuloRepository.GetPersonsByName(name);
        //        if (articulos is null)
        //        {
        //            return NotFound();
        //        }
        //        return Ok(new ResponseWrapper<List<ArticuloDto>>
        //        {
        //            StatusCode = HttpStatusCode.OK,
        //            Message = "Seencontraron resultadospara esta consulta realizada.",
        //            Data = AutoMapper.Mapper.Map<List<ArticuloDto>>(articulos)
        //        });
        //    }
        //    catch (Exception ex)
        //    {
        //        loggerDb.Error(ex);
        //        return BadRequest("No se pudo actualizar la entidad de forma exitosa");
        //    }
        //}
    }
}
