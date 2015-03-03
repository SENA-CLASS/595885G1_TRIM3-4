-- SUBCONSULTAS Y JOINS

-- subconsultas

SELECT `item`.`id_pedido`,
    `item`.`id_producto`,
    `item`.`cantidad`,
    `item`.`costo_unitario`,
    `item`.`costo_total`
FROM `pijamax`.`item`;

select * from (
SELECT *
FROM `pijamax`.`item`) m 
where m.id_pedido=1;

select i.id_pedido, p.nombre_producto, i.cantidad,  i.costo_unitario, i.costo_total
from pijamax.item i, pijamax.productos p
where i.id_producto=p.id_producto;

-- consulta externa o subconsulta

select i.id_pedido, p.nombre_producto, i.cantidad,  i.costo_unitario, i.costo_total
from pijamax.item i, pijamax.productos p
where i.id_producto=p.id_producto;

select *
from (select i.id_pedido, p.nombre_producto, i.cantidad, i.costo_unitario, i.costo_total
from pijamax.item i, pijamax.productos p
where i.id_producto=p.id_producto) con
where con.id_pedido=7;

-- counsulta interna o anidada
select * from pijamax.cuentas cta
where cta.tipo_documento='cc' && cta.numero_documento='1010235654';

-- operador IN
select * from pijamax.factura fac
where fac.fk_numerodocumento in (select cta.numero_documento from pijamax.cuentas cta
where cta.fecha_nacimiento='1982-02-15'
);

-- operador any
select * from pijamax.factura fac
where fac.fk_numerodocumento > any (select cta.numero_documento from pijamax.cuentas cta
where cta.fecha_nacimiento='1982-02-15'
);

-- el operador exists
select * from pijamax.factura fac
where exists (select cta.numero_documento from pijamax.cuentas cta
where cta.fecha_nacimiento='1982-02-15'
);

-- el operador all
select * from pijamax.factura fac
where fac.fk_numerodocumento > all (select cta.numero_documento from pijamax.cuentas cta
where cta.fecha_nacimiento='1982-02-15'
);

-- subconsultas multicoluma
select * 
from pijamax.item it
where it.id_pedido =(select ped.id_pedido from pijamax.pedido ped where ped.total = 10000000 and ped.impuestos = 2600)
and it.id_producto = (select p.id_producto from pijamax.productos p where p.nombre_producto = 'baby doll morado intenso');

-- subconsultas correlacionadas
select * 
from pijamax.item t1
where (select t2.id_producto from pijamax.productos t2 where t1.id_producto = t2.id_producto)
;


