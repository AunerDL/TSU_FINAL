//------------------------------------------------------------------------------
// <auto-generated>
//     Este código se generó a partir de una plantilla.
//
//     Los cambios manuales en este archivo pueden causar un comportamiento inesperado de la aplicación.
//     Los cambios manuales en este archivo se sobrescribirán si se regenera el código.
// </auto-generated>
//------------------------------------------------------------------------------

namespace Uttt.Api.Rest.Domain
{
    using System;
    using System.Collections.Generic;
    
    public partial class Direcciones
    {
        public int Id { get; set; }
        public string Calle { get; set; }
        public string Colonia { get; set; }
        public string CodigoPostal { get; set; }
        public string NumeroInterior { get; set; }
        public string NumeroExterior { get; set; }
        public string Municipio { get; set; }
        public Nullable<int> IdPersona { get; set; }
    
        public virtual Personas Personas { get; set; }
    }
}
