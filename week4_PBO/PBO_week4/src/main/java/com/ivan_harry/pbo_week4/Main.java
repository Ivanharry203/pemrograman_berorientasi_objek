/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ivan_harry.pbo_week4;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        pekerja pekerja1 = new pekerja("ivan", 20, "gamer", 7000000);

        
        System.out.println("Informasi Pekerja Awal:");
        System.out.println(pekerja1.toString());

    
        pekerja1.setNama("Harry");

        
        System.out.println("\nInformasi Pekerja Setelah Nama Diubah:");
        System.out.println(pekerja1.toString());
    }
}
