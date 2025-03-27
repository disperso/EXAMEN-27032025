
--Datos para carga inicial de la base de datos

--Para giis.demo.tkrun:

delete from articulo;
delete from pedido;
delete from articuloPedido;
delete from contenedor;

INSERT INTO articulo(idArticulo,volumen,nombre,categoria) VALUES 
(210,3.0,"coca cola","no perecedero"),
(211,4.0,"carne de ternera","perecedero"),
(212,5.0,"manzana golden,"no perecedero"),
(213,9.0,"toallitas bebe","no perecedero"),
(259,5.0,"mayonesa musa","no perecedero"),
(260,9.0,"agua font vella","no perecedero");

INSERT INTO articuloPedido(idArticulo,idPedido,volumen,embolsado) VALUES
(25,1,6,2),
(28,1,3,2),
(63,1,8,2);

INSERT INTO pedido(idPedido,numArticulos) VALUES
(1,6),
(2,5),
(3,9),
(4,2),
(5,12),
(6,84);




