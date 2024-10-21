/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public abstract class Kendaraan {
    abstract void berjalan();
    
    void info() {
        System.out.println("ini adalah kendaraan");
    }
    
}

class Mobil extends Kendaraan{
    @Override
    void berjalan() {
        System.out.println("Mobil sedang berjalan");
        
    }
}
class Sepeda extends Kendaraan {
    @Override
    void berjalan() {
         System.out.println("Sepeda sedang berjalandengan pelan.");
 }
}