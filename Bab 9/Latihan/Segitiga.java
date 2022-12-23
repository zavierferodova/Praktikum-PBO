public class Segitiga extends MethodAbstract {
    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;
    private double sisiC;

    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getSisiA() {
        return sisiA;
    }

    public void setSisiA(double sisiA) {
        this.sisiA = sisiA;
    }

    public double getSisiB() {
        return sisiB;
    }

    public void setSisiB(double sisiB) {
        this.sisiB = sisiB;
    }

    public double getSisiC() {
        return sisiC;
    }

    public void setSisiC(double sisiC) {
        this.sisiC = sisiC;
    }

    @Override
    public double luas() {
        return 0.5 * this.alas * this.tinggi;
    }

    @Override
    public double keliling() {
        return sisiA + sisiB + sisiC;
    }
}
