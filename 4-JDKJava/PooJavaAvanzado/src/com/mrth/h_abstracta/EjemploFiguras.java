package com.mrth.h_abstracta;

public class EjemploFiguras {
    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        t.setBase(5);
        t.setAltura(6);
        System.out.println("t es el objeto de triangulo= " + t.area());

        Circulo c = new Circulo();
        c.setRadio(15.5);
        System.out.println("c area del circulo " + c.area());
    }
}
