package com.tugba;

import java.util.Random;
import java.util.UUID;

public class Menu {
    private Corbalar corbalar;
    private Icecekler icecekler;
    private Yemekler yemekler;
    private Tatlilar tatlilar;
    private Gunler gunler;


    Random random= new Random();
    public Menu() {


    }

    public Menu(Corbalar corbalar, Icecekler icecekler, Yemekler yemekler, Tatlilar tatlilar) {

        this.corbalar = corbalar;
        this.icecekler = icecekler;
        this.yemekler = yemekler;
        this.tatlilar = tatlilar;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Menu{");
        sb.append(", corbalar=").append(corbalar);
        sb.append(", icecekler=").append(icecekler);
        sb.append(", yiyecekler=").append(yemekler);
        sb.append(", tatlilar=").append(tatlilar);
        sb.append('}');
        return sb.toString();
    }


    public Corbalar getCorbalar() {
        return corbalar;
    }

    public void setCorbalar(Corbalar corbalar) {
        this.corbalar = corbalar;
    }

    public Icecekler getIcecekler() {
        return icecekler;
    }

    public void setIcecekler(Icecekler icecekler) {
        this.icecekler = icecekler;
    }

    public Yemekler getYiyecekler() {
        return yemekler;
    }

    public void setYiyecekler(Yemekler yemekler) {
        this.yemekler = yemekler;
    }

    public Tatlilar getTatlilar() {
        return tatlilar;
    }

    public void setTatlilar(Tatlilar tatlilar) {
        this.tatlilar = tatlilar;
    }

    public Gunler getGunler() {
        return gunler;
    }

    public void setGunler(Gunler gunler) {
        this.gunler = gunler;
    }


}
