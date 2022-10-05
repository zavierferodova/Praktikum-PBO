package second;

import first.ProtectedModifier;

public class ProtectedDemo {
    public static void main(String[] args) {
        ProtectedModifier pm = new ProtectedModifier();
        pm.printInfo(); // error
        pm.sendMessage(); // error
    }
}
