package MiFecha;

import org.w3c.dom.ls.LSOutput;

//Declaro la clase Fecha
public class Fecha {
    //le doy atributos
    private int dia;
    private int mes;
    private int anio;

    //llamo al constructor

    public Fecha(){
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.anio = año;
    }
 //Pongo los metodos get
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAnio() {
        return anio;
    }
    //pongo los métodos set


    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
