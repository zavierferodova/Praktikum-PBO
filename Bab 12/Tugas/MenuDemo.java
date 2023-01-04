import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class MenuDemo extends JFrame {
    public MenuDemo() {
        setSize(1000, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        MenuDemo frame = new MenuDemo();
        JPanel panel = new JPanel();
        JMenu menu = new JMenu("Ubah warna");
        JMenuItem itemRed = new JMenuItem(new AbstractAction("Merah") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.RED);
            }
        });
        JMenuItem itemYellow = new JMenuItem(new AbstractAction("Kuning") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.YELLOW);
            }
        });
        JMenuItem itemHijau = new JMenuItem(new AbstractAction("Hijau") {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.GREEN);
            }
        });
        menu.add(itemRed);
        menu.add(itemYellow);
        menu.add(itemHijau);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        frame.add(panel);
        frame.setJMenuBar(menuBar);
    }
}