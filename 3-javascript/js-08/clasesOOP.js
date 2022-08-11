//METODO CONSTRUCTOR
class Persona{
    constructor(nombre, apellido){ 
        this._nombre = nombre;
        this._apellido = apellido;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
}

let persona1 = new Persona('perenganito', 'rodriguez'); 
console.log(persona1);

persona1._nombre = 'fulanito';
console.log(persona1.nombre);

let persona2 = new Persona('juanito','perez');
console.log(persona2);