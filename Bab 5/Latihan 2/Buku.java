public class Buku {
    String namaPengarang;
    String judulBuku;
    int tahunTerbit;
    int cetakanKe;
    double hargaJual;

    Buku(
        String judulBuku, 
        String namaPengarang,
        int tahunTerbit, 
        int cetakanKe, 
        double hargaJual) {
            this.namaPengarang = namaPengarang;
            this.judulBuku = judulBuku;
            this.tahunTerbit = tahunTerbit;
            this.cetakanKe = cetakanKe;
            this.hargaJual = hargaJual;
            
    }

    Buku(String judulBuku, String namaPengarang, int tahunTerbit) {
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
    }

    Buku(String judulBuku, String namaPengarang) {
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
    }

    void info() {
        System.out.println("Judul          : " + this.judulBuku);
        System.out.println("Nama pengarang : " + this.namaPengarang);
        System.out.println("Tahun terbit   : " + this.tahunTerbit);
        System.out.println("Cetakan ke     : " + this.cetakanKe);
        System.out.println("Harga jual     : Rp " + this.hargaJual);
        System.out.println();
    }
}
