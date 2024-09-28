package com.ivan_harry.praktikumpbo_6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
class Pekerja extends Manusia {
    private double gaji;   // bersifat private

    // Constructor untuk inisialisasi nama, usia, pekerjaan, dan gaji
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);  // memanggil constructor superclass (Manusia)
        this.gaji = gaji;
    }

    // Getter dan Setter untuk atribut gaji
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override metode toString() untuk menampilkan informasi lengkap pekerja
    @Override
    public String toString() {
        return "Nama: " + getNama() +
               "\nUsia: " + usia + 
               "\nPekerjaan: " + pekerjaan + 
               "\nGaji: " + gaji;
    }
}
