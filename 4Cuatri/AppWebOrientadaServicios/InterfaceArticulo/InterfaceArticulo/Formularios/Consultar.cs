using Newtonsoft.Json;
using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Security.Policy;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace InterfaceArticulo.Formularios
{
    public partial class Consultar : Form
    {

        private HttpClient httpClient = new HttpClient();
        private const string url = "https://localhost:44388/articulo";

        public Consultar()
        {
            InitializeComponent();
        }

        private async void label1_Click(object sender, EventArgs e)
        {

        }

        //private async void Consultar_Load(object sender, EventArgs e)
        //{
        //    //string respuesta = await GetHttp();
        //    //List<postViewModel> lista = JsonConvert.DeserializeObject<List<postViewModel>>(respuesta);
        //    //dgvMostrar.DataSource = lista; 
        //}

        ////public async Task<string> GetHttp()
        ////{
        ////    //WebRequest oRequest = WebRequest.Create(url2);
        ////    //WebResponse oResponse = oRequest.GetResponse();
        ////    //StreamReader sr = new StreamReader(oResponse.GetResponseStream());
        ////    //return await sr.ReadToEndAsync();
        ////}

        private async void btnBuscar_Click(object sender, EventArgs e)
        {
            try
            {
                string Busqueda = txtReference.Text;
                string buscarDescripcion = $"{url}/{Busqueda}";

                HttpResponseMessage response = await httpClient.GetAsync(buscarDescripcion);

                if (response.IsSuccessStatusCode)
                {
                    string json = await response.Content.ReadAsStringAsync();
                    var resultado = JsonConvert.DeserializeObject<ResponseWrapper<List<ArticuloDto>>>(json);

                    if (resultado != null && resultado.Data != null && resultado.Data.Count > 0)
                    {
                        dgvMostrar.Rows.Clear();

                        foreach (var articulo in resultado.Data)
                        {
                            dgvMostrar.Rows.Add(
                                articulo.codigo_barras,
                                articulo.clave_producto,
                                articulo.codigo_interno,
                                articulo.proveedor,
                                articulo.descripcion_normal,
                                articulo.descripcion_corta,
                                articulo.departamento,
                                articulo.categoria,
                                articulo.subcategoria,
                                articulo.linea,
                                articulo.unidad_de_medida,
                                articulo.piezas,
                                articulo.stock_minimo,
                                articulo.stock_maximo,
                                articulo.objeto_impuesto,
                                articulo.impuesto_aplicable,
                                articulo.ieps,
                                articulo.iva,
                                articulo.precio_compra,
                                articulo.utilidad
                            );
                        }

                        MessageBox.Show("Búsqueda Exitosa", "Búsqueda Exitosa", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    }
                    else
                    {
                        MessageBox.Show("No se encontraron resultados.", "Sin Resultados", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    }
                }
                else
                {
                    MessageBox.Show("Error en la solicitud a la API", "Error de Búsqueda", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Ingresa un dato para buscar"+ex);
            }
        }

        private void txtReference_TextChanged(object sender, EventArgs e)
        {

        }
    }
    public class ArticuloDto
    {
        public int codigo_barras { get; set; }
        public int clave_producto { get; set; }
        public int codigo_interno { get; set; }
        public string proveedor { get; set; }
        public string descripcion_normal { get; set; }
        public string descripcion_corta { get; set; }
        public string departamento { get; set; }
        public string categoria { get; set; }
        public string subcategoria { get; set; }
        public string linea { get; set; }
        public string unidad_de_medida { get; set; }
        public int piezas { get; set; }
        public int stock_minimo { get; set; }
        public int stock_maximo { get; set; }
        public int objeto_impuesto { get; set; }
        public int impuesto_aplicable { get; set; }
        public int ieps { get; set; }
        public int iva { get; set; }
        public int precio_compra { get; set; }
        public int utilidad { get; set; }
    }

    public class ResponseWrapper<T>
    {
        public HttpStatusCode StatusCode { get; set; }
        public string Message { get; set; }
        public T Data { get; set; }
    }
}
