import java.util.Scanner;

//Hacer un programa para ingresar un número entre 1 y 12 y reportar el mes que le corresponde.
public class Switch2 {
    public static void main(String[] args) {
        System.out.println("ingrese un número del 1 al 12");
        Scanner sc = new Scanner(System.in);
        int numeroIngresado = sc.nextInt();
        switch (numeroIngresado) {
            case 1:
                System.out.println("enero");
                break;
            case 2:
                System.out.println("febrero");
                break;
            case 3:
                System.out.println("marzo");
                break;
            case 4:
                System.out.println("abril");
                break;
            case 5:
                System.out.println("mayo");
                break;
            case 6:
                System.out.println("junio");
                break;
            case 7:
                System.out.println("julio");
                break;
            case 8:
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("septiembre");
                break;
            case 10:
                System.out.println("octubre");
                break;
            case 11:
                System.out.println("noviembre");
                break;
            case 12:
                System.out.println("diciembre");
                break;
            default:
                System.out.println("no ingresó un numero válido");
        }
    }
}
