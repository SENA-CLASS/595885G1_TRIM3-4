create database a;
create table a.persona (
    tipo_documento varchar(20),
    numero_documento varchar(20),
    primer_nombre varchar(40),
    segundo_nombre varchar(40),
    primer_apellido varchar(40),
    segundo_apellido varchar(40),
    primary key (tipo_documento , numero_documento)
);

INSERT INTO `a`.`persona`
(`tipo_documento`,
`numero_documento`,
`primer_nombre`,
`segundo_nombre`,
`primer_apellido`,
`segundo_apellido`)
VALUES
('cc',
'51454',
'hernadno',
'enrique',
'moreno',
'moreno');


select 
    *
from
    a.persona;
alter table a.persona add column sexo int;
alter table a.persona add column sexo varchar(10);
alter table a.persona add column direccion varchar(20);
alter table a.persona add column telefono varchar(20);

INSERT INTO `a`.`persona`
(sexo)
VALUES
('masculino');

UPDATE `a`.`persona` 
SET 
    `sexo` = 'masculino'
WHERE
    `tipo_documento` = 'cc'
        and `numero_documento` = '51454';
UPDATE `a`.`persona` 
SET 
    `direccion` = 'kr 123 siempre viva'
WHERE
    `tipo_documento` = 'cc'
        and `numero_documento` = '51454';

UPDATE `a`.`persona` 
SET 
    `telefono` = '2341233124'
WHERE
    `tipo_documento` = 'cc'
        and `numero_documento` = '51454';

alter table a.persona drop column sexo;


insert into a.persona (tipo_documento,numero_documento,primer_nombre,segundo_nombre,primer_apellido,segundo_apellido,sexo)values('cc','345353','jose','vicente','martinez','martinez','masculino');

alter table a.persona drop sexo;
alter table a.persona modify sexo bigint;
alter table a.persona modify sexo varchar(30);

describe a.persona;
