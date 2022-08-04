/* FUNCIONES COMO OBJETOS */

function miFuncion (a, b){
    let res = 0; //propiedad. Es un estado asignado 
    res = (a * b); //acción o preceso
    return res;
}
console.log(typeof miFuncion);
    var miFuncionTexto = miFuncion.toString();
    console.log(miFuncionTexto);
