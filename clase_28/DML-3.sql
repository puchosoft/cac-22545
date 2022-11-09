# INNER JOIN (interseccion)
# Mostrar todos los alumnos que tengan escuela, con los datos de la escuela.
SELECT a.nombre, a.nota, a.grado, e.localidad, e.provincia
    FROM alumnos as a INNER JOIN escuelas as e
    ON a.id_escuela = e.id;


# LEFT JOIN (interseccion + alumnos sin escuela)
# Mostrar todos los alumnos tengan escuela o no, con los datos de la escuela.
SELECT a.nombre, a.nota, a.grado, e.localidad, e.provincia
    FROM alumnos as a LEFT JOIN escuelas as e
    ON a.id_escuela = e.id;


# RIGHT JOIN (interseccion + escuelas sin alumnos)
# Mostrar todas las escuelas tengan alumnos o no, con los datos de los alumnos.
SELECT a.nombre, a.nota, a.grado, e.localidad, e.provincia
    FROM alumnos as a RIGHT JOIN escuelas as e
    ON a.id_escuela = e.id;


# FULL JOIN (simulado con una UNION)
# Mostrar todos los alumnos (tengan escuela o no) y todas las escuelas (tengan alumnos o no)
SELECT a.nombre, a.nota, a.grado, e.localidad, e.provincia
    FROM alumnos as a LEFT JOIN escuelas as e
    ON a.id_escuela = e.id

UNION

SELECT a.nombre, a.nota, a.grado, e.localidad, e.provincia
    FROM alumnos as a RIGHT JOIN escuelas as e
    ON a.id_escuela = e.id;

# DIFERENCIA IZQUIERDA
# Todos los alumnos que no tienen escuela.
SELECT a.nombre, a.nota, a.grado, e.localidad, e.provincia
    FROM alumnos as a LEFT JOIN escuelas as e
    ON a.id_escuela = e.id
    WHERE a.id_escuela IS NULL;

# DIFERENCIA DERECHA
# Todas las escuelas que no tiene alumnos.
SELECT a.nombre, a.nota, a.grado, e.localidad, e.provincia
    FROM alumnos as a RIGHT JOIN escuelas as e
    ON a.id_escuela = e.id
    WHERE a.id_escuela IS NULL;


# DIFERENCIA SIMETRICA
# Mostrar todos los alumnos que no tienen escuela y todas las escuelas que no tienen alumnos.
SELECT * FROM
(
SELECT a.nombre, a.nota, a.grado, e.localidad, e.provincia
    FROM alumnos as a LEFT JOIN escuelas as e
    ON a.id_escuela = e.id

UNION

SELECT a.nombre, a.nota, a.grado, e.localidad, e.provincia
    FROM alumnos as a RIGHT JOIN escuelas as e
    ON a.id_escuela = e.id
) as full_join
WHERE localidad IS NULL OR nombre IS NULL;
    
