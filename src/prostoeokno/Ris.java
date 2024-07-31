package prostoeokno;

import javax.swing.*;
import java.awt.*;

public class Ris extends JPanel {
    public Ris() {
        String s = JOptionPane.showInputDialog("Введите строку");
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        setPreferredSize(new Dimension(1000, 1000));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        JOptionPane.showMessageDialog(null, s);
    }
}
