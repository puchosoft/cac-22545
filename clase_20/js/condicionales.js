function parrafo(contenido) {
    document.write('<p>'+ contenido + '</p>');
}

//  +---------------+
//  | Condicionales |
//  +---------------+

//  Condicional SIMPLE
/*
if (expresion logica) {
    instruccion1;
    instruccion2;
    instruccion3;
}
*/
parrafo('Condicional simple');
a = 7;
if (a > 5) {
    parrafo(a + ' es mayor que 5');
}

//  Condicional COMPLETO
/*
if (expresion logica) {
    instruccion1;
    instruccion2;
    instruccion3;
}
else {
    instruccion4;
    instruccion5;
    instruccion6;
}
*/
parrafo('Condicional completo');
b = 3;
if (b > 5) {
    parrafo(b + ' es mayor que 5');
}
else {
    parrafo(b + ' no es mayor que 5');
}

//  Deficion de variables VAR - LET - CONST
parrafo('Contexto o SCOPE de una variable')
var x = 18;
parrafo(x);
{
    let y = 23;
    var z = 53;
    parrafo(x + ' ' + y);
}
parrafo(x + ' ' + z);

const m = 17;
{
    // m = 21;
    parrafo(m);
}

//  Operador condicional o ternario
var luz = 0.8; // Varia entre 0 y 1
// (expresion logica) ? valor_true : valor_false
var luminosidad = (luz >= 0.5) ? "claro" : "oscuro";  // "claro" u "oscuro"
parrafo(luminosidad);

//  Operadores de asignacion
// =    ->  asignacion estandar
// +=   ->  x += 8;
// -=   ->  z -= 2;
// *=
// /=
// %=

//  Condicionales ANIDADOS
peso_max = 100;
altura_min = 140;
peso = 102;
altura = 139;
// La persona ¿puede ingresar a la atraccion?
parrafo("¿Puede ingresar a la atraccion?");
if (peso <= peso_max){
    if (altura >= altura_min){
        parrafo("Puede ingresar");
    }
    else {
        parrafo("No puede ingresar por altura.");
    }
}
else {
    parrafo("No puede ingresar por peso.");
}

//  Condicionales en CASCADA
var mayoria = 18;
var jubilacion = 65;
var edad = 10;

if (edad < mayoria) {
    parrafo("Menor de edad");
}
else {
    if (edad < jubilacion){
        parrafo("En edad laboral");
    }
    else {
        parrafo("En edad jubilatoria");
    }
}

//  Condicional ANIDADO simplificado con op. logicos
peso_max = 100;
altura_min = 140;
peso = 102;
altura = 139;
// La persona ¿puede ingresar a la atraccion?
parrafo("¿Puede ingresar a la atraccion?");

if ((peso <= peso_max) && (altura >= altura_min)) {
    parrafo("Puede ingresar");
}
else {
    parrafo("No puede ingresar");
}

//  Condicional MULTIPLE - Simplificacion de CASCADAS
// 1 = cafe
// 2 = te
// 3 = matecocido
// 4 = chocolatada

var opcion = 1;

/*
if (opcion == 1) {
    parrafo('Sirvase su cafe');
}
else {
    if (opcion == 2) {
        parrafo('Sirvase su te');
    }
    else {
        if (opcion == 3) {
            parrafo('Sirvase su matecocido');
        }
        else {
            if (opcion == 4) {
                parrafo('Sirvase su chocolatada');
            }
            else {
                parrafo('*** Opcion no valida ***');
            }
        }
    }
}
*/

switch (opcion) {
    case 1:
        parrafo('Sirvase su cafe');
        break;
    case 2:
        parrafo('Sirvase su te');
        break;
    case 3:
        parrafo('Sirvase su matecocido');
        break;
    case 4:
        parrafo('Sirvase su chocolatada');
        break;
    default:
        parrafo('*** Opcion no valida ***');
}
