package com.tugba;

import java.util.Random;

public class Manager {
    public Menu menuOlustur() {
        Random random = new Random();
        Corbalar corba = Corbalar.values()[random.nextInt(Corbalar.values().length)];
        Icecekler icecek = Icecekler.values()[random.nextInt(Icecekler.values().length)];
        Yemekler yemek = Yemekler.values()[random.nextInt(Yemekler.values().length)];
        Tatlilar tatli = Tatlilar.values()[random.nextInt(Tatlilar.values().length)];

        return new Menu(corba, icecek, yemek, tatli);
    }
}
