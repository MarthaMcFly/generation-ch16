let condicion = "F"

if (condicion === "A") {
    console.log("Entró en la condición A");
} else if (condicion === "B"){
    console.log("Entró en la condicion B");
}else if (condicion === "C") {
    console.log("entró en la condición C");
} else {
    console.log("no cumple con ninguna condicion");
}

function dividir (a , b) {
    if (b === 0){
        console.log("no se puede realizar la operación");
    }
    else{
        console.log(a / b);
    }
}
dividir(10, 1)

/* Switch */

let nuevaCondicion = 156;
switch(nuevaCondicion == 0){
    case 156:
        console.log("buenos días");
        console.log("espero que te encuentres bien");
        break;
    case "adios":
        console.log("nos vemos");
        break;
    case true:
        console.log("te mando un saludo");
        break
    case false: 
        console.log("caso false");
    default:
        console.log("no entendí tu mensaje");
        break;
}


let edad = 30
    switch (edad>=18) {
        case true:
            console.log("mayor");
            break;
        case false:
            console.log("menor");
        default:
            break;
    }

    
let elegir = "sumar"
switch (elegir) {
    case "sumar":
        console.log("vamos a sumar");
        break;
    case "restar":
        console.log("vamos a restar");
    
    case "dividir":
        console.log("vamos a dividir");
    
    case "multiplicar":
        console.log("vamos a multiplicar");
    
}