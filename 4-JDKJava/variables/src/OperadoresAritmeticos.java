import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5, j =4, suma = i+j;
        System.out.println("suma = " + suma);
    //SUMA
        System.out.println("i + j = " + (i + j)); //realiza la operación
        System.out.println("i + j = " + i + j); //concatena los datos

    //RESTA
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i - j = " + (i - j));

    //MULTIPLICACION
        int multi = i * j;
        System.out.println("multi = " + multi);
        System.out.println("i * j = " + (i * j));

    //DIVISION
        int division = i / j;
        System.out.println("division = " + division);
        float div1 = (float) i / (float) j;
        System.out.println("div 1  = " + div1 );

        //CLASE Scanner
        Scanner scanner = new Scanner(System.in); //in hace referencia que ahora se espera una entrada
        System.out.println("¿cual es tu nombre?");
        String nombre = scanner.next(); //aqui se pide que ingrese el dato de nombre
        System.out.println("Hola " + nombre);
        System.out.println("¿Cual es tu edad?");
        String edadString = scanner.next(); //aqui se pide que ingrese el dato de edad
        int edad = Integer.parseInt(edadString); //cambiamos edad de string a entero
        System.out.println("tienes " + edad);

    }
}
