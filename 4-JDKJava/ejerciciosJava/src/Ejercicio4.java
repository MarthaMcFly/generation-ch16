//Realizar un programa que simule un inicio de sesión solicitando el nombre de usuario y contraseña,
// y mostrar un mensaje en pantalla, inicio de sesión correcto/ nombre de usuario incorrecto.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {


        System.out.println("Bienvenido. Ingrese su nombre de usuario");
        Scanner sc = new Scanner(System.in);
        String usuario = sc.nextLine();
        System.out.println("ingrese contraseña");
        Scanner sc2 = new Scanner(System.in);
        String contraseña = sc.nextLine();

        if (usuario.equals("Luis") && contraseña.equals("hola")){
            System.out.println("Inicio de sesión correcto. Bienvenido");
        } else {
            System.out.println("nombre de usuario y/o incorrecto");
        }
    }
}
