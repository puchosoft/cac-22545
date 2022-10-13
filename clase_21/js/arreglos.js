function parrafo(contenido) {
    document.write('<p>'+ contenido + '</p>');
}

// ============================================

/*
Arrays (arreglos) es un tipo de coleccion de datos
*/

// Lunes
var caja = 32000;

// Martes
var caja = 35000;

// Nuevo arreglo vacio llamado "alturas"
var alturas = new Array();

// Nuevo arreglo de 5 elementos llamado "edades"
var edades = new Array(5);

// Nuevo arreglo de 3 elementos de valor conocido llamado "nombres"
var nombres = new Array("Domingo", "Juana", "Silvia");

// Definicion de arreglos al estilo antiguo (programacion estructurada)
var apellidos = ["Gomez", "Perez", "Garcia"];

var ganancias = [];

// LOS INDICES DE LOS ARREGLOS SIEMPRE INICIAN EN CERO
// SIEMPRE EL INDICE MAXIMO ES IGUAL A ... TAMAÑO - 1

var caja_semanal = [
    20000, // Domingo
    23000, // Lunes
    25000, // Martes
    21000, // Miercoles
    32000, // Jueves
    23000, // Viernes
    27000  // Sabado
];

parrafo("La recaudacion del domingo fue de $" + caja_semanal[0]);

parrafo("La recaudacion del sabado fue de $" + caja_semanal[6]);

parrafo("La recaudacion del miercoles fue de $" + caja_semanal[3]);

parrafo("El tamaño o longitud del arreglo es " + caja_semanal.length);

parrafo(caja_semanal[7]);
parrafo(caja_semanal[-2]);

caja_semanal[3] = 45000;
parrafo("La recaudacion del miercoles fue de $" + caja_semanal[3]);

parrafo("El ultimo valor del arreglo es " + caja_semanal[caja_semanal.length - 1]);


// Recorrer por completo un arreglo
for (let i=0; i < caja_semanal.length; i++) {
    parrafo(i + " -> " + caja_semanal[i]);
}

// Agregar elementos al final del arreglo
parrafo(alturas.length + " -> " + alturas);

alturas.push(1.76);
parrafo(alturas.length + " -> " + alturas);

alturas.push(1.58);
parrafo(alturas.length + " -> " + alturas);

alturas.push(1.64);
parrafo(alturas.length + " -> " + alturas);

// Eliminar elementos al final del arreglo
x = alturas.pop();
parrafo(alturas.length + " -> " + alturas);
parrafo("Elemento eliminado: "+ x);

// Agregar valores al inicio del arreglo
alturas.unshift(1.88);
parrafo(alturas.length + " -> " + alturas);

// Eliminar valores al inicio del arreglo
alturas.shift();
parrafo(alturas.length + " -> " + alturas);

// Indice de la 1ra aparicion
parrafo(caja_semanal.indexOf(23000, 0));

// Indice de la ultima aparicion
parrafo(caja_semanal.lastIndexOf(23000));

parrafo("==============================");

// Otros recorridos de arreglos

// Recorrido obteniendo claves (indices)
for (k in caja_semanal) {
    parrafo(k + " -> " + caja_semanal[k]);
}

parrafo("==============================");
// Recorrido obteniendo valores (contenidos)
for (v of caja_semanal) {
    parrafo(v);
}

/*
Paradigmas de programacion
--------------------------
Programacion lineal
Programacion estructurada
Programacion funcional
Programacion Orientada a Objetos (POO)
Programacion modal
*/

frase = 'La casa pintada de azul.';
parrafo(frase[3]);
parrafo(frase.length);
parrafo(frase);
frase[3] = 'K'; // No funciona porque no es un arreglo
parrafo(frase);

// Definicion de un OBJETO
var cacho = {
    nombre: "Carlos",
    edad: 47,
    ocupacion: "plomero"
}

parrafo(typeof(frase));
parrafo(typeof(caja_semanal));
parrafo(typeof(cacho));

parrafo("La edad de Cacho es " + cacho.edad);

// Recorrido de un objeto
for(key in cacho){
    parrafo(key + " -> " + cacho[key]);
}

primer_h1 = document.getElementsByTagName('h1')[0];
console.log(primer_h1);
primer_h1.textContent = "JavaScript V - Hasta la proxima!";
