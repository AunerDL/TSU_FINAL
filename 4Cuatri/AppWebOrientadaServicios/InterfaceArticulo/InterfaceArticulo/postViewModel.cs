using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InterfaceArticulo.Formularios
{
    internal class postViewModel
    {
        public string id {  get; set; }
        public string codigo_barras { get; set; }
        public string descrip_normal { get; set; }
        public string clave_producto { get; set; }
        public string codigo_interno {  get; set; }
        public string proveedor {  get; set; }
        public string descrip_corta {  get; set; }
        public string departamento { get; set; }
        public string categoria {  get; set; }
        public string subcartegoria { get; set; }
        public string linea { get; set; }
        public string unidad_medida {  get; set; }
        public string piezas {  get; set; }
        public string stock_minimo {  get; set; }
        public string stock_maximo { get; set; }
        public string obj_impuesto {  get; set; }
        public string impuesto_apli {  get; set; }
        public string ieps {  get; set; }
        public string iva {  get; set; }
        public string precio_compra {  get; set; }
        public string unidad {  get; set; }
    }
}
