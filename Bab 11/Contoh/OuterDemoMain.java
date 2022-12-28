public class OuterDemoMain {
    public static void main(String[] args) {
        OuterDemo2 outer = new OuterDemo2();
        OuterDemo2.InnerDemo inner =  outer.new InnerDemo();
        System.out.println(inner.getNum());
    }    
}
