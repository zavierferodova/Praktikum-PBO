public class TestPolymorphism {
    public static void main(String[] args) {
        Kucing tom = new Kucing();
        Anjing bull = new Anjing();
        Elang mightyEagle = new Elang();

        tom.beriNama("TOM");
        bull.beriNama("BULL");

        System.out.println(tom.panggilNama());
        System.out.println(tom.perilaku());
        System.out.println(tom.bersuara());

        System.out.println(bull.panggilNama());
        System.out.println(bull.perilaku());
        System.out.println(bull.bersuara());
    }
}
