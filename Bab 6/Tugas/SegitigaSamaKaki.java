public class SegitigaSamaKaki extends Segitiga {
    protected double sisiMiring;

    protected double hitungLuas() {
        double tinggi = Math.sqrt(Math.pow( sisiMiring, 2) - Math.pow((alas / 2), 2));
        this.luas = (alas / 2) * tinggi;
        return this.luas;
    }

    protected double hitungKeliling() {
        this.keliling = (2*sisiMiring)+alas;
        return this.keliling;
    }
}
