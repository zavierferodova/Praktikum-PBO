public class LocalVariable {
    public void hitungUsia() {
        int usia = 0;
        int tahunSekarang = 2022;
        int tahunLahir = 1993;

        usia = tahunSekarang - tahunLahir;

        System.out.println("Usia saya : " + usia);
    }

    void beratBadan() {
        int umur = 0;
        int beratLahir = 3;
        int beratBadan = beratLahir + (umur / 2);

        System.out.println("Berat badan saya : " + beratBadan);
    }
}