package com.mrth.principal;

import com.mrth.herencia.BasePadre;
import com.mrth.herencia.Hija;
import com.mrth.herencia.Hijo;

import java.util.ArrayList;

public class EjemploHerencia {
    public static void main(String[] args) {
        Hija h = new Hija();
        h.visualizarA();
        Hijo ho = new Hijo();
        ho.setA(17376);
        ho.visualizarABC();


        BasePadre obj = new BasePadre();
        obj.setA(2345);
        Object miObj = new BasePadre();



        System.out.println("atributo de clase BasePadre" + h.getA());
        System.out.println("atributo de clase hijo: " + ho.getA());
    }
}
