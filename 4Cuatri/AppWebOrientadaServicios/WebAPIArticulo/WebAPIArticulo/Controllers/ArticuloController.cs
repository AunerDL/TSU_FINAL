using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Web;
using System.Web.Http.Description;
using System.Web.Http;
using WebAPIArticulo.Common.Web.DataTransfer;
using WebAPIArticulo.Common.Web.Dto;
using AutoMapper;
using MongoDB.Bson;
using NLog;
using Swashbuckle.Swagger.Annotations;
using WebAPIArticulo.Infraestructure;
using WebAPIArticulo.Models;

namespace WebAPIArticulo.Controllers
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

        //Insertar datos
        [HttpPost]
        [Route("articulo/registro")]
        [ResponseType(typeof(ResponseWrapper<ArticuloDto>))]
        [SwaggerResponse(HttpStatusCode.OK,
            "Se obtiene de forma exitosa la insercion de la entidad articulo",
            typeof(ResponseWrapper<List<Articulo>>))]
        [SwaggerResponse(HttpStatusCode.InternalServerError,
            "Existe un error al obtener la insercion de la entidad del tipo articulo")]
        [SwaggerOperation("Devuelve una entidad del tipo persona")]
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
    }
}