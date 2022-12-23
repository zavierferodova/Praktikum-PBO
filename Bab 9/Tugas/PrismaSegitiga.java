public class PrismaSegitiga extends BangunRuang {
    private double alasSegitiga;
    private double tinggiSegitiga;
    private double tinggiPrisma;

    public PrismaSegitiga(double alasSegitiga, double tinggiSegitiga, double tinggiPrisma) {
        this.alasSegitiga = alasSegitiga;
        this.tinggiSegitiga = tinggiSegitiga;
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double volume() {
        return (0.5 * alasSegitiga * tinggiSegitiga) * tinggiPrisma;
    }

    @Override
    public double luasPermukaan() {
        return (2 * (0.5 * alasSegitiga * tinggiSegitiga)) + (3 * (alasSegitiga * tinggiPrisma));
    }

    
}
