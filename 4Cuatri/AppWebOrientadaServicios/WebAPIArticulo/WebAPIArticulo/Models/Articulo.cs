using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using MongoDB.Bson;

namespace WebAPIArticulo.Models
{
    public class Articulo
    {
        //Datos generales
        public ObjectId CodigoBarras { get; set; }//id(codigo de barras)
        public string DescripNormal { get; set; }//nombre de articulo
        public string ClaveProducto { get; set; }
        public string CodigoInterno { get; set; }
        public string Proveedor { get; set; }
        public string DescripCorta { get; set; }

        //Departamento
        public string Departamento { get; set; }
        public string Categoria { get; set; }
        public string Subcartegoria { get; set; }
        public string Linea { get; set; }

        //Inventario
        public string UnidadMedida { get; set; }
        public string Piezas { get; set; }
        public string StockMinimo { get; set; }
        public string StockMaximo { get; set; }

        //impuestos, costos y ganancias
        public string ObjImpuesto { get; set; }
        public string ImpuestoApli { get; set; }
        public string IEPS { get; set; }
        public string IVA { get; set; }
        public string PrecioCompra { get; set; }
        public string Unidad { get; set; }
    }
}