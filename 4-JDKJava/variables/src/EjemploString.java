public class EjemploString {
    public static void main(String[] args) {
        String curso = "Curso en Java";
        System.out.println("curso = " + curso);
        String nombre = "Mar";
        String resultado = new String("Curso en java");
        System.out.println("resultado =" + resultado);
        
        boolean esigual = curso == resultado; //Da falso porque está comparando una asignacion literal con una variable por referencia
        System.out.println("esigual = " + esigual);
        
        esigual =curso.equalsIgnoreCase(resultado);//da verdadero porque agregamos el método .equals que compara directamente la cadena de String.
        System.out.println("esigual = " + esigual);//.equals sirve para comparar objetos
        
        String concat = curso + " con " + nombre;
        System.out.println("concat = " + concat);
        String dia = "Jueves";
        String concat1 = concat.concat("").concat(dia);
        System.out.println("concat1 = " + concat1);

        int edad = 27;
        System.out.println(nombre + " tiene " + edad + " años");

    }
}