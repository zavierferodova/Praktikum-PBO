public class Persegi extends BangunDatar {
    protected double sisi;    

    protected double hitungLuas() {
        this.luas = sisi * sisi;
        return this.luas;
    }

    protected double hitungKeliling() {
        this.keliling = 4 * sisi;
        return this.keliling;
    }
}
