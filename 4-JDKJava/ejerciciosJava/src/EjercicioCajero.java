import java.util.Scanner;

// Hacer un programa que simule un cajero automático con un saldo inicial de 1000 dólares,
// con el siguiente menú de opciones:
//1. Ingresar dinero a la cuenta.
//2. Retirar dinero de la cuenta.
//3. Salir
public class EjercicioCajero {
    public static void main(String[] args) {
        System.out.println("bienvenido");
        System.out.println("ingrese la operación a realidar:");
        System.out.println("1. ingresar dinero a la cuenta");
        System.out.println("2. retirar dinero de la cuenta");
        System.out.println("3. salir");
        Scanner sc = new Scanner(System.in);
        int opcionElegida = sc.nextInt();
        double saldo = 1000;
        switch (opcionElegida){
            case 1:
                System.out.println("su saldo actual es de " + saldo);
                System.out.println("ingrese la cantidad de dinero a su cuenta");
                int nuevoSaldo = sc.nextInt();
                System.out.println("su nuevo saldo es de " + (saldo+nuevoSaldo));
                break;
            case 2:
                System.out.println("su saldo actual es de " + saldo);
                System.out.println("ingrese la cantidad a retirar");
                int retiro = sc.nextInt();
                if (retiro<= saldo){
                    System.out.println("su saldo ahora es de " + (saldo-retiro));
                } else if (retiro>saldo) {
                    System.out.println("lo sentimos, no cuenta con el saldo suficiente");
                }
                break;
            case 3:
                System.out.println("gracias por venir, vuelva pronto");
        }

    }
}
