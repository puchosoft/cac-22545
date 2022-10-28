# SQL

# DDL - Data Definition Languaje (Lenguaje de Definicion de Datos)
# DML - Data Manipulation Languaje (Lenguaje de Manipulacion de Datos)
# DCL - Data Control Languaje (Lenguaje de Control de Datos)
# TCL - Transactional Control Languaje (Lenguaje de Control de Transacciones)

# La meta de esta unidad de SQL es hacer un CRUD
# Create - Alta
# Read - Leer
# Update - Actualizar o modificar
# Delete - Borrar

# Listar las BBDD
SHOW DATABASES;

# Crear una BBDD
CREATE DATABASE bd_temporal;

# Seleccionar una BBDD (por defecto)
USE bd_temporal;

# Listar las tablas de una BBDD
SHOW TABLES;

# Eliminar una BBDD
DROP DATABASE bd_temporal;

# BBDD de la comision 22545
CREATE DATABASE c22545
    DEFAULT CHARACTER SET utf8
    COLLATE utf8_spanish_ci;

# Modificar configuracion de una BBDD
ALTER DATABASE c22545
    DEFAULT CHARACTER SET utf8
    COLLATE utf_spanish_cs;
