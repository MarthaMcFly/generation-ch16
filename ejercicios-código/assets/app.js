//*****************************Ejercicio 1. Casa de tauro

/* 
let carreritas = ["Lucía", "Roberto", "María", "Jesús", "Andrea", "José"];
console.log(carreritas);
carreritas.splice(4, 1);
carreritas.splice(2,0, "Andrea")
carreritas.pop();
carreritas.splice(1,0,"cristobal","fernanda","armando");
carreritas.unshift("Federico");
console.log(carreritas); 
*/



//****************************Ejercicio 2. CASA DE CANCER 

/* 
let valor1 = prompt("ingresa un dígito en grados celcius", "0");
 function Farenheit(a, b, c) {
    return (valor1 * b + c)
}
let resultado1 = "Equivale a " + Farenheit(valor1, 9/5, 32) + " grados Fahrenheit y ";

function Kelvin(a, b) {
    return(a + b)
}
let resultado2 = Kelvin(valor1, 273.15 ) + " grados Kelvin";
alert(resultado1 + resultado2); 
*/
 

//**********************Ejercicio 3. CASA DE VIRGOlet payaso = prompt("número de payasos");
/* 
    function pesoP(a, b) {
        return (a * b)
    }
    let pesoPa = "el peso total es " + pesoP(payaso, .112) + " kilogramos";
    alert(pesoPa);

let muñeca = prompt("número de muñecas");
    function pesoM(a, b) {
        return(a * b)
    }
    let pesoMu = "el peso total es " + pesoM(muñeca, .75) + " kilogramos";
    alert(pesoMu);  
*/
 
//*********************** Ejercicio 4. CASA DE ESCORPIO

/* 
let nI = prompt("Ingresa un número par adivinar el numero mágico")
let nm = 335

if (nI > nm ) {
    alert("el número que ingresaste es mayor al número mágico");
} else if (nI < nm) {
    alert("El número que ingresaste es menor al número mágico");
} else if (nI == nm) {
    alert("Felicidades, adivinaste el número mágico");
} else {
    alert ("Juega de nuevo");
}
 */

//*************************** Ejercicio 5. CASA DE PISCIS
/* 
alert("Bienvenido");
let solicitud = prompt("Para consultar saldo ingresa 1, para realizar un retiro presiona 2")

switch (solicitud == 1) {
    case true: 
        alert("el saldo es de $10,000");
        break;
    case false:
        alert("elegiste realizar retiro");
    default:
        break;
}
*/

//**********************  Ejercicio 6. PATRIARCA 
/* 
        let nip;
        while(nip !== "9182") {
            nip = prompt ("ingresa tu nip");
        } 
    
let retiro = prompt("Elige la cantidad a retirar: 200, 400, 600, 800, 1000, 1200, 1400, 1600, 1800, 2000");

if (retiro == 200){
    alert("Entrega 1 billete de 200");
} else if (retiro == 400){
    alert("Entrega 2 billetes de 200");
} else if (retiro == 600){
    alert("Entrega 1 billete de 500 y un billete de 100");
} else if (retiro == 800){
    alert("Entrega 1 billete de 500, 1 billete de 200, 1 billete de 100");
} else if (retiro == 1000){
    alert("Entrega 2 billetes de 500");
} else if (retiro == 1200){
    alert("Entrega dos billetes de 500, un billete de 200");
} else if (retiro == 1400){
    alert("Entrega dos billetes de 500, dos billetes de 400");
} else if (retiro == 1600){
    alert("Entrga tres billetes de 500, un billete de 100");
} else if (retiro == 1800){
    alert("Entrega tres billetes de 500, dos de 200");
} else if (retiro == 200){
    alert("Entrega cuatro billetes de 500");
} else {
    alert("Cantidad incorrecta, vuelva a intentarlo");
};
 */