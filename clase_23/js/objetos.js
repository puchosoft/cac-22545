
/*
Uso: parrafo(string contenido)
El contenido se usará como texto de un parrafo HTML
*/
function parrafo(contenido) {
    document.write('<p>'+ contenido + '</p>');
}

// ============================================
/*
Un objeto representa a una entidad del mundo real
Un objeto tiene propiedades
Un objeto tiene comportamientos o funcionalidades (metodos)
*/

// PROGRAMA PRINCIPAL

pepe = {
    nombre: 'Jose',
    edad: 45,
    peso: 83,
    dni: 34567890,
    cumplirAnios: function() {
        this.edad++;
    }
}

parrafo(pepe['nombre']);
parrafo(pepe['dni']);

parrafo(pepe.peso);
pepe.cumplirAnios();
parrafo('Edad de Pepe: ' + pepe.edad);

mecha = new Object;
mecha['nombre'] = 'Mercedes';
mecha.edad = 37;
mecha['edad'] = 38;

