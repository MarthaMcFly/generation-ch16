import java.util.Scanner;

//Determinar si un número es múltiplo de 10.
public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("ingrese un numero");
        Scanner sc = new Scanner(System.in);
        float numero = sc.nextInt();

        if (numero % 10 == 0) {
            System.out.println("el numero ingresado es multiplo de 10");
        } else {
            System.out.println("el numero ingresado no es multiplo de 10");
        }
    }
}