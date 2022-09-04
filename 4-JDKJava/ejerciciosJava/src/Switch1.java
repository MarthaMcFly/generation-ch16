//La universidad ha categorizado las matrículas de acuerdo a la facultad que va a estudiar el postulante.
// Ingrese por teclado el nombre del postulante y la facultad que va a estudiar, muestre el importe,
// la mensualidad, el IGV 18% (importe + mensualidad) y el monto final a pagar.

import java.util.Scanner;
public class Switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su carrera");
        String carrera = sc.nextLine();
        int matricula = 0;
        int mensualidad= 0;
        double igv = .18;

        switch (carrera){
            case "sistemas":
                matricula = 350;
                mensualidad = 650;
                break;
            case "derecho":
                matricula = 300;
                mensualidad = 550;
                break;
            case "naviera":
                matricula=300;
                mensualidad=500;
                break;
            case "pesquera":
                matricula=310;
                mensualidad=460;
                break;
            case "contabilidad":
                matricula=280;
                mensualidad=490;
                break;
            case "administración":
                matricula=360;
                mensualidad=520;
            default:
                System.out.println("no se encontró");
        }
        double igv2= igv*(matricula+mensualidad);
        double montoFinal = matricula + mensualidad + igv2;
        System.out.println("la matricula es: " + matricula);
        System.out.println("la mensualidad es: " +mensualidad);
        System.out.println("el igv es: "+ igv2);
        System.out.println("el total a pagar es: " + montoFinal);

    }
}
