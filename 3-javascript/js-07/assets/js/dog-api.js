//URLs para consumir
const urlAleatorios = "https://dog.ceo/api/breeds/image/random"
//Elementos del DOM
const imagenPerrito = document.getElementById("img-perrito");
console.log(imagenPerrito);

 const btn = document.getElementById("btn-perrito")
 console.log(btn);

 //EVENTOS
 btn.addEventListener("click", ()=>{
    console.log("boton presionado");
    //AGREGAR LA FUNCIONALIDAD
    obtenerPerritoAleatorio(urlAleatorios)
    
 })


//FUNCIONES
async function obtenerPerritoAleatorio(url){
    const respuesta = await fetch (url) 
    const datos = await respuesta.json() 
    console.log(datos); 
    console.log(datos.message);
    console.log(datos.status);

    imagenPerrito.src =datos.message
}
