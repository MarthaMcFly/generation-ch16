//Una farmacia desea un programa para ingresar el valor de compra y calcular lo siguiente:
// si el pago se efectúa al “contado”, calcular un descuento del 5%; pero si el pago es con “tarjeta”
// se incrementa un recargo del 3% al valor de compra. Calcular y visualizar el descuento o recargo según
// sea el caso y el total a pagar de la compra.

import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("ingrese la cantidad a pagar");
        Scanner sc = new Scanner(System.in);
        double compra = sc.nextInt();

        double descuento = compra*.05;
        double recargo = compra*.03;

        System.out.println("ingrese 1 para pagar en contado o 2 para pagar con tarjeta");
        int formaPago = sc.nextInt();

        if (formaPago==1){
            System.out.println("Se hizo un descuento de " + descuento);
            System.out.println("total a pagar " + (compra-descuento));
        } else if (formaPago == 2) {
            System.out.println("Se hizo un recargo de " + recargo);
            System.out.println("total a pagar " + (compra + recargo));
        }


    }
}
