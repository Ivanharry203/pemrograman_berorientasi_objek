package com.ivan_harry.pbo;
public class MainHewan {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Kitty");
        Anjing anjing = new Anjing("Buddy");

        kucing.tampilkanInfo();
        System.out.println();
        anjing.tampilkanInfo();
    }
}