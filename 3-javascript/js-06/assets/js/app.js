// console.log(document.URL);

//   getElementById()
console.log(document.getElementById('titulo'));
const titulo = document.getElementById('titulo');
console.log(titulo.textContent);
titulo.style.color = "blue";

console.log(document.getElementById('parrafo1'));
const parrafo1 = document.getElementById('parrafo1');
console.log(parrafo1.textContent);

parrafo1.textContent = "hola desde el parrafo 1";
console.log(parrafo1.textContent);
console.log(parrafo1.style);

parrafo1.style.color = "red";
parrafo1.style.backgroundColor = "yellow";

//querySelector()
// etiqueta = p
// 


const parrafo2 = document.querySelector('.parrafo');

console.log(parrafo2.textContent);
//  el signo \n inserta un salto de linea = <br>
parrafo2.textContent += "\n Modificando el contenido desde JavaScript";
parrafo2.style.backgroundColor = "green;" 

//querySelectorAll()
 const parrafos = document.querySelectorAll('p');
 console.log(parrafos);

 parrafos[2].style.fontSize = '2rem';
 parrafos[1].style.border;

 //css - font-size
 //js    fontSize   => en JS se utiliza camelCase

//Modificar los atributor de html
const enlace = document.getElementById('enlace');
console.log(enlace.href);

enlace.href="https://www.youtube.com";
enlace.target = "_blank";
enlace.textContent = "enlace de youtube";

// Reemplazar contenido
const parrafo4 = document.getElementById('parrafo4');
console.log(parrafo4.nodeName);
console.log(parrafo4.textContent);
console.log(document.body.innerHTML); //innerHTML muestra el html en el interior del elemento
console.log(parrafo4.outerHTML); //outerHTMl muestra el contenido html, incluyendo al elemento

// parrafo4.outerHTML = '<a href= "http://google.com">Enlace</a>'

// parrafo4.outerHTML = '<div class="elemento">Este es undiv</div>';


//metodo de classList
console.log(parrafo4.classList.contains("elemento"));
parrafo4.classList.add('elemeto');

const cambiarColor = () =>{
    parrafo4.classList.add('elemento');
}
cambiarColor();

//método toggle
const cambiarColor = () =>{
    parrafo4.classList.toggle('elemento');
}
cambiarColor(); //se agrega la clase
cambiarColor(); //se quita la clase
