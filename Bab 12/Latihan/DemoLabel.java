import java.net.URL;
import javax.swing.*;

public class DemoLabel {
    public static void main(String[] args) {
        Utama u = new Utama();
        u.setSize(500, 500);
        URL img = FrameB.class.getResource("snakehand.jpg");
        ImageIcon ikon = new ImageIcon(img);
        JLabel label = new JLabel("Label", ikon, SwingConstants.CENTER);
        JPanel panel = new JPanel();
        panel.add(label);
        u.add(panel);
    }
}
