package LatihanEnheritance;

class Lingkaran extends BidangDuaDimensi {
    protected int sisi;

    public Lingkaran(String nama, int sisi) {
        super(nama);
        this.sisi = sisi;
    }

    public void luas() {
        System.out.println("Luas = " + 3.14*sisi*sisi);
    }
}