public class Nilai {
    int nilaiUTS;
    int nilaiUAS;
    int nilaiTugas;
    double nilaiTotal;

    void setNilaiUTS(int nilai) {
        nilaiUTS = nilai;
    }

    void setNilaiUAS(int nilai) {
        nilaiUAS = nilai;
    }

    void setNilaiTugas(int nilai) {
        nilaiTugas = nilai;
    }

    double getNilaiTotal() {
        nilaiTotal = Double.valueOf(nilaiUTS + nilaiUAS + nilaiTugas) / 3;
        return nilaiTotal;
    }
}
