/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ivan_harry.week_3;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        // Create two objects of Mobil
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2019, "Putih");

        // Display information of both cars
        mobil1.displayInfo();
        mobil2.displayInfo();

        // Start the engine of both cars
        mobil1.startEngine();
        mobil2.startEngine();

        // Change the color of mobil1
        mobil1.ubahWarna("Merah");
        mobil1.displayInfo();
    }
}

