# Leer registros ( LEER - READ)

# SELECT campo1, campo2, campo3
#   FROM tabla;

# Todos los campos de la tabla (y todos los registros)
SELECT * FROM clientes;

# Todos los campos y registros de la tabla cuyo email contenga "con"
SELECT * FROM clientes
    WHERE email LIKE "%con%";

# Todos los campos de la tabla cuyo email este VACIO
SELECT * FROM clientes
    WHERE email IS NULL;

# Todos los campos de la tabla cuyo email NO este VACIO
SELECT * FROM clientes
    WHERE email IS NOT NULL;

# Todos los campos de la tabla cuyo email NO este VACIO, limitado a 3 registros.
SELECT * FROM clientes
    WHERE email IS NOT NULL
    LIMIT 3;

# Todos los campos de la tabla cuyo id cumpla ambas condiciones
SELECT * FROM clientes
    WHERE id>1 and id<5;

# Todos los campos de la tabla cuyo id se encuentre entre 1 y 5
SELECT * FROM clientes
    WHERE id>=1 and id<=5;

# IDEM anterior pero usando BETWEEN
SELECT * FROM clientes
    WHERE id BETWEEN 1 and 5;

# Todos los campos de la tabla cuyo id se encuentre fuera del rango 4 a 6
SELECT * FROM clientes
    WHERE id<4 or id>6;

# Todos los campos de la tabla cuyo id se encuentre en el conjunto indicado
SELECT * FROM clientes
    WHERE id IN(2,3,5);

# Todos los campos de la tabla cuyo id NO se encuentre en el conjunto indicado
SELECT * FROM clientes
    WHERE id NOT IN(2,3,5);

# Todos los campos de la tabla cuyo id NO se encuentre en el conjunto indicado,
# ordenando por campo nombre (ascendente)
SELECT * FROM clientes
    WHERE id NOT IN(2,3,5)
    ORDER BY nombre;

# Todos los campos de la tabla cuyo id NO se encuentre en el conjunto indicado,
# ordenando por campo apellido (descendente)
SELECT * FROM clientes
    WHERE id NOT IN(2,3,5)
    ORDER BY apellido DESC;


SELECT nombre AS Nombre, email AS Correo_electronico FROM clientes
    WHERE id > 1;

# Agrupamiento por campo email, mostrando conteo y email
# Los id deben ser mayores que 1
SELECT count(*) AS Cantidad, email FROM clientes
    WHERE id>1
    GROUP BY email;

# Agrupamiento por campo email, mostrando conteo y email
# La salida se ordena por Cantidad (descendente) y se limita a 3 lineas (TOP THREE)
SELECT count(*) AS Cantidad, email FROM clientes
    GROUP BY email
    ORDER BY Cantidad DESC, email
    LIMIT 3;
