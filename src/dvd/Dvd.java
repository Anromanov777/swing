package dvd;

import javax.swing.*;

public class Dvd extends JFrame {
    Dvd() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 400);
        setLocationRelativeTo(null);
        add(new Board()) ;
        setVisible(true);
    }
}
