create table ejemplo1.ejemplo20(
	columna1 int primary key not null
);

insert into ejemplo1.ejemplo20(
columna1
)values(
1);

CREATE TABLE IF NOT EXISTS ejemplo1.persona (
  `tipo_documento` VARCHAR(10) NOT NULL,
  `numero_documento` VARCHAR(45) NOT NULL,
 primer_nombre varchar(40) not null,
segundo_nombre varchar(40),
primer_apellido varchar(40) not null,
segundo_apellido varchar(40),
sexo enum('femenino','masculino'),
  PRIMARY KEY (`tipo_documento`, `numero_documento`)
);

create table ejemplo1.carro(
matricula varchar(20) primary key not null,
modelo date,
marca varchar(40),
cilindraje int,
color varchar(20),
`tipo_documento_FK` VARCHAR(10) NOT NULL,
`numero_documento_FK` VARCHAR(45) NOT NULL,
FOREIGN KEY (tipo_documento_FK,numero_documento_fk) REFERENCES ejemplo1.persona(tipo_documento,numero_documento)
);
INSERT INTO `ejemplo1`.`persona`
(`tipo_documento`,
`numero_documento`,
`primer_nombre`,
`segundo_nombre`,
`primer_apellido`,
`segundo_apellido`,
`sexo`)
VALUES
('cc',
'8089234789',
'hernando',
'enrique',
'moreno',
'moreno',
'femenino'
);
INSERT INTO `ejemplo1`.`carro`
(`matricula`,
`modelo`,
`marca`,
`cilindraje`,
`color`,
`tipo_documento_FK`,
`numero_documento_FK`)
VALUES
('aaa123',
'1950-01-01',
'mazda',
120,
'negro',
'cc',
'8089234789');



