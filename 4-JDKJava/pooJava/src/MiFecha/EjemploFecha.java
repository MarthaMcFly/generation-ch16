package MiFecha;

public class EjemploFecha {
    public static void main(String[] args) {
        Fecha f = new Fecha();
        f.setDia(23);
        f.setMes(4);
        f.setAnio(1999);

        System.out.println(f.getDia() +"/" + f.getMes() +"/" + f.getAnio());

    }
}
