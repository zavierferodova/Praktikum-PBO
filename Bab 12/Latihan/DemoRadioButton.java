import javax.swing.*;

public class DemoRadioButton {
    public static void main(String[] args) {
        Utama u = new Utama();
        u.setSize(1000, 100);

        JRadioButton[] teams = new JRadioButton[5];
        teams[0] = new JRadioButton("Sangat tidak setuju");
        teams[1] = new JRadioButton("Tidak setuju");
        teams[2] = new JRadioButton("Kurang setuju");
        teams[3] = new JRadioButton("Setuju", true);
        teams[4] = new JRadioButton("Sangat Setuju");

        JPanel panel = new JPanel();
        JLabel pernyataan = new JLabel("Modul Praktikum Pemrograman Berorientasi Objek Jelas dan Mudah");
        panel.add(pernyataan);

        ButtonGroup group = new ButtonGroup();
        for (int i = 0; i < teams.length; i++) {
            group.add(teams[i]);
            panel.add(teams[i]);
        }

        u.add(panel);
        u.setVisible(true);
    }
}
