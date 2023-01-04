import javax.swing.*;

public class DemoComboBox extends JFrame {
    public DemoComboBox() {
        super("Belajar Mengenal GUI");
        setSize(1000, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        DemoComboBox frame = new DemoComboBox();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Modul Praktikum Pemrograman Berorientasi Objek Jelas dan Mudah");
        String text[] = {"Sangat tidak setuju", "Tidak setuju", "Kurang setuju", "Setuju", "Sangat setuju"};
        JComboBox cb = new JComboBox(text);
        panel.add(label);
        panel.add(cb);
        frame.add(panel);
    }
}
