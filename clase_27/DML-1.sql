# DML - Agregar datos (ALTA - CREATE)

# INSERT INTO tabla 
#   (campo1, campo2, campo3)
#   VALUES (v1, v2, v3);

# Agrega UN SOLO registro
INSERT INTO clientes
    (nombre, apellido, email)
    VALUES ("Juan","Perez","jperez@dominio.com");

# Agrega VARIOS registros
INSERT INTO clientes
    (nombre, apellido, email)
    VALUES ("Maria","Dominguez","mdominguez@dominio.com"),
            ("Ana","Juarez","ajuarez@dominio.com"),
            ("Carlos","Herrera","cherrera@dominio.com");

# Borrar registros (BAJA - DELETE)
DELETE FROM clientes
    WHERE id=4;

INSERT INTO clientes
    (nombre, apellido, email)
    VALUES ("Carlos","Herrera","cherrera@dominio.com");

# Agrega un registro, forzando el id
# No se modifica el conteo de AUTO_INCREMENT
INSERT INTO clientes
    (id, nombre, apellido, email)
    VALUES (4, "Claudia","Sanchez","csanchez@dominio.com");

INSERT INTO clientes
    (id, nombre, apellido, email)
    VALUES (6, "Jorge","Martinez","jmartinez@dominio.com");

# Si bien el auto_increment habia quedado en 5
# El motor se da cuenta que el id=6 ya existe, y utiliza id=7
INSERT INTO clientes
    (nombre, apellido, email)
    VALUES ("Lucas","Vallese","lvallese@dominio.com");

INSERT INTO clientes
    (nombre, apellido, email)
    VALUES ("Ana","Gonzalez","agonzalez@dominio.com");

# Borrar registros (BAJA - DELETE)
# Borra los campos de la tabla cuyo nombre coincida con "ana"
DELETE FROM clientes
    WHERE nombre LIKE "ana";

# Modificar registros (MODIFICAR - UPDATE)
# Actualiza los campos email de la tabla cuyo nombre inicie con "c"
UPDATE clientes
    SET email = "Comienza con C"
    WHERE nombre LIKE "c%";

# Actualiza los campos email de la tabla, cuyo nombre finalice con "a"
UPDATE clientes
    SET email = "Termina en A"
    WHERE nombre LIKE "%a";

# Actualiza los campos email de la tabla, cuyo nombre contenga "r"
UPDATE clientes
    SET email = "Contiene R"
    WHERE nombre LIKE "%r%";

# Actualiza los campos email de la tabla, cuyo nombre contenga "l"
# No distingue si el nombre inicia, finaliza o contiene L, actualiza todos.
UPDATE clientes
    SET email = "Tiene L"
    WHERE nombre LIKE "%l%";

UPDATE clientes
    SET email = NULL
    WHERE nombre LIKE "jorge";
