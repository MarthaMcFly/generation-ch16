package MetPrincipal;

import MenuP.MenuOp;
import MiEjemploJava.Persona;
import MiSaludo.Saludo;

import java.util.Scanner;

public class EjecutaT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuOp menuOp = new MenuOp();
        menuOp.menu();
        System.out.println("elija una opción");

        int op = sc.nextInt();

do {
    switch (op) {
        case 1:
            Saludo s = new Saludo();
            s.saludar();
            System.out.println(s.saludar0());
            break;
        case 2:
            Persona p = new Persona();
            p.getEdadPersona();
            p.getEdadPersona();
            break;
        }
    } while (op<=4);


    }
}
