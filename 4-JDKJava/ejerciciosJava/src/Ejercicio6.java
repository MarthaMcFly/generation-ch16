// Tiendas Don Pepe desea un programa para ingresar por teclado el monto de compra y el día de la semana;
// si el día es martes o jueves, se realizará un descuento del 15% por la compra. Visualizar el descuento
// y el total a pagar por la compra.

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("ingrese el monto de compra");
        Scanner sc = new Scanner (System.in);
        double montoCompra = sc.nextDouble();

        System.out.println("ingrese el día de la semana");
        Scanner sc2 = new Scanner(System.in);
        String dia = sc2.nextLine();

        double descuento = .15;


        if(dia.equals("martes") || dia.equals("jueves")){
            System.out.println("Se realizó un descuento de " + (montoCompra*descuento));
            System.out.println("el total a pagar es de " + (montoCompra-(montoCompra*descuento)));
        }else {
            System.out.println("el total a pagar es de " + montoCompra);
        }





    }
}
