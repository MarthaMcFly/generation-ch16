public class EjemploVariables {
    public static void main(String[] args) {
        String nombre = "Mar";
        String saludo = "Hola esto es un ejemplo de variables";
        char espacio = ' ';
        char caracter = 'a';
        System.out.println(saludo);
        System.out.println("char corresponde en bytes: " + Character.BYTES );
        System.out.println("char corresponde en bits: " + Character.SIZE);
        System.out.println("char valor maximo: " + Character.MAX_VALUE);
        System.out.println("char valor minimo: " + Character.MIN_VALUE);

        int numeroEntero = 2;
        System.out.println("int corresponde en bytes: " + Integer.BYTES );
        System.out.println("int corresponde en bits: " + Integer.SIZE);
        System.out.println("int valor maximo: " + Integer.MAX_VALUE);
        System.out.println("int valor minimo: " + Integer.MIN_VALUE);

        float numeroFloat = 1.5e-10f;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("float corresponde en bytes: " + Float.BYTES );
        System.out.println("float corresponde en bits: " + Float.SIZE);
        System.out.println("float valor maximo: " + Float.MAX_VALUE);
        System.out.println("float valor minimo: " + Float.MIN_VALUE);

        double numeroDouble = 3.444567E39;
        System.out.println("numeroDouble es:" + numeroDouble);
        System.out.println("double corresponde en bytes: " + Double.BYTES );
        System.out.println("double corresponde en bits: " + Double.SIZE);
        System.out.println("double valor maximo: " + Double.MAX_VALUE);
        System.out.println("double valor minimo: " + Double.MIN_VALUE);

        boolean valorBoolean = (3-2 == 1);
        System.out.println("valorBoolean=" + valorBoolean);

        long valorLong = 927;
        System.out.println("valor long es: " + valorLong);
        System.out.println("long corresponde en bytes: " + Long.BYTES );
        System.out.println("long corresponde en bits: " + Long.SIZE);
        System.out.println("long valor maximo: " + Long.MAX_VALUE);
        System.out.println("long valor minimo: " + Long.MIN_VALUE);

        short valorShort = 23;
        System.out.println("short corresponde en bytes: " + Short.BYTES );
        System.out.println("short corresponde en bits: " + Short.SIZE);
        System.out.println("short valor maximo: " + Short.MAX_VALUE);
        System.out.println("short valor minimo: " + Short.MIN_VALUE);

        byte valorByte = 3;


    }
}
