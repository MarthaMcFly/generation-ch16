public class Arreglos {
    public static void main(String[] args) {
        //Arreglos
        //No se pueden mezclar tipos de datos
        //Tenemos que definir el tamaño de nuestro arreglo
        // 1.Define el tipo de datos del arreglo
        // 2.Coloco [] junto al tipo de datos, esto indica que se va a tratar de un arreglo
        // 3. nombre del arreglo
        //4. Signo de asignacion
        //5. Abro {}   aquí van los datos del arreglo
        int [] numeroAleatorio = {1,2,3,4,5};  //  [] define que se trata de un arreglo
        String[] valores = {"hola", "adios", "byebye", "bounjour"};
        byte[] otrosNumeros = {1,2,3};

        //otra forma de declarar un arreglo:
        //los arreglos tienen un tamaño definido
        char[] caracteres = new char[4];
        caracteres[0] = 'h';
        caracteres[1] = 'o';
        caracteres[2] = 'l';
        caracteres[3] = 'a';


        System.out.println(numeroAleatorio[2]);
        System.out.println(valores[4]);
        System.out.println(caracteres);

        // for each: recorre la cantidad de elementos del arreglo
        for(String elemento : valores){
            System.out.println(elemento);
        }

        for(int numero : numeroAleatorio){
            System.out.println(numero);
        }

    }
}
