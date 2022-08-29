package com.mrth.h_abstracta;

public class Triangulo extends FigurasGeometricas{

    //Ponemos los datos que vamos a utilizar
    private float base;
    private float altura;

    //ponemos un constructor:
    public Triangulo(){

    }

    //Ponemos
    @Override  //sirve para sobreescribir los datos del método abstracto
    public double area (){
        return (getBase()*getAltura())/2;
    }

    //Agregamos los métodos get y seller para poder sacar los datos
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
