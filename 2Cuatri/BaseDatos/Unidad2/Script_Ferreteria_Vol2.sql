use Ferreteria2;

create table CATEGORIA(
  idCategoria INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  descripcion VARCHAR(100) NULL,
  constraint pk_categoria PRIMARY KEY (idCategoria)
  )engine Innodb;

create table PROVEDOR(
  idProvedor INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  direccion VARCHAR(50) NOT NULL,
  telefono VARCHAR(20) NOT NULL,
  paginaweb VARCHAR(30) NULL,
  constraint pk_provedor PRIMARY KEY (idProvedor)
  )engine InnoDB;

create table PRODUCTO (
  idProducto INT NOT NULL,
  fabricante CHAR(5) NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  precioActual DECIMAL(10,2) NOT NULL,
  stock INT NOT NULL,
  idCategoria INT NOT NULL,
  provedor INT NOT NULL,
  constraint pk_producto PRIMARY KEY (idProducto, fabricante),
  constraint fk_producto_categoria FOREIGN KEY (idCategoria) REFERENCES CATEGORIA(idCategoria),
  constraint fk_producto_provedor FOREIGN KEY (provedor) references PROVEDOR(idProvedor)
  )engine InnoDB;

create table CLIENTE(
  idCliente INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  calle VARCHAR(45) NOT NULL,
  numero INT NULL,
  comunidad VARCHAR(45) NOT NULL,
  ciudad VARCHAR(45) NOT NULL,
  constraint pk_cliente PRIMARY KEY (idCliente)
  )engine InnoDB;

create table TELEFONOCONTACTO (
  idTELEFONOCONTACTO INT NOT NULL AUTO_INCREMENT,
  telefono VARCHAR(20) NOT NULL,
  cliente INT NULL,
  constraint pk_telefonocontacto PRIMARY KEY (idTELEFONOCONTACTO),
  constraint fk_telefonocontacto_cliente FOREIGN KEY (cliente) REFERENCES CLIENTE(idCliente)
  )engine InnoDB;

create table VENTA (
  idVenta INT NOT NULL AUTO_INCREMENT,
  fechaventa DATE NOT NULL,
  cliente INT NOT NULL,
  constraint pk_venta PRIMARY KEY (idVenta),
  constraint fk_cliente_venta FOREIGN KEY(cliente) REFERENCES CLIENTE(idCliente)
  )engine InnoDB;

create table Detalle_VENTA (
  producto INT NOT NULL,
  fabricante CHAR(5) NOT NULL,
  idVenta INT NOT NULL,
  cantidad INT NOT NULL,
  precioventa DECIMAL(10,2) NOT NULL,
  descuento DECIMAL(10,2) NOT NULL,
  CONSTRAINT pk_detalleventa PRIMARY KEY (producto, fabricante, idVenta),
  constraint fk_detalleventa_producto FOREIGN KEY(producto, fabricante) references PRODUCTO(idProducto, fabricante),
  constraint fk_detalleventa_venta FOREIGN KEY(idVenta) REFERENCES VENTA(idVenta)
  )engine InnoDB;
