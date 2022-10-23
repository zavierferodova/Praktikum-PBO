public class PersegiPanjang extends BangunDatar {
    protected int panjang;
    protected double lebar;

    protected double hitungLuas() {
        this.luas = panjang * lebar;
        return this.luas;
    }

    protected double hitungKeliling() {
        this.keliling = 2 * (panjang + lebar);
        return this.keliling;
    }
}
