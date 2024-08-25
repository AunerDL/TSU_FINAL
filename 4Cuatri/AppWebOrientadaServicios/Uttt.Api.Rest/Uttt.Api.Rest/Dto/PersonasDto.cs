using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using Uttt.Api.Rest.Domain;

namespace Uttt.Api.Rest.Dto
{
    public class PersonasDto
    {
        public int Id { get; set; }
        public string Nombre { get; set; }
        public string ApellidoPaterno { get; set; }
        public string ApellidoMaterno { get; set; }
        public string Rfc { get; set; }
        public int Edad { get; set; }
        public int IdTelefono { get; set; }
        public int IdDireccion { get; set; }

        public  List<DireccionesDto> Direcciones { get; set; }
        public TelefonosDto Telefonos { get; set; }
    }
}