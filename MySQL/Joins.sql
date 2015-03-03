-- JOINS

select 
    count(*)
from
    pijamax.item;

select 
    count(*)
from
    pijamax.productos;

select 
    *
from
    pijamax.item,
    pijamax.productos
;

select 
    *
from
    pijamax.item,
    pijamax.productos;

-- equijoin

select 
    *
from
    pijamax.item t1,
    pijamax.productos t2
where
    t1.id_producto = t2.id_producto;

select 
    *
from
    pijamax.item t1
        INNER JOIN
    pijamax.productos t2 ON t1.id_producto = t2.id_producto
;

select 
    t1.id_pedido,
    t2.nombre_producto,
    t1.cantidad,
    t1.costo_unitario,
    t1.costo_total
from
    pijamax.item t1,
    pijamax.productos t2
where
    t1.id_producto = t2.id_producto
        AND T1.ID_PEDIDO = 8;





-- join con sentencias inner join
select 
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
;

select 
    count(*)
from
    pijamax.item t1
        inner join
    pijamax.productos t2
        inner join
    pijamax.pedido t4
        inner join
    pijamax.factura t5 
;


