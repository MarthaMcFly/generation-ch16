//URL a consumir
//1 crear una constante para el enlace

const urlPokemon = "https://pokeapi.co/api/v2/pokemon/"


// --------------ELEMENTOS DEL DOM
const imgPokemon = document.getElementById("img-pokemon");
console.log(imgPokemon); //son para comprobar que la imagen que imprime luego se puede borrar

const idPokemon = document.getElementById("id-pokemon");
const nombrePoke = document.getElementById("nombre-pokemon");
const listaHabilidades = document.getElementById("lista-habilidades");
const listaTipos = document.getElementById("lista-tipos");

const formulario = document.getElementById("buscador-pokemon");
console.log(formulario);


//  EVENTOS

formularioPokemon.addEventListener('submit', (e) => {
    e.preventDefault()
    
    const inputPokemon = document.getElementById("busqueda-pokemon");
    console.log(inputPokemon.value);

    const nuevaBusqueda = urlPokemon + inputPokemon.value 
    obtenerPokemon(nuevaBusqueda);
    })

// urlPokemon = inputPokemon.value
// console.log(urlPokemon);

//funciones
try{
    
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
        habilidadades: datos.abilities,
        id: datos.id ,
        tipos: datos.types ,
        imagen: datos.sprites.other["official-artwork"].front_default 
    } 
    //imagen, nombre y ID
    imgPokemon.src = pokemon.imagen;
    idPokemon.textContent = `ID: ${pokemon.id}`;
    nombrePoke.textContent = pokemon.nombre

    // lista habilidades
// console.log(pokemon.habilidadades);


    let template = ``

    for (let i=0; i <pokemon.habilidadades.length; i++){
        const nombreHabilidad = pokemon.habilidadades[i].ability.name;
        // console.log(nombreHabilidad);
        template += `<li class="list-group-item"> ${nombreHabilidad} </li>`
    }
    listaHabilidades.innerHTML = template;

        //TIPOS
    
        // console.log(pokemon.tipos);
        let templateTipos = ``
        pokemon.tipos.forEach((tipo) => {
            const nombreTipo = tipo.type.name;
            templateTipos += `<li class="list-group-item"> ${nombreTipo} </li>`
        })  
        listaTipos.innerHTML = templateTipos;
}

}catch(e){
    alert("pokemon no valido");
}








