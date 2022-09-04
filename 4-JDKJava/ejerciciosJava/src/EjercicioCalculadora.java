//Construir un programa que simule el funcionamiento de una calculadora que puede realizar las  cuatro
// operaciones aritméticas básicas (suma, resta, producto y división) con valores numéricos enteros.
// El usuario debe especificar la operación con el primer carácter del primer parámetro de la línea de
// comandos: S o s para la suma, R o r para la resta, P, p, M o m para el producto y D o d para la división.

import java.util.Scanner;

public class EjercicioCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer número de la operación");
        int primerNumero = sc.nextInt();
        System.out.println("ingrese el segundo número de la operación");
        int segundoNumero = sc.nextInt();
        System.out.println("ingrese la operación que desea: S(suma), R(resta), P(multiplicacion, D(división)");

        String operacion= sc.nextLine();
        switch (operacion){
            case "S":
                System.out.println("El resultado de la suma es: " + (primerNumero+segundoNumero));
                break;
            case "R":
                System.out.println("el resultado de la resta es: "+(primerNumero-segundoNumero));
                break;
            case "M":
                System.out.println("el resultado de la multiplicación es: " + (primerNumero*segundoNumero));
                break;
            case "D":
                System.out.println("el resultado de la división es: " + (primerNumero-segundoNumero));
                break;
        }

    }
}
