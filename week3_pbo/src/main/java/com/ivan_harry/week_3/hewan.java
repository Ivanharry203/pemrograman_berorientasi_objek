/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ivan_harry.week_3;

/**
 *
 * @author acer
 */
public class hewan {
    private String nama;
    private int umur;
    
    public hewan (String nama,int umur){
        this.nama =nama;
        this.umur = umur;    
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getUmur (){
        return umur;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    void suara(){
        System.out.println("Hewan Bersuara");
    }
    void info(){
        System.out.println("nama:"+getNama() + ",Umur:" + getUmur());
    }
}