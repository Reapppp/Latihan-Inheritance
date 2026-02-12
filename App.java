package LatihanInheritance;

class App {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar = new BujurSangkar("Bujur Sangkar", 5);
        Lingkaran lingkaran = new Lingkaran("Lingkaran", 10);

        bujurSangkar.info();
        bujurSangkar.luas();
        lingkaran.info();
        lingkaran.luas();
    }
}