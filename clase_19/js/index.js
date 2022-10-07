// Funcion PROMPT <- Ingreso de datos

var nombre;

/*
nombre = prompt("Ingrese su nombre de pila");
console.log(nombre);
document.write(nombre + "<br>");

a = parseInt(prompt("Ingrese 1º sumando"));
b = parseInt(prompt("Ingrese 2º sumando"));
console.log(a + b);

a = parseFloat(prompt("Ingrese 1º sumando"));
b = parseFloat(prompt("Ingrese 2º sumando"));
console.log(a + b);


a = parseInt(prompt("Ingrese el nº hexadecimal"),16);
console.log(a);


a = 123;
b = 4;

console.log(a.toString() + b.toString());
console.log(a + b);
console.log(a.toFixed(4));

console.log(Number("9.56"));
console.log(Number("8"));
a = Number(new Date("2022-10-05"));
b = (((((a / 1000)/60))/60)/24)/365;
console.log(b + " años");

*/

// Operadores de relacion
// == != < > <= >= ===

// Operadores Logicos
// AND (y)
console.log(true && false);
console.log(false && true);

// OR (o)
console.log(true || false);
console.log(false || true);

// NOT (no)
console.log(!false);
console.log(!true);

// Ejemplo practico de LOGICA

a = (6 > 2) && ("abeja" > "Andres");
console.log(a);

var altura = parseFloat(prompt("Ingrese su altura en mts"));

var puerta = 2.0; // Altura de la puerta en mts

// CONDICIONAL
if (altura <= puerta) {
    console.log("Puede pasar por la puerta");
}
else {
    console.log("No puede pasar por la puerta");
}

