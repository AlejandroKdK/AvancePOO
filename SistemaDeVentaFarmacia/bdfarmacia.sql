CREATE DATABASE bdfarmacia;
USE bdfarmacia;

CREATE TABLE proveedores(
ID_proveedor int not null auto_increment primary key,
Ruc varchar(50),
nombreProveedor varchar(50),
direccion varchar(50),
telefono varchar(50),
correo varchar(50)
);

CREATE TABLE producto(
idProducto INT not null auto_increment primary key,
codigoProducto varchar(50),
nombreProducto varchar(50),
fechaProducto date,
idProveedor int,
descripcion varchar(50),
stock int,
precioUnitario decimal(10,2),
FOREIGN KEY (idProveedor) REFERENCES proveedores(ID_proveedor)
);


CREATE TABLE empleado(
ID_empleado int not null auto_increment primary key,
puesto varchar(50),
noSeguro varchar(50),
nombreEmpleado varchar(50),
direccion varchar(50),
telefono varchar(50),
correo varchar(50),
contra varchar(50)
);
INSERT INTO empleado (puesto, noSeguro, nombreEmpleado, direccion, telefono, correo, contra)
VALUES ('Administrador', '123456789', 'Alejandro', 'Privada.Gladiola s/n', '7771234567', 'alejandroMTZ@gmail.com', '1234');
SELECT * FROM empleado;


CREATE TABLE cliente(
ID_cliente int not null auto_increment primary key,
DNI varchar(50),
nombreCliente varchar(50),
direccion varchar(50),
telefono varchar(50),
correo varchar(50)
);

CREATE TABLE venta(
ID_venta int not null auto_increment primary key,
ID_cliente int,
ID_empleado int,
totalVenta decimal(10,2),
fechaVenta date,
FOREIGN KEY (ID_cliente) REFERENCES cliente(ID_cliente),
FOREIGN KEY (ID_empleado) REFERENCES empleado(ID_empleado)
);

CREATE TABLE detalle_venta(
ID_detalle_venta int not null auto_increment primary key,
ID_venta int,
idProducto int,
cantidadProducto int,
precioUnitario decimal(10,2),
subtotal decimal(10,2),
FOREIGN KEY (ID_venta) REFERENCES venta(ID_venta),
FOREIGN KEY (idProducto) REFERENCES producto(idProducto)
);

CREATE TABLE compra(
ID_compra INT not null auto_increment primary key,
ID_proveedor int,
fechaCompra date,
totalCompra decimal(10,2),
FOREIGN KEY (ID_proveedor) REFERENCES proveedores(ID_proveedor)
);

CREATE TABLE detalle_compra(
ID_detalle_compra INT not null auto_increment primary key,
ID_compra int,
idProducto int,
nombreProducto varchar(50),
cantidadProducto int,
precioUnitario decimal(10,2),
subtotal decimal(10,2),
FOREIGN KEY (ID_compra) REFERENCES compra(ID_compra),
FOREIGN KEY (idProducto) REFERENCES producto(idProducto)
);
