import java.util.Date;

class Dosen {
    String nama;
    int nik;
    String pendidikan;
    Date tglLahir = new Date();

    void tampilkanNama() {
        System.out.println("Nama dosen adalah " + nama);
    }

    void tampilkanTglLahir() {
        System.out.println("Tanggal lahir dosen adalah " + tglLahir);
    }

    void tampilkanNik() {
        System.out.println("NIK dosen adalah " + nik);
    }
}