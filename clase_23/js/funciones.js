
/*
Uso: parrafo(string contenido)
El contenido se usará como texto de un parrafo HTML
*/
function parrafo(contenido) {
    document.write('<p>'+ contenido + '</p>');
}

// ============================================

/* Funciones
Ventajas:
---------
Codigo mas legible
Codigo mas corto
Reutilizacion del codigo
Encapsulamiento (actualizaciones y debug)
Modularizacion de las tareas
*/

// Declaracion de funcion clasica
function cuadrado1(n){
    let resultado;
    resultado = n * n;
    return resultado;
}

// Declaracion de funcion con expresion
cuadrado2 = function (n){
    return n * n;
}

// Declaracion de funcion arrow (flecha)
cuadrado3 = n => n * n;

// PROGRAMA PRINCIPAL


parrafo('Hola');
parrafo(cuadrado1(8));
parrafo(cuadrado2(7));
parrafo(cuadrado3(6));
// parrafo(n); --> produce error variable no definida

