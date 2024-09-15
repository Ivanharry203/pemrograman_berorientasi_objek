/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ivan_harry.pbo_week4;

/**
 *
 * @author acer
 */
public class manusia {
    private String nama;       
    protected int usia;        
    public String pekerjaan;   

    public manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Pekerjaan: " + pekerjaan);
    }
}
