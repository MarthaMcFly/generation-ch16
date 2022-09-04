import java.util.Scanner;

//Ingresar 3 números y visualizarlos ordenados de mayor a menor
public class Condicionales2 {
    public static void main(String[] args) {
        System.out.println("ingrese un número");
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        System.out.println("ingrese segundo número");
        Scanner sc2 = new Scanner(System.in);
        int numero2 = sc2.nextInt();
        System.out.println("ingrese tercer número");
        Scanner sc3 = new Scanner(System.in);
        int numero3 = sc3.nextInt();

        if (numero1 > numero2 & numero2 > numero3){
            System.out.println("el orden es: " + numero1 + numero2 + numero3);
        } else if (numero1 > numero2 & numero3 > numero2) {
            System.out.println("el orden es: " + numero1 + numero3 + numero2);
        } else if (numero2 > numero1 & numero1 > numero3) {
            System.out.println("el orden es: " + numero2 + numero1 + numero3);
        } else if (numero2 > numero1 & numero3 > numero1) {
            System.out.println("el orden es: " + numero2 + numero3 + numero1);
        } else if(numero3> numero1 & numero1 > numero2) {
            System.out.println("el orden es: " + numero3 + numero1 + numero2);
        } else if (numero3>numero1 & numero2 >numero1) {
            System.out.println("el orden es: " + numero3 + numero2 + numero1);
        } else {
            System.out.println("no encontré el orden de los números");
        }


    }
}
