-- distinct

select distinct fac.fk_numerodocumento from pijamax.factura as fac;

-- seudonimos
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
    t5.id_factura as 'numero de la factura',
    t4.id_pedido as 'numero de pedido' ,
    t2.nombre_producto as 'nombre del producto',
    t1.cantidad as 'cantidad producto',
    t1.costo_unitario as 'valor unitario',
    t1.costo_total as 'valor total'
from
    pijamax.item as t1
        inner join
    pijamax.productos as t2
        inner join
    pijamax.pedido as t4
        inner join
    pijamax.factura as t5 ON t1.id_producto = t2.id_producto
        and t1.id_pedido = t4.id_pedido
        and t4.id_pedido = t5.fk_pedido
;