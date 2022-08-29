package com.mrth.herencia;

public class BasePadre {
    //Defino los atributos
    private int a;
    private double b;
    private String c;

    //defino constructor (en este caso sin atributos):
    public BasePadre() {
    }

    //defino métodos:
    public void visualizarA(){
        System.out.println("obt h =>soy un método de la clase BasePadre");
    }
    public void visualizarABC(){
        System.out.println("obt ho =>soy el método visualizar ABC");
    }

    //métodos accesores get y set

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}
