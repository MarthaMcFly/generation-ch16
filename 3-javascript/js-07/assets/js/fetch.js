const url = "https://dog.ceo/api/breeds/image/random";

//respuesta de la peticion
fetch(url).then((respuesta) =>{
    console.log(respuesta);
})

//obtener la información de la peticion FORMA 1
fetch(url)
.then((respuesta) => respuesta.json())
.then((datos) =>{
    console.log(datos);
}).catch((error)=>{
    console.log(error);
})

//obtener la información de la peticion FORMA2
async function obtenerPerritoAleatorio() {
    try{
    const respuesta = await fetch(url);
    const datos = await respuesta.json()
    console.log(datos);
    } catch(error){
        console.log(error);
    }
}
obtenerPerritoAleatorio()