import java.lang.Math;

public class Bola extends BangunRuang {
    private double jariJari;
    private final double phi = 3.14;
    
    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double volume() {
        return 4 * this.phi * Math.pow(this.jariJari, 3) / 3;
    }

    @Override
    public double luasPermukaan() {
        return 4 * this.phi * Math.pow(this.jariJari, 2);
    }
}
