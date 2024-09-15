/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ivan_harry.pbo_week4;

/**
 *
 * @author acer
 */
public class pekerja extends manusia {
     private double gaji;

    // Constructor untuk menginisialisasi atribut nama, usia, pekerjaan, dan gaji
    public pekerja(String nama, int usia, String pekerjaan, double gaji) {
        // Memanggil constructor superclass (Manusia)
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    // Getter untuk gaji
    public double getGaji() {
        return gaji;
    }

    // Setter untuk gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override metode toString() untuk menampilkan informasi pekerja
    @Override
    public String toString() {
        return "Nama: " + getNama() + "\n" +
               "Usia: " + usia + "\n" +  // usia bisa langsung diakses karena protected
               "Pekerjaan: " + pekerjaan + "\n" +
               "Gaji: Rp" + gaji;
    }
}

