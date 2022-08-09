const urlAleatorio = "https://cdn2.thecatapi.com/images/e61.jpg"

const imagenGatito = document.getElementById("img-gatito");
const btn = document.getElementById("btn-gatito");
console.log((btn));

btn.addEventListener("clic",()=> {
    console.log("boton presionado");
})



async function obtenerGatitoAleatorio(urlAleatorio) {
    const respuesta = await fetch(urlAleatorio)
    const datos = await respuesta.json()
    
    imagenGatito.src=datos[0].url;
    
}
