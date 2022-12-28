public class OuterDemo2 {
    private int num = 175;

    public class InnerDemo {
        public int getNum() {
            System.out.println("Ini adalah nilai dari variable private outerDemo");
            return num;
        }
    }    
}
