class HewanDemo {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Hewan();

        hewan1.tetapkanNama("Harimau");
        hewan1.tetapkanJumlahKaki(4);
        hewan1.tetapkanMakanan("Daging");
        hewan1.tetapkanTipe("Karnivora");
        hewan1.tampilkanInfo();

        System.out.println();

        hewan2.tetapkanNama("Kerbau");
        hewan2.tetapkanJumlahKaki(4);
        hewan2.tetapkanMakanan("Rumput");
        hewan2.tetapkanTipe("Herbivora");
        hewan2.tampilkanInfo();
    }
}