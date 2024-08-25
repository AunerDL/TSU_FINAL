using InterfaceArticulo.Formularios;
using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace InterfaceArticulo
{
    public partial class Form1 : Form
    {

        string url1 = "https://localhost:44388/articulo/registro";
        private Consultar form2;
        private Eliminar form3;

        public Form1()
        {
            InitializeComponent();
            form2 = new Consultar();
            form3 = new Eliminar();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
                
        }

        private void btnConsulta_Click(object sender, EventArgs e)
        {
            try
            {
                form2.Show();
            }catch(Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private async void btnPost_Click(object sender, EventArgs e)
        {

            string codigoBarras = txtBarras.Text;
            string claveProducto = txtClave.Text;
            string codigoInterno = txtCodigo.Text;
            string Proveedor = txtProveedor.Text;
            string decripcionNormal = txtDescNormal.Text;
            string descripcionCorta = txtDescCorta.Text;
            string Departamento = txtDepartamento.Text;
            string Categoria = txtCategoria.Text;
            string subcategoria = txtSubcatego.Text;
            string Linea = txtLinea.Text;
            string unidadMedida = txtUniMedida.Text;
            string Piezas = txtPiezas.Text;
            string stockMin = txtStockMin.Text;
            string stockMax = txtStockMax.Text;
            string objImpuesto = txtObjImpuestos.Text;
            string impuestoApli = txtImpuesto.Text;
            string Ieps = txtIEPS.Text;
            string Iva = txtIVA.Text;
            string precioCompra = txtCompra.Text;
            string utilidad = txtUtilidad.Text;


            var jsonObject = new
            {
                codigo_barras = codigoBarras,
                descrip_normal = decripcionNormal,
                clave_producto = claveProducto,
                codigo_interno = codigoInterno,
                proveedor = Proveedor,
                descrip_corta = descripcionCorta,
                departamento = Departamento,
                categoria = Categoria,
                subcartegoria = subcategoria,
                linea = Linea,
                unidad_medida = unidadMedida,
                piezas = Piezas,
                stock_minimo = stockMin,
                stock_maximo = stockMax,
                obj_impuesto = objImpuesto,
                impuesto_apli = impuestoApli,
                ieps = Ieps,
                iva = Iva,
                precio_compra = precioCompra,
                unidad = utilidad
            };

            string jsonContent = JsonConvert.SerializeObject(jsonObject);

            using (var httpClient = new HttpClient())
            {
                try
                {
                    var content = new StringContent(jsonContent, Encoding.UTF8, "application/json");
                    HttpResponseMessage response = await httpClient.PostAsync(url1, content);

                    if (response.IsSuccessStatusCode)
                    {
                        Console.WriteLine("Datos enviados con éxito al servicio web.");
                        MessageBox.Show("Si agrego");
                    }
                    else
                    {
                        Console.WriteLine("Error al enviar datos al servicio web. Código de estado: " + (int)response.StatusCode);
                    }
                }
                catch (Exception ex)
                {
                    Console.WriteLine("Error: " + ex.Message);
                }
            }
        }

        private void btnDelete_Click(object sender, EventArgs e)
        {
            form3.Show();
        }
    }
}
