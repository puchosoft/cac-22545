# Listar tablas de una BBDD
SHOW TABLES;

# Crear una tabla
CREATE TABLE clientes (
    id int AUTO_INCREMENT,
    nombre varchar(30) DEFAULT "--",
    apellido varchar(30) NOT NULL,
    dni int(8) UNIQUE,
    fecha_nac date,
    PRIMARY KEY (id)
);

# Tipos de datos SQL
# https://www.w3schools.com/sql/sql_datatypes.asp

# Ver la estructura de una tabla
DESCRIBE clientes;

# Eliminar una tabla (y su contenido)
DROP TABLE clientes;

# Eliminar un campo de una tabla (y su contenido)
ALTER TABLE clientes
    DROP COLUMN fecha_nac;

# Agregar un campo a una tabla
ALTER TABLE clientes
    ADD COLUMN fecha_nac date;

# Modificar un campo de una tabla
ALTER TABLE clientes
    MODIFY COLUMN dni int(16);

# Eliminar todos los registros de una tabla (su contenido)
TRUNCATE clientes;
