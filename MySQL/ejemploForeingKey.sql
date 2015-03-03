-- llaves foraneas

create database a;

create table a.persona(
tipo_documento varchar(20) not null,
numero_documento varchar(20) not null,
nombre_completo varchar(100),
primary key (tipo_documento, numero_documento)
);

create table a.carro(
matricula varchar(10) not null,
marca varchar(20),
modelo year,
tipo_documento varchar(20) not null,
numero_documento varchar(20) not null,
primary key (matricula),
constraint FK_persona foreign key (tipo_documento,numero_documento)references a.persona(tipo_documento,numero_documento)
on update cascade
on delete cascade

);

INSERT INTO `a`.`persona`
(`tipo_documento`,
`numero_documento`,
`nombre_completo`)
VALUES
('cc',
'801234234',
'alejandro ruiz');

INSERT INTO `a`.`carro`
(`matricula`,
`marca`,
`modelo`,
`tipo_documento`,
`numero_documento`)
VALUES
('aaa123',
'mazda',
'2005',
'cc',
'801234234');

UPDATE `a`.`persona`
SET
`numero_documento` = '80013833'
WHERE `tipo_documento` = 'cc' AND `numero_documento` = '801234234';

DELETE FROM `a`.`persona`
WHERE tipo_documento='cc' and numero_documento='80013833';





