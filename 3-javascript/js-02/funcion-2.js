function miFuncion(a, b) {
    return (a + b);
}

let resultado = miFuncion( 3, 6)
console.log("el resultado es: " + resultado);

//***********FUNCIÓN EXPRESION O ANONIMA: no tiene nombre.
//

let suma = function (a, b, c) {return(a + c)};
    let res = suma (2 , 3, 5);
    let caracteres = "el resultado es: "
    console.log(caracteres + res);

//función de resta 

let resta = function (a, b, c) {return(b - a + c)};
    let rest = resta(3, 15 , 10);
    console.log("resta " + caracteres + rest);

//funcion multiplicación

let multiplicación = function (a, b, c){return(a * b - c)};
    let mult = multiplicación(3 , 5, 7);
    console.log("multiplicacion " + caracteres + mult);

//función división

let division = function (a, b, c){return(a/b*c)};
    let div = division(5 , 1, 4);
    console.log("división " + caracteres + div);

/**** FUNCION AUTOLLAMADA O AUTOEJECUTABLE******/
//Es autoinvocada y no es reutilizable, se utiliza cuando su uso va a ser exclusivo, para liberar memoria.

(function(a, b, c){
    console.log("El resultado de la Self Invoking es: " + (a + b + c));
})(5 , 8, 9);
