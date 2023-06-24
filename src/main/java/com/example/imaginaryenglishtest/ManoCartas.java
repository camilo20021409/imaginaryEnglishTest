package com.example.imaginaryenglishtest;

import java.util.ArrayList;
import java.util.List;

public class ManoCartas {

    private ArrayList <Carta> mano;

    public ManoCartas() {
        this.mano = new ArrayList<>();
        List<String> nombreCarta = Carta.getValidNames();

        for (String carta : nombreCarta){

            mano.add(new Carta(carta));
        }

    }


}
