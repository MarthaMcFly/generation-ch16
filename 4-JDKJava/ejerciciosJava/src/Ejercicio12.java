import java.util.Scanner;

//En una tienda se ha establecido la siguiente oferta: por compras menores a 50 soles se hace un descuento de 8%,
// pero para compras a partir de 50 el descuento es de 10%. Se pide ingresar la cantidad y el precio del producto
// que se compra y determinar cuanto se descontará y cuanto se cobrará.
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el precio del producto");
        int precio = sc.nextInt();
        System.out.println("ingrese la cantidad de productos");
        int cantidad = sc.nextInt();

        float precioSinDescuento = precio*cantidad;

        if (precioSinDescuento>=50){
            System.out.println("el precio a pagar es "+ (precioSinDescuento - precioSinDescuento*.10));
        } else{
            System.out.println("el precio a pagar es " + (precioSinDescuento - precioSinDescuento*.08));
        }

    }
}
