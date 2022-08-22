import java.util.Objects;
import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        System.out.println("bucles");
        //método for

        for(int i = 5; i<=10; i++){
            System.out.println(i);
        }
 //BUCLE CONTROLADO
        //while
        //mientras la condicion se true se va a ejecutar el codigo
        //la condicion se debe de modificar dentro del while

        String condicion = "hola";
        Scanner sc = new Scanner(System.in);  //pide información

        while(!Objects.equals(condicion, "hola")){   //
            System.out.println("saludame");
            condicion = sc.next();   //permite leer información y guardarla en la variable

        }
    //do while
        do{
            System.out.println("saludame x2");
            condicion = sc.next();

        }while(!Objects.equals(condicion, "hola"));


    }
}
