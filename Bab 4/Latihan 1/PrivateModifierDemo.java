public class PrivateModifierDemo {
    public static void main(String[] args) {
        PrivateModifier pv = new PrivateModifier();
        pv.printInfo();
        System.out.println(pv.name); // error
    }
}
