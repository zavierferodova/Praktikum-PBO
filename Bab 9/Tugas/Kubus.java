import java.lang.Math;

public class Kubus extends BangunRuang {
    private double alas;

    public Kubus(double alas) {
        this.alas = alas;
    }

    @Override
    public double volume() {
        return Math.pow(this.alas, 3);
    }

    @Override
    public double luasPermukaan() {
        return 6 * Math.pow(this.alas, 2);
    }
    
}
