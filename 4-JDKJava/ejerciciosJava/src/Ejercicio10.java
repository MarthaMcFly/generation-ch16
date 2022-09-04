import java.util.Scanner;

//Desarrolle un programa que pida cuantos hombres y mujeres hay en un aula y permita calcular el
// porcentaje de hombres y mujeres.
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de hombres");
        int hombres = sc.nextInt();
        System.out.println("ingrese la cantidad de mujeres");
        int mujeres = sc.nextInt();
        int total = hombres+mujeres;

        float porcentajeh = hombres*100 / total;
        float porcentajem = mujeres*100 / total;

        System.out.println("el porcentaje de mujeres es " + porcentajem + "y el porcentaje de hombres es " + porcentajeh);
    }
}
