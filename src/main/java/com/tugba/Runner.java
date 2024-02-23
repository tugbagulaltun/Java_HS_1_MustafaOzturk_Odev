package com.tugba;

public class Runner {
    public static void main(String[] args) {
        Manager manager = new Manager();

        for (Gunler gun : Gunler.values()) {
            Menu gununMenusu = manager.menuOlustur();
            System.out.println(gun + " GUNU ICIN OLUSTURULAN MENU: " + gununMenusu);
        }
    }
}
