import java.util.Scanner;

//Diseñe un programa que lea la temperatura en centígrados del día e imprima el tipo de clima de
// acuerdo a la siguiente tabla.
public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("ingrese temperatura en centigrados");
        Scanner sc = new Scanner(System.in);
        float temperatura = sc.nextInt();

        if (temperatura<=10){
            System.out.println("el clima es frío");
        } else if (temperatura > 10 && temperatura<=20) {
            System.out.println("el clima es nublado");
        } else if (temperatura > 20 && temperatura <=30) {
            System.out.println("el clima es caluroso");
        } else if (temperatura>30) {
            System.out.println("el clima es tropical");
        }


    }

}
