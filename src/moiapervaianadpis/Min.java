package moiapervaianadpis;

import javax.swing.*;
import java.awt.*;

public class Min {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new GridBagLayout());
        frame.add(panel);
        panel.setPreferredSize(new Dimension(1000, 1000));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Моя первая надпись!");
        Font font = new Font("", Font.BOLD, 50);
        label.setFont(font);
        panel.add(label);
        frame.setVisible(true);
    }
}
