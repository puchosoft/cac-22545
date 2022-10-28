# Crear una nueva tabla
CREATE TABLE sucursales (
    id int AUTO_INCREMENT,
    nombre varchar(50),
    domicilio varchar(50),
    localidad varchar(15),
    provincia varchar(10),
    PRIMARY KEY (id)
);

# Agregar un CAMPO para la FK
ALTER TABLE clientes
    ADD id_sucursal int;

# Declarar un campo como FK
ALTER TABLE clientes
    ADD FOREIGN KEY (id_sucursal)
        REFERENCES sucursales(id);
