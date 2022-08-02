/* tipos de datos */
'use strict'// permite a JavaScript leer el código de forma escricta

//string
let cadena = "Hola Mundo!"; //local, solo se puede utiilzar dentro de la misma caja 
const b = 0; //local
var c; // es global, se puede usar dentro y fuera del bloque

// Scope - contexto   Espacio en el que vive la variable

//number
let numero = 5;

//boolean
let booleano = true
let booleano2 = false

// undefined - ausencia de valor
let variable;
console.log(variable)

// NaN - not a Number

//Nul -valor nulo. se puede utilizar más tarde
let vacio = null

/* Plantillas literales 
    template strings
    literal strings
    interpolacion de codigo
    */
console.log(`esta es una cadena ${5 + 4}`); // permite agregar codigo dentro de la misma linea de texto= interpolación
console.log("esta es una cadena normal ${5 + 4}");

let nombre = 'mar';
console.log(`Yo me llamo ${nombre}`);

//ARREGLOS - matrices (arreglos multiniveles- arrays
let arr2 = new Array("B", 2); //esta es la antigua forma, ya no se usa
let arr = [1, "A", null, undefined, 666, [true, false]];
console.log(arr[5][0]);

//OBJETOS: colecciónd e datos desordenados 
//tienen una estructura de clave y valor.
//son parejas de elementos que podemos utilizar sin un orden en específico. permite ser descriptivos del elementos que estamos tomando como base. en general se utiliza para insertar elementos del mundo y describirlos. 

const persona = { 
    nombre: 'Luis',
    edad: 31, 
    hobbie: [
        "fotografía",
        "nadar", 
        "ver pelis"
    ],
    auto: {
        marca: "VW",
        modelo: "pointer",
        year: 2000
    },
    saludar: function (){
        return "hola";
    }
    
};

persona.nombre = "Fernando";
console.log(persona.hobbie[2]); //para llamar a ver pelis
console.log(`Mi nombre es ${persona.nombre}`); 
console.log(`Mi hobbie favorito es ${persona.hobbie[1]}`);
console.log(`La marca de mi carro es ${persona.auto.marca}`);
console.log(persona.saludar());
console.log(`le gusta decir ${persona.saludar()}`);




