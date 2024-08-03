package prostoeokno;

import javax.swing.*;
import java.awt.*;

public class Ris extends JPanel {
    public Ris() {
        String s = JOptionPane.showInputDialog("Введите строку");
        JOptionPane.showMessageDialog(null, s);
    }
}
