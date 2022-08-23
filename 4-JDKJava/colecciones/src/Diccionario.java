import javax.management.modelmbean.InvalidTargetObjectTypeException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {

        Map<String,String> diccionario = new HashMap<>();
        diccionario.put("door", "puerta");
        diccionario.put("body", "cuerpo");
        diccionario.put("house", "casa");
        diccionario.put("dog", "perro");
        diccionario.put("think","pensar");
        diccionario.put("see", "ver");
        diccionario.put("people", "gente");
        diccionario.put("time", "tiempo");
        diccionario.put("up","arriba");
        diccionario.put("but","pero");
        diccionario.put("all", "todo");
        diccionario.put("sister", "hermana");
        diccionario.put("dragon", "dragon");
        diccionario.put("have", "tener");
        diccionario.put("year","año");
        diccionario.put("work", "trabajo");
        diccionario.put("new", "nuevo");
        diccionario.put("clock", "reloj");
        diccionario.put("day","día");
        diccionario.put("chair","silla");


        Object llaves = diccionario.keySet().toArray();
        System.out.println(llaves);



        /*System.out.println("ingrese una palabra en ingles ");
        Scanner sc = new Scanner(System.in);
        String palabraBuscada = sc.nextLine();
        String palabraMeaning = diccionario.get(palabraBuscada);
        System.out.println(palabraMeaning);   */

    }
}
