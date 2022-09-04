package com.mrth.h_abstracta;

public abstract class FigurasGeometricas {

    private String nombre; //Esto lo hice después.


    //Vamos a definir una clase abstracta
    //Se llama abstracta porque tieneu n método abstracto
    //Un método abstracto es un método que solamente tiene una declaración,, y solo define el nombre

    //Definimos un método:
    public abstract double area ( );

    public FigurasGeometricas(String nombre) {
        this.nombre = nombre + "area > " + area();
    }

    @Override
    public String toString(){
        return nombre +  "area > " + area();
    }
}
