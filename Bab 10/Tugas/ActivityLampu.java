public interface ActivityLampu {
    public static final int LAMPU_HIDUP = 2;
    public static final int LAMPU_REDUP = 1;
    public static final int LAMPU_MATI = 0;
    public abstract void matikanLampu();
    public abstract void redupkanLampu();
    public abstract void hidupkanLampu();
}
