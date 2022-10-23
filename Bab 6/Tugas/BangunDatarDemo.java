public class BangunDatarDemo {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi();
        SegitigaSamaKaki segitigaSamaKaki = new SegitigaSamaKaki();

        persegi.sisi = 4;
        System.out.println("Persegi");
        System.out.println("Luas     : " + persegi.hitungLuas() + " m²");
        System.out.println("Keliling : " + persegi.hitungKeliling() + " m");
        System.out.println();

        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        System.out.println("Persegi Panjang");
        System.out.println("Luas     : " + persegiPanjang.hitungLuas() + " m²");
        System.out.println("Keliling : " + persegiPanjang.hitungKeliling() + " m");
        System.out.println();        

        segitigaSamaKaki.sisiMiring = 21;
        segitigaSamaKaki.alas = 14;
        System.out.println("Segitiga Sama Kaki");
        System.out.println("Luas     : " + segitigaSamaKaki.hitungLuas() + " m²");
        System.out.println("Keliling : " + segitigaSamaKaki.hitungKeliling() + " m");
        System.out.println();

        segitigaSamaSisi.alas = 10;
        System.out.println("Segitiga Sama Sisi");
        System.out.println("Luas     : " + segitigaSamaSisi.hitungLuas() + " m²");
        System.out.println("Keliling : " + segitigaSamaSisi.hitungKeliling() + " m");
        System.out.println();
    }
}
