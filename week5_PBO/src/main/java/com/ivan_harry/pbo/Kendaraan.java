package com.ivan_harry.pbo;

// Kelas induk Kendaraan
class Kendaraan {
    String nama;
    int kecepatan;

    public Kendaraan(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}

// Kelas menengah KendaraanDarat
class KendaraanDarat extends Kendaraan {
    public KendaraanDarat(String nama, int kecepatan) {
        super(nama, kecepatan);
    }
}

// Kelas turunan Mobil
class Mobil extends KendaraanDarat {
    int jumlahPintu;

    public Mobil(String nama, int kecepatan, int jumlahPintu) {
        super(nama, kecepatan);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

// Kelas turunan SepedaMotor
class SepedaMotor extends KendaraanDarat {
    String jenisMesin;

    public SepedaMotor(String nama, int kecepatan, String jenisMesin) {
        super(nama, kecepatan);
        this.jenisMesin = jenisMesin;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}

// Kelas utama untuk menguji implementasi
