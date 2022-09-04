import java.util.Scanner;

//Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
// Si trabaja 40 horas o menos se le paga $16 por hora. Si trabaja mas de 40 horas se le paga $16
// por cada una de las primeras 40 horas y $20 por cada hora extra.
public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("ingrese las horas trabajadas");

        Scanner sc = new Scanner(System.in);
        double horas = sc.nextInt();
        double sueldo = horas*16;
        double horasExtra= (horas-40)*20;

        if (horas <=40){
            System.out.println("el salario es " + sueldo);
        } else if (horas>40) {
            System.out.println("salario: " + sueldo);
            System.out.println("horas extra: " + horasExtra);
            System.out.println("el salario total es " + (sueldo + horasExtra));
        }

    }

}
