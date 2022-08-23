import java.util.*;


public class Colecciones3 {
    public static void main(String[] args) {
        System.out.println("ArrayList");
        List<String> comidas = new ArrayList<String>();
        comidas.add("taquitos");
        comidas.add("pozole");
        comidas.add("tostadas");
        comidas.add("chilaquiles");
        comidas.add(2, "elote");

        System.out.println(comidas);
        //Otra forma de inicializar una lista
        List<Integer> numeros = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

        System.out.println("----------");
        System.out.println("HashSet");

        Set<String> ciudades = new HashSet<String>();
        ciudades.add("berlin");
        ciudades.add("tokio");
        ciudades.add("denver");
        ciudades.add("liverpool");

        System.out.println(ciudades);

        //Otra forma de crear un HashSet
        Set<Boolean> verdad = new HashSet<Boolean>(Arrays.asList(true, false, false, true));
        System.out.println(verdad);

        System.out.println("----------");
        System.out.println("HashMap");
        //permiten guardar pares de valores
        // llave: valor
        //HashMap<K,V>     HashMap<llave, valor>

        Map<Integer, String> alumnos = new HashMap<>();
        alumnos.put(1, "Juanito");
        alumnos.put(2, "Luis");
        alumnos.put(3, "Fernando");
        alumnos.put(4, "Sofia");
        alumnos.put(5, "Sofia");
        System.out.println(alumnos);
        System.out.println(alumnos.size());
        System.out.println(alumnos.values());
        System.out.println(alumnos.keySet());
        System.out.println(alumnos.get(3));

        System.out.println("-------");

        for(int i=0; i<alumnos.size();i++){
            Object llaves = alumnos.keySet().toArray()[i];
            System.out.println(alumnos.get(llaves));
        }

        for(Integer llave : alumnos.keySet()){
            System.out.println(llave + " - " + alumnos.get(llave));
        }


    }
}
