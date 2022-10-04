public class Pegawai {
    String nama;
    int nip;
    double gaji;

    void setNama(String nama) {
        this.nama = nama;
    }

    void setNip(int nip) {
        this.nip = nip;
    }

    void setGaji(double gaji) {
        this.gaji = gaji;
    }

    void showInfo() {
        System.out.println("Data Pegawai");
        System.out.println("Nip  : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Gaji : " + gaji);
        System.out.println("");
    }
}
