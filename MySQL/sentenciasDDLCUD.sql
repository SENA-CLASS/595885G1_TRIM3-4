-- ejemplos de sentencias dml insert, update y delete

-- basico
INSERT INTO `a`.`persona`
(`tipo_documento`,
`numero_documento`,
`nombre_completo`)
VALUES
('cc','345345236','jose algo'),
('cc','345345232','jose algo'),
('cc','345345237','jose algo'),
('cc','345345238','jose algo'),
('cc','345345239','jose algo')

;

-- basico
INSERT INTO `a`.`persona`
(`tipo_documento`,
`numero_documento`
)
VALUES
('cc',
'34534523');

-- copia de una tabla
CREATE TABLE a.`persona2` (
  `tipo_documento` varchar(20) NOT NULL,
  `numero_documento` varchar(20) NOT NULL,
  `nombre_completo` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`tipo_documento`,`numero_documento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into a.persona2
select * from a.persona;

-- select con set
insert into a.persona
set tipo_documento='CE', numero_documento='345245254', nombre_completo='adsfsadf';

-- sentencia replace
replace INTO `a`.`persona`
(`tipo_documento`,
`numero_documento`,
`nombre_completo`)
VALUES
('NIT',
'4352354354',
'sena ceet');

-- update

UPDATE `a`.`persona`
SET
`tipo_documento` = 'NITttt',
`numero_documento` = '34534523588',
`nombre_completo` = 'sena sur'
WHERE `tipo_documento` = 'NIT' AND `numero_documento` = '4352354354';

create table a.eje(
num int not null);
insert into a.eje(num) values (1),(2),(3),(4),(5),(6);

select * from a.eje 
order by num asc;

delete from a.eje
where num>2
order by num
limit 5;






