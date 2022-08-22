import java.util.ArrayList;
import java.util.List;
public class Colecciones {
    public static void main (String[] args){
// ----------  ArrayList

//Los valores se ordenan según el orden en que se agregan
//Permiten tener valores duplicados

        List<String> meses = new ArrayList<>();

        meses.add("enero");
        meses.add("febrero");
        meses.add("marzo");
        meses.add(1, "abril");

        String mes = meses.remove(3);

        System.out.println(meses);
        System.out.println(mes);
        System.out.println(meses.get(0));
        System.out.println(meses.size());

        for(String elemento : meses){
            System.out.println(elemento);
        }
//CLASES ENVOLVENTES
        int num1 = 10;
        //Integer asocia el valor que está guardado dentro de la variable
        Integer num2= 10;
        System.out.println(num1 +10);
        System.out.println(num2 -5);
        System.out.println(num2.getClass().getSimpleName());

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(98);
        numeros.add(90);
        System.out.println(numeros);
    }
}
