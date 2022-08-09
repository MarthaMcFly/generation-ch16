//crear un elemento
const imagen = document.createElement('img');
console.log(imagen);

//Modificar los atributos html del elemento
imagen.src ='https://placeimg.com/200/200/animals';
imagen.alt ='imagenes aleatorias de animalitos';


//se inserta el elemento: 1
document.body.appendChild(imagen);
// document.body.insertAdjacentElement("afterbegin",imagen); 
// document.body.insertAdjacentElement("afterend",imagen);
// document.body.insertAdjacentElement("beforebegin",imagen);
// document.body.insertAdjacentElement("beforeend",imagen);


// FORMA CORRECTA DE CREAR E INSERTAR UN ELEMENTO 
//1. SE CREA EL ELEMENTO QUE CONTENDRÁ LA IMAGEN
//2. SELECIONAR EL ELEMENTO PADRE

const padreImg = document.getElementById('padreImg');

//3.Crear el elemento 
const imagen2 =document.createElement('img');

//4. Modificamos los atributos del elemento 
imagen2.src = 'https://placeimg.com/200/200/animals';
imagen2.alt = "imagenes de naturaleza";

//5. Insertar elemento
padreImg.appendChild(imagen2);

//utilizar for Each para pintar datos 
const frutas = ["toronja", "manzana", "mandarina", "limon", "granada", "melon", "platano", "guayaba"];
const listaFrutas =document.getElementById('frutas');
/*     FORMA 1
frutas.forEach((element) => {
    const li = document.createElement('li');
    li.textContent = element
    listaFrutas.appendChild(li);
}); */

//   FORMAR 2
frutas.forEach((el) => {
    listaFrutas.innerHTML += `<li>${el}</li>`;
}) 

// Las dos formas son funciones (interaciones) para agregar el arreglo al elemento.
