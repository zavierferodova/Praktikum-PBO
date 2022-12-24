public class Lampu implements ActivityLampu {
    public int statusLampu;

    @Override
    public void matikanLampu() {
        if (statusLampu == 0) {
            System.out.println("Lampu sudah dalam kondisi mati");
        } else if (statusLampu == 1) {
            statusLampu -= 1;
            System.out.println("Lampu sudah dimatikan");
        }
    }

    @Override
    public void hidupkanLampu() {
        if (statusLampu == 1) {
            System.out.println("Lampu sudah dinyalakan\n***");
        } else {
            statusLampu += 1;
            System.out.println("Lampu sudah dalam kondisi menyala");
        }
    }
    
    public int setSaklar(int saklar) {
        return statusLampu = saklar;
    }
}
