"use strict";
/* CONVERSIÓN DE TIPO DE DATOS 
casteo parse
casting parsing 
*/

// coersión de tipo de dato o conversión automática de datos, JS convierte los datos para que se pueda realizar la operación. 

let num ="5";
let num2 = "10";

//concatenación:
console.log(num + num2 + num2 +num);

//Numer()
//convierte strings o booleanos a numeros
let num3 = "56";
console.log(Number(num3)); //agregando la palabra Number se cambia el string a numero
let num4 = true
console.log(Number(num4)); //en el caso de booleanos convierte el true en 1 y el false en 0

// String() 
// convierte numeros o booleanos a cadenas

let num5 = 4;
console.log(String(num5));

//Boolean()
//convierte numeros y cadenas a booleanos
// 0, " " - lo convierte a falso 
// todos los demás numeros los convierte en true
//faultsy values - valores que tienden a falso
let num6 = Boolean(0);
console.log(num6);



