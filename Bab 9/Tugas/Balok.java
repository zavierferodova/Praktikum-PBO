public class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return this.panjang * this.lebar * this.tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * ((this.panjang*this.lebar) + (this.panjang*this.tinggi) + (this.lebar*this.tinggi));
    }  
}
