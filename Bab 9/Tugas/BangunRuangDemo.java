public class BangunRuangDemo {
    public static void main(String[] args) {
        Balok balok = new Balok(10, 7, 5);
        Kubus kubus = new Kubus(6);
        Bola bola = new Bola(9);
        Kerucut kerucut = new Kerucut(5, 12, 13);
        PrismaSegitiga prismaSegitiga = new PrismaSegitiga(6, 5, 8);

        System.out.println("Balok");
        System.out.println("Volume         : " + balok.volume() + " cm³");
        System.out.println("Luas Permukaan : " + balok.luasPermukaan() + " cm²");
        System.out.println();

        System.out.println("Kubus");
        System.out.println("Volume         : " + kubus.volume() + " cm³");
        System.out.println("Luas Permukaan : " + kubus.luasPermukaan() + " cm²");
        System.out.println();

        System.out.println("Bola");
        System.out.println("Volume         : " + bola.volume() + " cm³");
        System.out.println("Luas Permukaan : " + bola.luasPermukaan() + " cm²");
        System.out.println();

        System.out.println("Kerucut");
        System.out.println("Volume         : " + kerucut.volume() + " cm³");
        System.out.println("Luas Permukaan : " + kerucut.luasPermukaan() + " cm²");
        System.out.println();

        System.out.println("Prisma Segitiga");
        System.out.println("Volume         : " + prismaSegitiga.volume() + " cm³");
        System.out.println("Luas Permukaan : " + prismaSegitiga.luasPermukaan() + " cm²");
        System.out.println();
    }
}
