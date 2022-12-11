public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankPribadi bankPribadi = new BankPribadi();
        BankUmum bankUmum = new BankUmum();
        BankPasar bankPasar = new BankPasar();
        BankSyariah bankSyariah = new BankSyariah();

        System.out.println("Rasio Bunga Bank " + bank.rasioBunga() + "%");
        // System.out.println("Rasio Bunga Bank Pribadi " + bankPribadi.getRasioBunga() + "%");  // Error ygy karena private method
        System.out.println("Rasio Bunga Bank Umum " + bankUmum.rasioBunga() + "%");
        System.out.println("Rasio Bunga Bank Pasar " + bankPasar.rasioBunga() + "%");
        System.out.println("Rasio Bunga Bank Syariah " + bankSyariah.rasioBunga() + "%");
    }
}
