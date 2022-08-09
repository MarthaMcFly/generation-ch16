// manejador de eventos
function saludar (params) {
    alert("hola");
}

//
const boton = document.getElementById('boton');
console.log(boton);

boton.addEventListener('click', (evento) => {
    // alert("holis")
    console.log(evento.target);
});

const formulario = document.getElementById('form');
formulario.addEventListener('submit', (evento) => {
    e.preventDefault();
    console.log(formulario[0].value);
})