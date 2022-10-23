public class KendaraanDemo {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        Pesawat pesawat = new Pesawat();
        
        System.out.println("Mobil");
        System.out.println("Berat       : " + mobil.berat + " kg");
        System.out.println("Warna       : " + mobil.warna);
        System.out.println("Kecepatan   : " + mobil.kecepatan + " km/h");
        System.out.println("Jumlah roda : " + mobil.jumlahRoda);
        System.out.println();

        System.out.println("Pesawat");
        System.out.println("Berat       : " + pesawat.berat + " kg");
        System.out.println("Warna       : " + pesawat.warna);
        System.out.println("Kecepatan   : " + pesawat.kecepatan + " km/h");
        System.out.println("Jenis       : " + pesawat.jenis);
    }
}
