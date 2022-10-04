class BankAccount {
    double saldo;
    int noRekening;

    void tetapkanNoRekening(int nomor) {
        noRekening = nomor;
    }

    void cekSaldo() {
        System.out.println("Sisa saldo anda adalah Rp. " + saldo);
    }

    void menabung(double jumlah) {
        saldo += jumlah;
        System.out.println("Berhasil menabung sebesar Rp. " + jumlah);
    }

    void menarik(double jumlah) {
        if (jumlah < saldo) {
            saldo -= jumlah;
            System.out.println("Berhasil menarik saldo sebesar Rp. " + jumlah);
        } else {
            System.out.println("Maaf saldo anda tidak mencukupi untuk menarik saldo");
        }
    }

    void transfer(double jumlah, int noRekening) {
        if (this.noRekening == noRekening) {
            System.out.println("Maaf tidak dapat mentransfer ke nomor sendiri !");
        } else {
            if (jumlah < saldo) {
                saldo -= jumlah;
                System.out.println("Berhasil mentransfer saldo sebesar Rp. " + jumlah);
            } else {
                System.out.println("Maaf saldo anda tidak mencukupi untuk melakukan transfer !");
            }        
        }
    }
}