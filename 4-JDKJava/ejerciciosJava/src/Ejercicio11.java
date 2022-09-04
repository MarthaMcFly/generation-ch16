import java.util.Scanner;

//Hacer un programa en java que permita ingresar tres notas para un alumno, la nota A que tiene una importancia
// de 3 créditos, la nota B tiene 4 Créditos, y la nota C tiene sólo 2 créditos; se debe de calcular el promedio
// teniendo en cuenta las notas y al final si el alumno tiene un promedio igual o mayor a 8.5 mostrar “Aprobado”,
// en caso contrario “Desaprobado”.
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nota A");
        int notaA = sc.nextInt();
        System.out.println("ingrese nota B");
        int notaB = sc.nextInt();
        System.out.println("ingrese nota C");
        int notaC = sc.nextInt();
        
        double promedio = notaA*.3 + notaB*.4 + notaC*.2;
        System.out.println("promedio = " + promedio);
        if (promedio>= 8.5){
            System.out.println("aprobado");
        } else if (promedio<8.5) {
            System.out.println("desaprobado");
        }
    }
}
