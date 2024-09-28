package com.ivan_harry.praktikumpbo_6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Pekerja
        Pekerja pekerja = new Pekerja("Andi", 30, "Programmer", 5000000);

        // Menampilkan informasi pekerja awal
        System.out.println("Informasi Pekerja:");
        System.out.println(pekerja.toString());

        // Mengubah nama pekerja menggunakan metode setter
        pekerja.setNama("Budi");

        // Menampilkan ulang informasi pekerja setelah perubahan nama
        System.out.println("\nInformasi Pekerja Setelah Perubahan Nama:");
        System.out.println(pekerja.toString());
    }
}


