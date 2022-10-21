
function parrafo(contenido) {
    document.write('<p>'+ contenido + '</p>');
}

// ============================================
/*
Modelo de Objeto de Documento
Es una API de programacion para documentos HTML y XML
Ofrece una representacion estructurada del documento y facilita su conexion con scripts.
Ofrece acceso a las propiedades, metodos y eventos de todos los objetos del documento.
*/

// la_casa_de_mi_papa = 12  -> Forma standar de nombres
// laCasaDeMiPapa = 23 -> nombres "camel case"
// Persona -> Cuando la inicial de un nombre es mayuscula se trata de una clase


// La palabra "this" es una referencia al objeto que llama a la funcion.

// Funcion que cambia el color de fondo de un elemento
function fondoRojo (){
    this.style = 'background: red';
}

// Funcion que resetea el color de fondo de un elemento
function fondoOriginal (){
    this.style = 'background: initial';
}

// Funcion que devuelve un nº entero al azar entre 0 y n
function random(n){
    return Math.floor(Math.random() * (n+1));
}

// Funcion que cambia el color de fondo del BODY en forma aleatoria
function fondoBodyRandom() {
    let color = 'rgb(' + random(255) + ',' + random(255) + ',' + random(255) + ')';
    document.body.style.backgroundColor = color;
}

// Funcion que verifica si el valor de un elemento es negativo
function verificarPositivos(){
    if(parseInt(this.value) < 0){
        alert('El numero no puede ser negativo');
    }
}

// PROGRAMA PRINCIPAL

// Obtener el objeto boton (el primero que encuentra)
var boton = document.querySelector('button');

/*
boton.onclick = function(){
    alert('Hola usuario!');
}
*/

// Configura una accion para el evento
// Mouse pasa por arriba del elemento
boton.onmouseover = fondoRojo;

// Configura una accion para el evento
// Mouse sale de arriba del elemento
boton.onmouseleave = fondoOriginal;

// Configura una accion para el evento
// Mouse hace click en elemento
boton.onclick = fondoBodyRandom;

// Configura una accion para el elemento
// usa el metodo addEventListener()
var input1 = document.getElementById('input1');
input1.addEventListener('change',verificarPositivos);

// Remueve un atendedor del evento change del elemento input1
// input1.removeEventListener('change',verificarPositivos);

// --------------------------------

// Lee los valores de los inputs del formulario
// Calcula un valor total
// Visualiza el total en un input especial
function mostrarTotal(event){
    event.preventDefault();
    let precio = parseFloat(document.getElementById('precio').value);
    let cantidad = parseInt(document.getElementById('cantidad').value);
    //alert('Total: ' + precio * cantidad);
    let total = precio * cantidad;
    document.getElementById('total').value = total;
}

// Limpia los 3 imputs del formulario
// Es una alternativa al boton reset
function limpiarTodo(){
    document.getElementById('precio').value = '';
    document.getElementById('cantidad').value = '';
    document.getElementById('total').value = '';
}

/* Forma larga de asignar un evento a un objeto
btn_calcular = document.getElementById('btn_calcular');
btn_calcular.addEventListener('click', mostrarTotal);
*/

// Forma corta de asignar un evento a un objeto
document.getElementById('btn_calcular').addEventListener('click', mostrarTotal);
document.getElementById('limpiar_artesanal').addEventListener('click', limpiarTodo);

// Configura una accion sincronica (cada tantos milisegundos)
window.setInterval(fondoBodyRandom, 3000);

// Configura una accion para el evento "Cuando se carga la pagina"
window.addEventListener('load',function(){
    alert('Pagina cargada');
})


