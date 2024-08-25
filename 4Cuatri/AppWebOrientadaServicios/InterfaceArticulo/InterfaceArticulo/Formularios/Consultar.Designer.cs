namespace InterfaceArticulo.Formularios
{
    partial class Consultar
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.txtReference = new System.Windows.Forms.TextBox();
            this.btnBuscar = new System.Windows.Forms.Button();
            this.dgvMostrar = new System.Windows.Forms.DataGridView();
            this.codigo_barras = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.clave_producto = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.codigo_interno = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.proveedor = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.descrip_normal = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.descrip_corta = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.departamento = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.categoria = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.subcategoria = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.linea = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.unidad_medida = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.piezas = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.stock_minimo = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.stock_maximo = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.obj_impuesto = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.impuesto_apli = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ieps = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.iva = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.precio_compra = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.unidad = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.dgvMostrar)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(54, 51);
            this.label1.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(0, 21);
            this.label1.TabIndex = 0;
            this.label1.Click += new System.EventHandler(this.label1_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(34, 51);
            this.label2.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(174, 21);
            this.label2.TabIndex = 1;
            this.label2.Text = "Ingresa la descripcion";
            // 
            // txtReference
            // 
            this.txtReference.Location = new System.Drawing.Point(37, 86);
            this.txtReference.Margin = new System.Windows.Forms.Padding(4, 3, 4, 3);
            this.txtReference.Multiline = true;
            this.txtReference.Name = "txtReference";
            this.txtReference.Size = new System.Drawing.Size(464, 49);
            this.txtReference.TabIndex = 2;
            this.txtReference.TextChanged += new System.EventHandler(this.txtReference_TextChanged);
            // 
            // btnBuscar
            // 
            this.btnBuscar.BackColor = System.Drawing.Color.IndianRed;
            this.btnBuscar.Location = new System.Drawing.Point(818, 65);
            this.btnBuscar.Margin = new System.Windows.Forms.Padding(4, 3, 4, 3);
            this.btnBuscar.Name = "btnBuscar";
            this.btnBuscar.Size = new System.Drawing.Size(160, 71);
            this.btnBuscar.TabIndex = 3;
            this.btnBuscar.Text = "Buscar";
            this.btnBuscar.UseVisualStyleBackColor = false;
            this.btnBuscar.Click += new System.EventHandler(this.btnBuscar_Click);
            // 
            // dgvMostrar
            // 
            this.dgvMostrar.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dgvMostrar.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.codigo_barras,
            this.clave_producto,
            this.codigo_interno,
            this.proveedor,
            this.descrip_normal,
            this.descrip_corta,
            this.departamento,
            this.categoria,
            this.subcategoria,
            this.linea,
            this.unidad_medida,
            this.piezas,
            this.stock_minimo,
            this.stock_maximo,
            this.obj_impuesto,
            this.impuesto_apli,
            this.ieps,
            this.iva,
            this.precio_compra,
            this.unidad});
            this.dgvMostrar.Location = new System.Drawing.Point(24, 180);
            this.dgvMostrar.Margin = new System.Windows.Forms.Padding(4, 3, 4, 3);
            this.dgvMostrar.Name = "dgvMostrar";
            this.dgvMostrar.RowHeadersWidth = 51;
            this.dgvMostrar.RowTemplate.Height = 24;
            this.dgvMostrar.Size = new System.Drawing.Size(940, 210);
            this.dgvMostrar.TabIndex = 4;
            // 
            // codigo_barras
            // 
            this.codigo_barras.HeaderText = "Codigo de barras";
            this.codigo_barras.MinimumWidth = 6;
            this.codigo_barras.Name = "codigo_barras";
            this.codigo_barras.Width = 125;
            // 
            // clave_producto
            // 
            this.clave_producto.HeaderText = "Clave del producto";
            this.clave_producto.MinimumWidth = 6;
            this.clave_producto.Name = "clave_producto";
            this.clave_producto.Width = 125;
            // 
            // codigo_interno
            // 
            this.codigo_interno.HeaderText = "Codigo interno";
            this.codigo_interno.MinimumWidth = 6;
            this.codigo_interno.Name = "codigo_interno";
            this.codigo_interno.Width = 125;
            // 
            // proveedor
            // 
            this.proveedor.HeaderText = "Proveedor";
            this.proveedor.MinimumWidth = 6;
            this.proveedor.Name = "proveedor";
            this.proveedor.Width = 125;
            // 
            // descrip_normal
            // 
            this.descrip_normal.HeaderText = "Descripcion normal";
            this.descrip_normal.MinimumWidth = 6;
            this.descrip_normal.Name = "descrip_normal";
            this.descrip_normal.Width = 125;
            // 
            // descrip_corta
            // 
            this.descrip_corta.HeaderText = "Descripcion corta";
            this.descrip_corta.MinimumWidth = 6;
            this.descrip_corta.Name = "descrip_corta";
            this.descrip_corta.Width = 125;
            // 
            // departamento
            // 
            this.departamento.HeaderText = "Departamento";
            this.departamento.MinimumWidth = 6;
            this.departamento.Name = "departamento";
            this.departamento.Width = 125;
            // 
            // categoria
            // 
            this.categoria.HeaderText = "Categoria";
            this.categoria.MinimumWidth = 6;
            this.categoria.Name = "categoria";
            this.categoria.Width = 125;
            // 
            // subcategoria
            // 
            this.subcategoria.HeaderText = "Subcategoria";
            this.subcategoria.MinimumWidth = 6;
            this.subcategoria.Name = "subcategoria";
            this.subcategoria.Width = 125;
            // 
            // linea
            // 
            this.linea.HeaderText = "Linea";
            this.linea.MinimumWidth = 6;
            this.linea.Name = "linea";
            this.linea.Width = 125;
            // 
            // unidad_medida
            // 
            this.unidad_medida.HeaderText = "Unidad de medida";
            this.unidad_medida.MinimumWidth = 6;
            this.unidad_medida.Name = "unidad_medida";
            this.unidad_medida.Width = 125;
            // 
            // piezas
            // 
            this.piezas.HeaderText = "Piezas";
            this.piezas.MinimumWidth = 6;
            this.piezas.Name = "piezas";
            this.piezas.Width = 125;
            // 
            // stock_minimo
            // 
            this.stock_minimo.HeaderText = "Strock minimo";
            this.stock_minimo.MinimumWidth = 6;
            this.stock_minimo.Name = "stock_minimo";
            this.stock_minimo.Width = 125;
            // 
            // stock_maximo
            // 
            this.stock_maximo.HeaderText = "Stock maximo";
            this.stock_maximo.MinimumWidth = 6;
            this.stock_maximo.Name = "stock_maximo";
            this.stock_maximo.Width = 125;
            // 
            // obj_impuesto
            // 
            this.obj_impuesto.HeaderText = "Objeto impuesto";
            this.obj_impuesto.MinimumWidth = 6;
            this.obj_impuesto.Name = "obj_impuesto";
            this.obj_impuesto.Width = 125;
            // 
            // impuesto_apli
            // 
            this.impuesto_apli.HeaderText = "Impuesto aplicable";
            this.impuesto_apli.MinimumWidth = 6;
            this.impuesto_apli.Name = "impuesto_apli";
            this.impuesto_apli.Width = 125;
            // 
            // ieps
            // 
            this.ieps.HeaderText = "IEPS";
            this.ieps.MinimumWidth = 6;
            this.ieps.Name = "ieps";
            this.ieps.Width = 125;
            // 
            // iva
            // 
            this.iva.HeaderText = "IVA";
            this.iva.MinimumWidth = 6;
            this.iva.Name = "iva";
            this.iva.Width = 125;
            // 
            // precio_compra
            // 
            this.precio_compra.HeaderText = "Precio de compra";
            this.precio_compra.MinimumWidth = 6;
            this.precio_compra.Name = "precio_compra";
            this.precio_compra.Width = 125;
            // 
            // unidad
            // 
            this.unidad.HeaderText = "Utilidad";
            this.unidad.MinimumWidth = 6;
            this.unidad.Name = "unidad";
            this.unidad.Width = 125;
            // 
            // Consultar
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(9F, 21F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Gray;
            this.ClientSize = new System.Drawing.Size(994, 413);
            this.Controls.Add(this.dgvMostrar);
            this.Controls.Add(this.btnBuscar);
            this.Controls.Add(this.txtReference);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Font = new System.Drawing.Font("Franklin Gothic Demi", 10F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Margin = new System.Windows.Forms.Padding(4);
            this.Name = "Consultar";
            this.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.Text = "Consultar";
            ((System.ComponentModel.ISupportInitialize)(this.dgvMostrar)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtReference;
        private System.Windows.Forms.Button btnBuscar;
        private System.Windows.Forms.DataGridView dgvMostrar;
        private System.Windows.Forms.DataGridViewTextBoxColumn codigo_barras;
        private System.Windows.Forms.DataGridViewTextBoxColumn clave_producto;
        private System.Windows.Forms.DataGridViewTextBoxColumn codigo_interno;
        private System.Windows.Forms.DataGridViewTextBoxColumn proveedor;
        private System.Windows.Forms.DataGridViewTextBoxColumn descrip_normal;
        private System.Windows.Forms.DataGridViewTextBoxColumn descrip_corta;
        private System.Windows.Forms.DataGridViewTextBoxColumn departamento;
        private System.Windows.Forms.DataGridViewTextBoxColumn categoria;
        private System.Windows.Forms.DataGridViewTextBoxColumn subcategoria;
        private System.Windows.Forms.DataGridViewTextBoxColumn linea;
        private System.Windows.Forms.DataGridViewTextBoxColumn unidad_medida;
        private System.Windows.Forms.DataGridViewTextBoxColumn piezas;
        private System.Windows.Forms.DataGridViewTextBoxColumn stock_minimo;
        private System.Windows.Forms.DataGridViewTextBoxColumn stock_maximo;
        private System.Windows.Forms.DataGridViewTextBoxColumn obj_impuesto;
        private System.Windows.Forms.DataGridViewTextBoxColumn impuesto_apli;
        private System.Windows.Forms.DataGridViewTextBoxColumn ieps;
        private System.Windows.Forms.DataGridViewTextBoxColumn iva;
        private System.Windows.Forms.DataGridViewTextBoxColumn precio_compra;
        private System.Windows.Forms.DataGridViewTextBoxColumn unidad;
    }
}