public class SegitigaSamaSisi extends Segitiga {
    protected double alas;

    protected double hitungLuas() {
        double tinggi = Math.sqrt(Math.pow( alas, 2) - Math.pow((alas/2), 2));
        this.luas = alas * tinggi / 2;
        return this.luas;
    }

    protected double hitungKeliling() {
        this.keliling = 3*alas;
        return this.keliling;
    }
}
