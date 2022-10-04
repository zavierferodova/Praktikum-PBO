class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.tetapkanNoRekening(1234);
        account.menabung(100000);
        account.cekSaldo();
        account.menarik(20000);
        account.cekSaldo();
        account.transfer(30000, 4567);
        account.cekSaldo();
    }
}