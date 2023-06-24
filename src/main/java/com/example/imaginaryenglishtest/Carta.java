package com.example.imaginaryenglishtest;

import java.util.Arrays;
import java.util.List;

public class Carta {

    private String nombreCarta;

    public Carta(String nombreCarta) {
        this.nombreCarta = nombreCarta;
    }

    public String getNombreCarta() {
        return nombreCarta;
    }



    public static List<String> getValidNames(){
        return Arrays.asList("Dog", "Cat", "Cow", "Horse", "Pig", "Sheep", "Rabbit", "Chicken", "Duck", "Goat", "Guinea Pig", "Hamster", "Geese", "Donkey", "Canary");
    }

    public void setNombreCarta(String nombreCarta) {
        nombreCarta = nombreCarta.toLowerCase();
        if (getValidNames().contains(nombreCarta))
            this.nombreCarta = nombreCarta;
        else
            throw new IllegalArgumentException(nombreCarta + " invalido, debe ser uno de la lista");
    }

    public String toString(){
        return nombreCarta;
    }



}
