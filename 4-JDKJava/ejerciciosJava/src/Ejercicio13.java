import java.util.Scanner;

//En un casino de juegos se desea mostrar los mensajes respectivos por el puntaje obtenido
// en el lanzamiento de tres dados de un cliente, de acuerdo a los siguientes resultados:
//Si los tres dados son seis, mostrar el mensaje “Excelente”
//Si dos dados se obtienen seis, mostrar el mensaje “Muy bien”
//Si un dado se obtiene seis, mostrar el mensaje “Regular”
//Si ningún dado se obtiene seis, mostrar el mensaje “Pésimo”
public class Ejercicio13 {
    public static void main(String[] args) {

        int dado1 = (int)(Math.random()*6+1);
        System.out.println("dado1 = " + dado1);
        int dado2 = (int)(Math.random()*6+1);
        System.out.println("dado2 = " + dado2);
        int dado3 = (int)(Math.random()*6+1);
        System.out.println("dado3 = " + dado3);

        if ((dado1 == 6)&&(dado2==6) &&(dado3==6)){
            System.out.println("Excelente, tienes tres 6");
        } else if ((dado1 == 6)&&(dado2 == 6)){
            System.out.println("Muy bien, tienes dos 6");
        } else if (((dado1 == 6)&&(dado3==6)) ) {
            System.out.println("Muy bien, tienes dos 6");
        } else if ((dado2==6)&&(dado3==6)){
            System.out.println("Muy bien, tienes dos 6");
        } else if (dado1 ==6 || dado2 ==6 || dado3 ==6) {
            System.out.println("Regular, tiene solo un 6");
        } else {
            System.out.println("Pesimo, no obtuviste ningun 6");
        }
    }
}
