public class PegawaiDemo {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        Pegawai pegawai2 = new Pegawai();
        Pegawai pegawai3 = new Pegawai();
        Pegawai pegawai4 = new Pegawai();
        Pegawai pegawai5 = new Pegawai();

        pegawai1.setNama("Andi");
        pegawai1.setNip(12736182);
        pegawai1.setGaji(4000000);
        pegawai1.showInfo();

        pegawai2.setNama("Budi");
        pegawai2.setNip(26192716);
        pegawai2.setGaji(3800000);
        pegawai2.showInfo();

        pegawai3.setNama("Deni");
        pegawai3.setNip(82718271);
        pegawai3.setGaji(4500000);
        pegawai3.showInfo();

        pegawai4.setNama("Sulis");
        pegawai4.setNip(91726152);
        pegawai4.setGaji(4200000);
        pegawai4.showInfo();

        pegawai5.setNama("Danu");
        pegawai5.setNip(62519172);
        pegawai5.setGaji(4340000);
        pegawai5.showInfo();
    }
}