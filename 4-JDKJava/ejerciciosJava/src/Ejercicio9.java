import java.util.Scanner;

//  Escriba programa para ingresar 4 notas de un alumno, calcular y mostrar su promedio,
//  sabiendo que la 1ra y 2da tiene 20% de peso cada una, la 3ra y 4ta tienen 30% de peso cada una.
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese nota español");
        float español = sc.nextFloat();
        System.out.println("ingrese nota mate");
        float mate = sc.nextFloat();
        System.out.println("ingrese nota bio");
        float bio = sc.nextFloat();
        System.out.println("ingrese nota quimica");
        float quimica = sc.nextFloat();

        double promedio = español*.2 + mate*.2 + bio*.3 + quimica*.3;
        System.out.println("su promedio es: " + promedio);
    }
}
