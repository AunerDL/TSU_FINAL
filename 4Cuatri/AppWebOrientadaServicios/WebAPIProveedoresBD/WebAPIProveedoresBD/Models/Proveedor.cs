using MongoDB.Bson;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using ZstdSharp.Unsafe;

namespace WebAPIProveedoresBD.Models
{
    public class Proveedor
    {
        public ObjectId Id { get; set; }
        public string Name { get; set; }
        public string ApellidoPaterno { get; set; }
        public string ApellidoMaterno { get; set; }
        public int CodigoPostal { get; set; }
        public int NumInterior { get; set; }
        public int NumExpetior { get; set; }
        public string Calle {  get; set; }
        public string Colonia { get; set; }
        public string Entidad {  get; set; }
        public string Municipio { get; set; }

        public int TelPrincipal { get; set; }
        public int TelMovil {  get; set; }
        public string Email { get; set; }
        public string RFC {  get; set; }
        public string RazonSocial { get; set; }
        public string Contacto { get; set; }
        public string Estado { get; set; }


    }
}