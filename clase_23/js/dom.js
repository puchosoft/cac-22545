
/*
Uso: parrafo(string contenido)
El contenido se usará como texto de un parrafo HTML
*/
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

// PROGRAMA PRINCIPAL

d = document.getElementById('div1');

d.textContent = 'DIV modificado';
d.style.color = 'red';
d.style.border = '1px solid blue';

s = document.getElementsByTagName('span')[0];
s.innerHTML = 'SPAN Modificado';
s.style.margin = '10px 0px';
s.style.background = 'green';

p = document.getElementsByClassName('par1')[0];
p.textContent = 'Parrafo modificado';

body = document.body;
// body.removeChild(p); --> elimina el objeto de su objeto padre

