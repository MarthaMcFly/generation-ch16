/* Funciones: acciones que los objetos realizan */


function miSuma(a, b) {
    let resultado = a + b;
    console.log("la suma es: " + resultado);
}

miSuma(2,3);
miSuma(512,5468);


function miSuma(a, b) {
    console.log("la suma es: " + (a + b) );
}
miSuma(4, 6);   



function miProducto(a, b) { //PRACTICAR ESA FORMA DE FUNCION
    return  (a * b);
}
console.log("el producto es: " + miProducto(4, 5));


function miResta(a, b) {
    return  (a - b);
}
res = miResta(10, 4);
console.log("la resta es: " + res);

// 1. Funciòn que arroje mi nombre

function miNombre(a, b, c) {
    return (a + b + c);
}
let yoMeLlamo = miNombre ("Martha ", "Peña ", "Sotelo")
console.log("Yo me llamo " + yoMeLlamo);




//2. Función que arroje un cociente
function division(a, b) {
    return (a / b)
}
    console.log("El resultado de la división es: " + division(10, 2));




