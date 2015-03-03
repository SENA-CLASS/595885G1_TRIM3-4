
-- mostras columnas especificas
select m.tipo_documento from pijamax.cuentas m;


SELECT a.id_pedido, a.id_producto, a.costo_total FROM pijamax.item a
where id_pedido=7
order by a.costo_total desc;

select * from pijamax.cuentas m
where m.numero_documento= '1010235654'
;

select * from pijamax.cuentas m
where m.fecha_nacimiento is null;
select * from pijamax.cuentas m
where m.fecha_nacimiento is not null
|| m.segundo_apellido= 'sanchez';

SELECT * FROM pijamax.factura
where id_factura >= 5 and id_factura <=8;

SELECT * FROM pijamax.factura
where id_factura between 5 and 8;

select * from pijamax.productos m
where m.activa is false;

select * from pijamax.productos m
where m.nombre_producto like '%%';

select * from pijamax.productos m
where m.cantidad= 18
or m.cantidad=23
or m.cantidad=9;

select * from pijamax.productos m
where m.cantidad in (18, 23, 9);

select * from pijamax.productos m
where m.cantidad REGEXP '([1-9]{3})';


select * from pijamax.productos m
where m.cantidad % 10 =2;

select abs(sin(m.cantidad)), m.nombre_producto from pijamax.productos m;

