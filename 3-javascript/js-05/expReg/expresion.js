//  ***************Buscar con /texto/

let texto = "hoy parece que va a salir el sol";
let texto1 = "la espero en el aeropuesto de LA"
let buscar = /LA/;
console.log(buscar.test(texto1)); 

//buscar con /[eo]/

let texto3 = "te marqué anoche"
let buscar1 = /[eo]/;
console.log(buscar1.test(texto3));



