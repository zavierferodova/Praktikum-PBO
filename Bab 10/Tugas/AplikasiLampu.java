import java.util.Scanner;

public class AplikasiLampu {
    public static void main(String[] args) {
        Lampu lampu = new Lampu();
        Scanner sc = new Scanner(System.in);
        lampu.statusLampu = lampu.setSaklar(0);

        System.out.println("Status Lampu = " + lampu.statusLampu);
        System.out.println("Ketikkan 2 untuk menyalakan lampu");
        System.out.println("1 untuk meredupkan lampu");
        System.out.println("0 untuk mematikan lampu");

        int saklar = lampu.setSaklar(sc.nextInt());

        if (saklar == 0) {
            lampu.matikanLampu();
        } else if (saklar == 1) {
            lampu.redupkanLampu();
        } else {
            lampu.hidupkanLampu();
        }

        sc.close();
    }    
}
