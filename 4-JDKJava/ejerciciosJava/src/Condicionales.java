//Ingrese dos números diferentes y visualizar el mayor de ellos

import java.util.Scanner;
public class Condicionales {
    public static void main(String[] args) {

        System.out.println("Ingrese un digito");
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        System.out.println("ingrese otro dígito");
        Scanner sc2 = new Scanner(System.in);
        int numero2 = sc2.nextInt();

        if (numero1 > numero2){
            System.out.println("El número mayor es: " + numero1);
        } else {
            System.out.println("El número mayor es: " + numero2);
        }


    }
}
