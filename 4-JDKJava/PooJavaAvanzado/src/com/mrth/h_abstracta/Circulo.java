package com.mrth.h_abstracta;

public class Circulo extends FigurasGeometricas{
    private double radio;
    @Override
    public double area() {
        return Math.PI * Math.pow(radio,2);
    }

    public Circulo(double radio) {
        super("circulo");
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
