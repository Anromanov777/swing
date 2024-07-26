package test;

import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        frame.add(panel);

        JLabel label = new JLabel();
        String s="Привет!";
        label.setText(s);
        panel.add(label);
    }
}
