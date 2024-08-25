using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web;
using System.Web.Http;
using System.Web.Http.Cors;
using Uttt.Api.Rest.Domain;
using Uttt.Api.Rest.Dto;
using Uttt.Api.Rest.Infraestructure;
using Uttt.Api.Rest.Services;

namespace Uttt.Api.Rest.Controllers
{
    [RoutePrefix("api/personas")]
    [EnableCors(origins: "*", headers: "*", methods: "*")]

    public class PersonasController : ApiController
    {
        private readonly IServicePersonas servicePersonas; //servicePersonas es una variable
        private readonly NLog.Logger logger = NLog.LogManager.GetCurrentClassLogger();
        public PersonasController()
        {
            servicePersonas = new ServicesPersonas(); //servicePersonas es una Clase
        }
        [Route("all")]
        [HttpGet]
        public IHttpActionResult Get()
        {
            List<Personas> personas = servicePersonas.GetAllPersonas();
            List<PersonasDto> personasDto = AutoMapper.Mapper.Map<List<PersonasDto>>(personas);
            return Ok(personasDto);
        }
        [HttpPost]
        [Route("insertar")]
        public IHttpActionResult Insertar(PersonasDto persona)
        {
            try
            {
                Personas personas = AutoMapper.Mapper.Map<Personas>(persona);
                if (servicePersonas.Insertar(personas))
                {
                    return Ok("Los datos se insertaron correctamente");
                }
                else
                {
                    return BadRequest("Existen errores de Inserccion");
                }
            } catch (Exception ex)
            {
                logger.Error(ex.Message);
                return BadRequest($"Existen errores de Inserccion:{ex.Message}");
            }
        }

        [HttpPut]
        [Route("actualizar/{id}")]
        public IHttpActionResult Actualizar(int id, PersonasDto personasDto)
        {
            try
            {
                Personas persona = AutoMapper.Mapper.Map<Personas>(personasDto);
                if (servicePersonas.Actualizar(id, persona))
                {
                    return Ok("Se realizo la actualizacion correctamente");
                }
                else
                {
                    return BadRequest("Existen errores de actualizacion");
                }


            }
            catch (Exception ex)
            {
                logger.Error(ex.Message);
                return BadRequest($"Existen errores de Inserccion:{ex.Message}");
            }
        }

        [HttpDelete]
        [Route("eliminar/{id}")]
        public IHttpActionResult Eliminar(int id)
        {
            try
            {
                if (servicePersonas.Eliminar(id))
                {
                    return Ok("Los datos se eliminaron correctamente");
                }
                else
                {
                    return BadRequest("Existen errores de Eliminacion");
                }
            }
            catch (Exception ex)
            {
                logger.Error(ex.Message);
                return BadRequest($"Existen errores de Eliminacion: {ex.Message}");
            }
        }

        [HttpGet]
        [Route("consultar/{id}")]
        public IHttpActionResult Get(int id)
        {
            try
            {
               Personas persona= servicePersonas.GetPersonasById(id);
                PersonasDto personaDto = AutoMapper.Mapper.Map<PersonasDto>(persona);
                if(personaDto !=null)
                {
                    return Ok(personaDto);
                }
                else
                {
                    return BadRequest("Existen errores de busqueda por Id");
                }
            }
            catch(Exception ex)
            {
                logger.Error(ex.Message);
                return BadRequest($"Existen errores de Busqueda por Id: {ex.Message}");
            }
        }
    }
    
}
