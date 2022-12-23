import java.lang.Math;

public class Lingkaran extends MethodAbstract {
    private double jariJari;
    private final double phi = 3.14;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getPhi() {
        return phi;
    }

    @Override
    public double luas() {
        return this.phi * Math.pow(this.jariJari, 2);
    }

    @Override
    public double keliling() {
        return this.phi * (2 * this.jariJari);
    }
}
