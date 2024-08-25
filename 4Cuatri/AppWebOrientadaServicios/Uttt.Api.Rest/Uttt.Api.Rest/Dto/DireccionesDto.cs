using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Uttt.Api.Rest.Dto
{
    public class DireccionesDto
    {
        public int Id { get; set; }
        public string Calle { get; set; }
        public string Colonia { get; set; }
        public string CodigoPostal { get; set; }
        public string NumeroInterior { get; set; }
        public string NumeroExterior { get; set; }
        public string Municipio { get; set; }
        public PersonasDto  Personas { get; set; }
    }
}