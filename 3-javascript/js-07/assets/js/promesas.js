//variable que simular los datos pedidos
const saludo = "hola mundo"; 
const datos = [
    {
        nombre: "jonathan",
        apellido: "vasquez"
    },
    {
        nombre: "jonathan",
        apellido: "vasquez"
    },
    {
        nombre: "jonathan",
        apellido: "vasquez"
    },
]

// console.log(saludo);
// console.log(datos);


//función para simular una peticion 

function obtenerDatos(params) {
    return new Promise((resolve, reject) => {
        setTimeout( () =>{
            if(false){
                resolve (datos)
            } else {
                reject("nose pudo resolver")
            }
        }, 4000)  
    })
}

//FORMA NUMERO 1
//Para procesar los datos de la promesa se utiliza una funcion flecha
obtenerDatos().then((datos) =>{  
    console.log(datos);
}).catch( (error) => {
    console.log("existe un error en la peticion 1");
    console.log(error);
})
//then realiza acciones cuando la promesa se ha cumplido
// .catch es para ver el error

//FORMA NUMERO 2. funciones asincronas: await async

async function funcionAsincrona() {
    try {
        const datos = await obtenerDatos()
        console.log(datos);
    }catch(error){
        console.log(error);
    }
 
}

funcionAsincrona()