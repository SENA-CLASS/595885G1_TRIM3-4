--ejemplos de laves primarias

create table ejemplo1.ejemplo30(
columna1 int primary key
);

create table ejemplo1.ejemplo31(
columna1 int,
primary key (columna1)
);

create table ejemplo1.ejemplo32(
columna1 int,
CONSTRAINT llave_primaria  primary key (columna1)
);

