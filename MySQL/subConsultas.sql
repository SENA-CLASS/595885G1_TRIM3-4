-- SUBCONSULTAS Y JOINS

SELECT 
    `item`.`id_pedido`,
    `item`.`id_producto`,
    `item`.`cantidad`,
    `item`.`costo_unitario`,
    `item`.`costo_total`
FROM
    `pijamax`.`item`;

-- consulta interna
select 
    *
from
    (SELECT 
        *
    FROM
        `pijamax`.`item`) m
where
    m.id_pedido = 1;

select * from
(select 
    t5.id_factura,
    t4.id_pedido,
    t2.nombre_producto,
    t1.cantidad,
    t1.costo_unitario,
    t1.costo_total
from
    pijamax.item t1
        inner join
    pijamax.productos t2
        inner join
    pijamax.pedido t4
        inner join
    pijamax.factura t5 ON t1.id_producto = t2.id_producto
        and t1.id_pedido = t4.id_pedido
        and t4.id_pedido = t5.fk_pedido
) res
where res.id_factura=8
;

select 
    i.id_pedido,
    p.nombre_producto,
    i.cantidad,
    i.costo_unitario,
    i.costo_total
from
    pijamax.item i,
    pijamax.productos p
where
    i.id_producto = p.id_producto;

-- consulta externa o subconsulta

select 
    i.id_pedido,
    p.nombre_producto,
    i.cantidad,
    i.costo_unitario,
    i.costo_total
from
    pijamax.item i,
    pijamax.productos p
where
    i.id_producto = p.id_producto;

select 
    *
from
    (select 
        i.id_pedido,
            p.nombre_producto,
            i.cantidad,
            i.costo_unitario,
            i.costo_total
    from
        pijamax.item i, pijamax.productos p
    where
        i.id_producto = p.id_producto) con
where
    con.id_pedido = 7;

-- counsulta interna o anidada
select 
    *
from
    pijamax.cuentas cta
where
    cta.tipo_documento = 'cc'
        && cta.numero_documento = '1010235654';

-- operador IN
select * from pijamax.cuentas cta
where cta.segundo_apellido in ('vega', 'ceballos')
;

select 
    *
from
    pijamax.factura fac
where
    fac.fk_numerodocumento in (
select 
            cta.numero_documento
        from
            pijamax.cuentas cta
        where
            cta.fecha_nacimiento = '1982-02-15');

-- operador any
select 
    *
from
    pijamax.factura fac
where
    fac.fk_numerodocumento > any (select 
            cta.numero_documento
        from
            pijamax.cuentas cta
        where
            cta.fecha_nacimiento = '1982-02-15');

-- el operador exists
select 
    *
from
    pijamax.factura fac
where
    exists( select 
            cta.numero_documento
        from
            pijamax.cuentas cta
        where
            cta.fecha_nacimiento = '1982-02-15');

-- el operador all
select 
    *
from
    pijamax.factura fac
where
    fac.fk_numerodocumento > all (select 
            cta.numero_documento
        from
            pijamax.cuentas cta
        where
            cta.fecha_nacimiento = '1982-02-15');

-- subconsultas multicoluma
select cta.tipo_documento, cta.numero_documento
from pijamax.cuentas cta
where cta.primer_nombre like '%sa%';

select 
    *
from
    pijamax.factura fact
where
    fact.fk_tipodocumento = (select 
            cta.tipo_documento
        from
            pijamax.cuentas cta
        where
            cta.primer_nombre like '%sa%')
        and fact.fk_numerodocumento = (select 
            cta.numero_documento
        from
            pijamax.cuentas cta
        where
            cta.primer_nombre like '%sa%')
;
-- subconsultas correlacionadas
select 
    *
from
    pijamax.item t1
where
    (select 
            t2.id_producto
        from
            pijamax.productos t2
        where
            t1.id_producto = t2.id_producto)
;


