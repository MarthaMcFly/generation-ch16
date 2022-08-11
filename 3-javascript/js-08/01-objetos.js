let persona = {
    nombre: 'perenganito',
    apellido: 'perez',
    edad: 27,
    correo: 'abc@correofalso.com',
   /*  nombreCompleto: function () {
        return this.nombre + ' ' + this.apellido;
    } */
    idioma: 'es',
    get leng (){
        return this.idioma.toUpperCase();
    },
    set lang (lang){
        this.idioma = lang.toLowerCase()
    }
}
console.log(persona.leng);
persona.lang = 'ES';
console.log(persona.leng);
console.log(persona.idioma);


persona.tel = '6382947491';
persona.tel = '19873984509';
console.log(persona);


console.log(persona.nombre);
// console.log(persona.nombreCompleto());



/* let obj_constructor = new Object();

obj_constructor.nombre = 'fulanito';
obj_constructor.apellido = 'de tal';
obj_constructor.edad = 48;
obj_constructor.correo = 'hjk@correofalso.com'

console.log(persona);
console.log(obj_constructor);
 */

// for in 
for (varPropiedad in persona){
    console.log(persona [varPropiedad]);
}

let personaString = JSON.stringify(persona); //transforma el objeto en una cadena de texto
console.log(personaString);