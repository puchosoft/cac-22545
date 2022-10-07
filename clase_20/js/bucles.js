function parrafo(contenido) {
    document.write('<p>'+ contenido + '</p>');
}

/*
var n = 9;
var i = 0;
parrafo('Tabla de nº '+ n)
parrafo(n + ' x ' + i + ' = ' + n * i++);
parrafo(n + ' x ' + i + ' = ' + n * i++);
parrafo(n + ' x ' + i + ' = ' + n * i++);
parrafo(n + ' x ' + i + ' = ' + n * i++);
parrafo(n + ' x ' + i + ' = ' + n * i++);
parrafo(n + ' x ' + i + ' = ' + n * i++);
parrafo(n + ' x ' + i + ' = ' + n * i++);
parrafo(n + ' x ' + i + ' = ' + n * i++);
parrafo(n + ' x ' + i + ' = ' + n * i++);
parrafo(n + ' x ' + i + ' = ' + n * i++);
*/

//  +--------+
//  | Bucles |
//  +--------+

//  Bucle FOR (fijo o definido)
var n = 9;
parrafo('Tabla de nº '+ n);

for(let i = 0 ; i < 10; i++) {
    parrafo(n + ' x ' + i + ' = ' + n * i);
    // i *= 2; NO SE RECOMIENDA ALTERAR LA VARIABLE DE CONTROL
}

//  Bucle WHILE (condicional al inicio)
var tanque = 300;
var agua = 234;
var balde = 10.5;
while(agua <= (tanque - balde)){
    agua += balde; 
    parrafo(agua + ' l')
}
parrafo('Ahora el tanque contiene '+ agua + ' litros.');

//  Bucle DO .. WHILE (condicional al final)
dist_pared = 4.7;
paso = 0.96;
do {
    dist_pared -= paso;
    parrafo('Distancia a la pared: '+ dist_pared);
} while (dist_pared >= paso);


//  BREAK (detener) y CONTINUE (saltar al proximo paso)
// Uso de CONTINUE para hacer excepciones dentro de los bucles
parrafo('El numero 17 me cae mal (y el 8 tambien).');
for(let i = 1; i<21 ; i++){
    if (i == 8 || i == 17)
        continue;
    parrafo('i = ' + i);
}

// Uso de BREAK para detener un bucle
parrafo('Los numeros mayores a 13 me caen mal.');
for(let i = 1; i<21 ; i++){
    if (i > 13)
        break;
    parrafo('i = ' + i);
}

//  Bucles anidados

// Este bucle repite 3 veces el mismo cuadradito
for(let j=0; j<3 ; j++){
    // Este bloque hace un cuadradito
    document.write('-------<br>');
    for(let i=0; i<5 ; i++){
        document.write('|*****|<br>');
    }
    document.write('-------<br>');
    document.write('<br>');
}
