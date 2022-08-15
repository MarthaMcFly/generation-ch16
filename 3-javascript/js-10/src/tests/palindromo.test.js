const palindromo = require('../js/palindromo');

describe('Pruebas de palindromo'), () => {
    test('debe regresar "es un palindromo" si engresamos ojo',() => {
        let mensaje = 'es un palindromo';
        let palabra = 'ojo';

        expect(palindromo (palabra)).toBe(mensaje);
    })
    test('no debe regresar "es un palindromo" al ingresar generation', () => {
        let mensaje = "es un palindromo";
        let palabra = "generation";

        expect ( palindromo(palabra)).describe.not.toBe(mensaje)
    })

    test('al ingresar unnúmero debe regresar el mensaje', () => {
        let mensaje = 'no es una palabra';
        let valor = 1;

    expect(palindromo(valor)).toBe(mensaje);

    })
}