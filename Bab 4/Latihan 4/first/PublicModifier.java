package first;

public class PublicModifier {
    public int a = 2;
    public int b = 5;
    public int c = 9;

    public void kali() {
        int d = a * b * c;
        System.out.println("Hasil kali = " + d);
    }

    public void tambah() {
        int d = a + b + c;
        System.out.println("Hasil tambah = " + d);
    }

    public void kurang () {
        int d = a - b - c;
        System.out.println("Hasil kurang = " + d);
    }

    public void bagi() {
        double d = a / b / c;
        System.out.println("Hasil bagi = " + d);
    }

    public void rataRata() {
        double d = (a + b + c) / 3;
        System.out.println("Hasil rata - rata = " + d);
    }
}
