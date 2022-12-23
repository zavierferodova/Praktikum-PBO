public class BangunDatar {
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang(20, 10);
        JajarGenjang jajarGenjang = new JajarGenjang(8, 4, 5);
        Lingkaran lingkaran = new Lingkaran(20);
        Segitiga segitiga = new Segitiga(20, 10, 20, 20, 20);

        System.out.println("Bangun Datar : ");
        System.out.println("Persegi Panjang");
        System.out.println("Luas     : " + persegiPanjang.getLuas() + " cm²");
        System.out.println("Keliling : " + persegiPanjang.getKell() + " cm");
        System.out.println();

        System.out.println("Jajar Genjang");
        System.out.println("Luas     : " + jajarGenjang.getLuas() + " cm²");
        System.out.println("Keliling : " + jajarGenjang.getKell() + " cm");
        System.out.println();

        System.out.println("Lingkaran");
        System.out.println("Luas     : " + lingkaran.getLuas() + " cm²");
        System.out.println("Keliling : " + lingkaran.getKell() + " cm");
        System.out.println();

        System.out.println("Segitiga");
        System.out.println("Luas     : " + segitiga.getLuas() + " cm²");
        System.out.println("Keliling : " + segitiga.getKell() + " cm");
        System.out.println();
    }
}
