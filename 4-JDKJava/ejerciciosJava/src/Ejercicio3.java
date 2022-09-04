import java.util.Scanner;

//Pedir un número entre 0 y 99999 y decir cuantas cifras tiene.
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número");
        Scanner scanner = new Scanner(System.in);
        int numeroIngresado = scanner.nextInt();

        if(numeroIngresado<10){
            System.out.println("el numero ingresado tiene 1 cifra");
        } else if (numeroIngresado<=99) {
            System.out.println("el numero ingresado tiene 2 cifras");
        } else if (numeroIngresado<=999) {
            System.out.println("el numero ingresado tiene 3 cifras");
        } else if (numeroIngresado<= 9999) {
            System.out.println("el numero ingresado tiene 4 cifras");
        } else if (numeroIngresado <= 99999){
            System.out.println("el numero ingresado tiene 5 cifras");
        }else {
            System.out.println("el numero que ingresó no está entre 0 y 99999");
        }

    }
}
