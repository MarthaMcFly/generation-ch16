import java.util.Scanner;

public class Semana {
    public static void main(String[] args) {
        System.out.println("semana");

        Scanner sc = new Scanner(System.in);
        System.out.println("escribe un numero: ");
        byte diaSemana = sc.nextByte();
        switch (diaSemana){
            case 1:
                System.out.println("se escribió un uno");
                break;
            case 2:
                System.out.println("se escribió un dos");
                break;
            case 3:
                System.out.println("se escribió un tres");
                break;
            default:
                System.out.println("no entendí");
        }

    }
}
