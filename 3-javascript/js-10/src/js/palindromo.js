/* const palindromo = (palabra) => {
    let palabraInvertida = palabra.split("").reverse().join("");
    if(palabra === palabraInvertida){
        return 'Es un palindromo';
    } else {
        return 'no es un palindromo'
    }
}
 */

console.log(palindromo('generation'));


//Operador ternario: sirve para utilizar la funcionalidad de If en una sola linea
const palindromo = (palabra) => {
    let palabraInvertida = palabra.split("").reverse().join("");
    return palabra === palabraInvertida ? 'Es un palindromo' : 'No es un palindromo;'
}
//(condicion) ? loQueSeEjecutaSiEsVErdadero : LoQueSeEjecutaSiEsFalso
module.exports = palindromo