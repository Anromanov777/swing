package custom;

import javax.swing.*;
import java.awt.*;

public class Ris {
    int x;
    int y;
    JFrame frame = new JFrame();

    public Ris() {
        JPanel panel = new JPanel(new GridBagLayout());
        ButtonGroup group = new ButtonGroup();
        JRadioButton b800 = new JRadioButton("800x600");
        JRadioButton b1024 = new JRadioButton("1024x768");
        JRadioButton b1200 = new JRadioButton("1200x600");
        JRadioButton b1280 = new JRadioButton("1280x1024");
        JRadioButton b1680 = new JRadioButton("1680x1050");
        JRadioButton b1920 = new JRadioButton("1920x1080");
        b800.setSelected(true);
        group.add(b800);
        group.add(b1024);
        group.add(b1200);
        group.add(b1280);
        group.add(b1680);
        group.add(b1920);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.anchor = GridBagConstraints.WEST;
        panel.add(b800, c);
        panel.add(b1024, c);
        panel.add(b1200, c);
        panel.add(b1280, c);
        panel.add(b1680, c);
        panel.add(b1920, c);

        JOptionPane.showConfirmDialog(null, panel, "Message", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        if (b800.isSelected()) {
            x = 800;
            y = 600;
        }
        if (b1024.isSelected()) {
            x = 1024;
            y = 768;
        }
        if (b1200.isSelected()) {
            x = 1200;
            y = 600;
        }
        if (b1280.isSelected()) {
            x = 1280;
            y = 1024;
        }
        if (b1680.isSelected()) {
            x = 1680;
            y = 1050;
        }
        if (b1920.isSelected()) {
            x = 1920;
            y = 1080;
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(x, y);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
