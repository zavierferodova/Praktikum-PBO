public abstract class MethodAbstract {
    public abstract double luas();
    public abstract double keliling();

    public double getLuas() {
        return luas();
    }

    public double getKell() {
        return keliling();
    }
}