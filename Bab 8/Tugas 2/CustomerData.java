public class CustomerData {
    private String nama;
    private String alamat = "-";
    private String tanggalLahir = "-";
    private String pekerjaan = "-";
    private double gaji;

    public CustomerData(String nama, String alamat, String tanggalLahir, String pekerjaan, double gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.pekerjaan = pekerjaan;
        this.gaji = gaji;
    }

    public CustomerData(String nama, String alamat, String tanggalLahir) {
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
    }

    public CustomerData(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void info() {
        System.out.println("Nama          : " + this.nama);
        System.out.println("Tanggal Lahir : " + this.tanggalLahir);
        System.out.println("Alamat        : " + this.alamat);
        System.out.println("Pekerjaan     : " + this.pekerjaan);
        System.out.println("Gaji          : " + this.gaji);
        System.out.println();
    }
}
