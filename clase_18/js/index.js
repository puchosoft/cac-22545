// Diferentes niveles de LOG

console.log('Diferentes niveles de LOG');
console.log('-------------------------');
var n = 0;
console.log(n + ' -> log normal');
n = n + 1; // Se incrementa el valor de la variable n
console.info(n + ' -> log informativo');
n = n + 1;
console.warn(n + ' -> log advertencia');
n = n + 1;
console.error(n + ' -> log de error');
console.log('\n');

// Esto es un comentario de una sola linea

/* Esto es
un comentario
de varias
lineas */

// Los nombre de variables son sensibles a minusculas y mayusculas
console.log('Salidas de variables con nombre "parecidos":');
auto = 'Corsa';
Auto = 'Onix';
console.log(auto);
console.log(Auto);
console.log('\n');

// Tipos de datos
console.log('Salidas de tipos de datos:');
console.log('--------------------------');
n = 10;
x = 23.7;
f = 'Una frase';
p = "Murcielago";
b = true;

console.log(n + " es de tipo " + typeof(n));
console.log(x + " es de tipo " + typeof(x));
console.log(f + " es de tipo " + typeof(f));
console.log(p + " es de tipo " + typeof(p));
console.log(b + " es de tipo " + typeof(b));
console.log('\n');

// En JS los tipos son dinamicos
console.log('Las variable tienen tipos "dinamicos"');
console.log('-------------------------------------');
f = 18;
b = 'perro';
x = false;
console.log(f + " es de tipo " + typeof(f));
console.log(b + " es de tipo " + typeof(b));
console.log(x + " es de tipo " + typeof(x));
console.log('\n');

// Operadores aritmeticos
console.log('Operadores ARITMETICOS');
console.log('----------------------');
console.log('5 + 6 es igual a ' + (5 + 6));
console.log('5 - 6 es igual a ' + (5 - 6));
console.log('5 x 6 es igual a ' + (5 * 6));
console.log('5 / 6 es igual a ' + (5 / 6));
console.log('\n');
console.log('5 / 0 es igual a ' + (5 / 0));
console.log('Suma:\t\t\t' + (78*43));
console.log('ARRIBA\nABAJO');

// document.write() envia contenido al documento HTML del navegador
document.write('<h5 style="color:red;">'+'El resto de dividir 734 entre 28 es '+ (734 % 28)+'</h5>');

n = (n + 1);
n++; // Incrementar
document.write('n ahora vale ' + n + '<br>'); // salida -> 'n ahora vale 12<br>'

n--; // Decrementar
document.write('n ahora vale ' + n + '<br>');

// Operadores de relacion (o de comparacion)
// SIEMPRE devuelven un valor logico o booleano

// a == b - igualdad
// a != b - desigualdad
// a < b - menor que
// a > b - mayor que
// a >= b - mayor o igual que
// a <= b - menor o igual que
