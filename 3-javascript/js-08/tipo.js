// TIPO PREDEFINIDO
let tiempo = new Date(); //dia y hora actual
console.log(tiempo);
console.log(Math);

let obj_literal = {
    nombre: 'juan',
    edad: 24
    }
let obj_constructor = new Object();

obj_constructor.nombre = 'pedro'
obj_constructor.edad = 45;
console.log(obj_literal);
console.log(obj_constructor);

obj_literal['nombre'];
let llave = 'nombre';
console.log('esto es con llave ' + obj_literal[llave]);

// TIPO CADENA

let cadena = "esto es una cadena"; //definición del objeto de manera primitiva
let cadenaObjeto = new String('esto es otra cadena obj'); //definición del objeto a través de un constructor
console.log(cadena);
console.log(cadenaObjeto);

// TIPO NUMÉRICO
let numero = 13;
let numObjeto= new Number(13.13);
console.log(numero);
console.log(numObjeto);

// TIPO COMPUESTO O UNICO
let lista = ['2','3', '5', '7', '11', '13'];
let listaObj = new Array('2','3', '5', '7', '11', '13');
console.log(lista);
console.log(listaObj);



