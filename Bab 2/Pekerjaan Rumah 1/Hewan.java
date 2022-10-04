public class Hewan {
    String nama;
    int jumlahKaki;
    String makanan;
    String tipe;

    void tetapkanNama(String nama) {
        this.nama = nama;
    }

    void tetapkanJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    void tetapkanMakanan(String makanan) {
        this.makanan = makanan;
    }

    void tetapkanTipe(String tipe) {
        this.tipe = tipe;
    }

    void tampilkanInfo() {
        System.out.println("Nama Hewan  : " + nama);
        System.out.println("Jumlah Kaki : " + jumlahKaki);
        System.out.println("Tipe Hewan  : " + tipe);
    }
}