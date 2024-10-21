package com.ivan_harry.pbo;

// Kelas induk Hewan
class Hewan {
    protected String nama;
    protected String jenis;

    public Hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
    }
}

// Kelas turunan Kucing
class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama, "Kucing");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara: Meow");
    }
}

// Kelas turunan Anjing
class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama, "Anjing");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara: Bark");
    }
}


