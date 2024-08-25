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
using static System.Windows.Forms.VisualStyles.VisualStyleElement;


namespace InterfaceArticulo.Formularios
{
    public partial class Eliminar : Form
    {
        public Eliminar()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void Eliminar_Load(object sender, EventArgs e)
        {

        }

        private async void btnEliminar_Click(object sender, EventArgs e)
        {
            string descripC = txtNombre.Text;
            string url = "https://localhost:44388/articulo/" + descripC;
            using (HttpClient Borra = new HttpClient())
            {
                try
                {
                    HttpResponseMessage response = await Borra.DeleteAsync(url);
                    if (response.IsSuccessStatusCode)
                    {
                        Console.WriteLine("Datos eliminados con éxito del servicio web.");
                        MessageBox.Show("Datos eliminados correctamente :D");
                    }
                    else
                    {
                        Console.WriteLine("Error al eliminar datos del servicio web");
                    }
                }
                catch (Exception ex)
                {
                    Console.WriteLine("Error: " + ex.Message);
                }
            }

        }

        private void txtNombre_TextChanged(object sender, EventArgs e)
        {
            string texto = txtNombre.Text;
            txtNombre.Text = texto;
        }
    }
}
