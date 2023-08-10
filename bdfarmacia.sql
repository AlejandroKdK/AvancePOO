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

INSERT INTO proveedores(ID_proveedor, Ruc, nombreProveedor, direccion, telefono, correo)
VALUES(1, 12345678901, 'PharmaCorp', 'Calle Principal, Cuernavaca', 555-111-111, 'info@pharmacorp.com');
INSERT INTO proveedores(ID_proveedor, Ruc, nombreProveedor, direccion, telefono, correo)
VALUES(2, 23456789012, 'MegaMeds', 'Avenida Central, Ciudad de México', 555-222-222, 'contact@megameds.com');
INSERT INTO proveedores(ID_proveedor, Ruc, nombreProveedor, direccion, telefono, correo)
VALUES(3, 34567890123, 'VitalFarm','Calle de la Salud, Monterrey', 55-333-333, 'info@vitalfarm.com');
INSERT INTO proveedores(ID_proveedor, Ruc, nombreProveedor, direccion, telefono, correo)
VALUES(4, 45678901234, 'HealthCare', 'Avenida Médica, Monterrey', 555-444-444, 'info@healthcare.com');
INSERT INTO proveedores(ID_proveedor, Ruc, nombreProveedor, direccion, telefono, correo)
VALUES(5, 56789012345, 'FarmaNet', 'Calle de los Remedios, Ciudad de Mexico', 555-555-555, 'info@farmanet.com');

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

INSERT INTO producto (codigoProducto, nombreProducto, fechaProducto, idProveedor, descripcion, stock, precioUnitario)
VALUES('COD001', 'Paracetamol', '2023-08-09', 1, 'Analgésico', 100, 50.99),
('COD002', 'Ibuprofeno', '2023-08-09', 1, 'Antiinflamatorio', 150, 27.49);

select * from producto;
delete from producto where idProducto = 4 ;



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
