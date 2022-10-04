public class NilaiDemo {
    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        nilai.setNilaiTugas(88);
        nilai.setNilaiUTS(82);
        nilai.setNilaiUAS(85);
        System.out.println(nilai.getNilaiTotal());
    }
}
