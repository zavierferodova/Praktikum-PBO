import java.lang.Math;;

public class Kerucut extends BangunRuang {
    private double jariJari;
    private double tinggi;
    private double sisiMiring;
    private final double phi = 3.14;

    public Kerucut(double jariJari, double tinggi, double sisiMiring) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    @Override
    public double volume() {
        return this.phi * Math.pow(this.jariJari, 2) * this.tinggi / 3;
    }

    @Override
    public double luasPermukaan() {
        return this.phi * this.jariJari * (this.sisiMiring + this.jariJari);
    }
}
