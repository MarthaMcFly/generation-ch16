import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        //Determinar si una persona es mayor de edad

        Scanner escaner = new Scanner(System.in); //new permite crear un objeto a partir de una clase, es decir permite instanciar
        System.out.println("escribe tu edad: ");// esto es el mensaje para que se ingrese la edad
        int edad = escaner.nextInt(); //aquí se guardó la edad ingresada
        escaner.close();//Para cerrar el scanner cuando ya no se necesiten leer más datos.

        //If else
        if (edad >= 18){
            System.out.println("eres mayor de edad");
        }else {
            System.out.println("eres menor de edad");
        }

        //Operador ternario
        String resultado = (edad >= 18) ? "eres mayor de edad" : "eres menor de edad";
        System.out.println(resultado);


    }
}
