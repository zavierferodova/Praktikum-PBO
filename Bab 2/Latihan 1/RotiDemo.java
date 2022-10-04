public class RotiDemo {
    public static void main(String[] args) {
        Roti roti = new Roti();
        roti.beriWarna("Hijau");
        roti.beriRasa("Pandan");
        roti.timbangBerat(30);
        roti.hargaJual(6000);
        roti.infoRoti();

        Roti roti2 = new Roti();
        roti2.beriWarna("Kuning");
        roti2.beriRasa("Melon");
        roti2.timbangBerat(30);
        roti2.hargaJual(6000);
        roti2.infoRoti();

        Roti roti3 = new Roti();
        roti3.beriWarna("Merah");
        roti3.beriRasa("Strabbery");
        roti3.timbangBerat(30);
        roti3.hargaJual(6000);
        roti3.infoRoti();
    }
}