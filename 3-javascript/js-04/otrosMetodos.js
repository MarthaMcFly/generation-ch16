//Método sort()
//permite ordenar los elementos de un arreglo. realiza un orden en automatico


const arr = ["X", "A", "H", "a", "W", "b"];
arr.sort();
console.log(arr);

const arr2 = ["Hola", "adios", "bienvenido"];
arr2.sort();
console.log(arr2);

const arr3 = [5, 1231, 567, 1, 80];
arr3.sort((a, b)=> a- b); //esta función permite ordenar los numeros. Es una función dentro de un arreglo 
console.log(arr3);


/* 
FUNCIONES

Funcion flecha: 

const dividir = (a, b) => {
    return (a / b)
} 
console.log(dividir(10, 2));

//Tambien se puede expresar sin el return cuando solo se imprime una sola cosa
const division = (a, b) => a / b;

 */

//Método for each: es un ciclo que recorre en automatico todo nuestro arreglo.
const arrNumeros = [1, 4, 6, 8, 10];
arrNumeros.forEach((elemento, index, arr)=> console.log(elemento, index, arr));
    


// forEach)elemento, indice, arreglo completo)


// ciclo for con arreglo