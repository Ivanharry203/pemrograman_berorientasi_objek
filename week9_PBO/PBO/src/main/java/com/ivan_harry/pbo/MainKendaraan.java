package com.ivan_harry.pbo;

public class MainKendaraan {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 180, 4);
        SepedaMotor motor = new SepedaMotor("Yamaha", 120, "2-tak");

        mobil.tampilkanInfo();
        System.out.println();
        motor.tampilkanInfo();
    }
}
