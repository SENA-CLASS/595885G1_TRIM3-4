-- vistas

create view vta_item_facturas as (select 
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
);

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

select * from vta_item_facturas
;