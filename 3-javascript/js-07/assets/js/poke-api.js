//URL a consumir
//1 crear una constante para el enlace

const urlPokemon = "https://pokeapi.co/api/v2/pokemon/163"



//elementos del dom
const imgPokemon = document.getElementById("img-pokemon")
console.log(imgPokemon); //son para comprobar que la imagen que imprime luego se puede borrar

const idPokemon = document.getElementById("id-pokemon")
console.log(idPokemon);

const nombrePoke = document.getElementById("nombre-pokemon")
console.log(nombrePoke);


//funciones

async function obtenerPokemon(url) {
    const respuesta = await fetch(url)
    const datos = await respuesta.json()
    
   /*  console.log(datos);
    console.log(datos.forms[0].name);
    console.log(datos.abilities);
    console.log(datos.id);
    console.log(datos.types);
    console.log(datos.sprites.other["official-artwork"].front_default); */

    const pokemon = {
        nombre: datos.forms[0].name ,
        habilidadades: datos.abilities ,
        id: datos.id ,
        tipos: datos.types ,
        imagen: datos.sprites.other["official-artwork"].front_default 
    } 
    imgPokemon.src = pokemon.imagen;
    idPokemon.textContent = `ID: ${pokemon.id}`;
    nombrePoke.textContent = pokemon.nombre
}

obtenerPokemon(urlPokemon);
