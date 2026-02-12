package LatihanInheritance;

class BujurSangkar extends BidangDuaDimensi {
    protected int sisi;

    public BujurSangkar(String nama, int sisi) {
        super(nama);
        this.sisi = sisi;
    }

    @Override
    public void luas() {
        System.out.println("Luas = " + sisi*sisi);
    }
}