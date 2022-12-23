public class JajarGenjang extends MethodAbstract {
    private double alas;
    private double tinggi;
    private double sisiMiring;

    public JajarGenjang(double alas, double tinggi, double sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    public double getSisiMiring() {
        return sisiMiring;
    }

    public void setSisiMiring(double sisiMiring) {
        this.sisiMiring = sisiMiring;
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

    @Override
    public double luas() {        
        return alas * tinggi;
    }

    @Override
    public double keliling() {
        return 2 * (alas + sisiMiring);
    }
}
