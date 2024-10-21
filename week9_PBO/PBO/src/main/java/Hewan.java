/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
abstract class Hewan {
    public abstract String suara();
    public void keterangan() {
        System.out.println(getClass().getSimpleName() + " mengeluarkan suara: " + suara());
    }
}
class Kucing extends Hewan {
    @Override
    public String suara() {
        return "Meong";
    }
}
class Anjing extends Hewan {
    @Override
    public String suara() {
        return "Guk Guk";
    }
}

