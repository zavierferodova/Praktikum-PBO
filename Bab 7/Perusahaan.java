public class Perusahaan {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        Manager m2 = new Manager();
        Manager m3 = new Manager();
        Manager m4 = new Manager();
        Manager m5 = new Manager();

        m1.setNama("Anggabaya Mangunsong");
        m1.setGaji(6000000);
        m1.setUsia(28);
        m1.setJamKerja(8.5f);

        System.out.println("Informasi Karyawan");
        System.out.println("Nama      : " + m1.getNama());
        System.out.println("Usia      : " + m1.getUsia());
        System.out.println("Jam Kerja : " + m1.getJamKerja());
        System.out.println("Gaji      : " + m1.getGaji());
        System.out.println();

        m2.setNama("Maimunah Mayasari");
        m2.setGaji(5500000);
        m2.setUsia(32);
        m2.setJamKerja(7.5f);

        System.out.println("Informasi Karyawan");
        System.out.println("Nama      : " + m2.getNama());
        System.out.println("Usia      : " + m2.getUsia());
        System.out.println("Jam Kerja : " + m2.getJamKerja());
        System.out.println("Gaji      : " + m2.getGaji());
        System.out.println();

        m3.setNama("Gada Sihotang");
        m3.setGaji(8500000);
        m3.setUsia(36);
        m3.setJamKerja(8.0f);

        System.out.println("Informasi Karyawan");
        System.out.println("Nama      : " + m3.getNama());
        System.out.println("Usia      : " + m3.getUsia());
        System.out.println("Jam Kerja : " + m3.getJamKerja());
        System.out.println("Gaji      : " + m3.getGaji());
        System.out.println();

        m4.setNama("Raisa Susanti");
        m4.setGaji(4500000);
        m4.setUsia(25);
        m4.setJamKerja(6.5f);

        System.out.println("Informasi Karyawan");
        System.out.println("Nama      : " + m4.getNama());
        System.out.println("Usia      : " + m4.getUsia());
        System.out.println("Jam Kerja : " + m4.getJamKerja());
        System.out.println("Gaji      : " + m4.getGaji());
        System.out.println();

        m5.setNama("Karen Purnawati");
        m5.setGaji(7000000);
        m5.setUsia(29);
        m5.setJamKerja(7.5f);

        System.out.println("Informasi Karyawan");
        System.out.println("Nama      : " + m5.getNama());
        System.out.println("Usia      : " + m5.getUsia());
        System.out.println("Jam Kerja : " + m5.getJamKerja());
        System.out.println("Gaji      : " + m5.getGaji());
        System.out.println();
    }
}