package MiSaludo;

public class EjemploSaludo {
    public static void main(String[] args) {
        Saludo objSaludo;
        objSaludo = new Saludo();
        objSaludo.saludar();

        Saludo objSaludo0 = new Saludo();
        System.out.println(objSaludo.saludar0());
        System.out.println("este es otro objeto: ->" + objSaludo0.saludar0());
    objSaludo.textoS = "Hola";
        System.out.println("objSaludo0 = " + objSaludo);

        objSaludo0.a = 4;
        System.out.println("objSaludo0 = " + objSaludo0);
    }
}
