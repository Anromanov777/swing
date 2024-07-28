package keylogger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;

public class Ris extends JPanel implements KeyListener {
    JFrame frame = new JFrame();

    Ris() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        setPreferredSize(new Dimension(1000, 1000));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.addKeyListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        File file=new File("names.txt");
        char a=e.getKeyChar();
        if ((a+"").matches("[a-zA-Z]| |\\d*")){
        try (OutputStream outputStream=new FileOutputStream(file,true)){
            outputStream.write(e.getKeyChar());
        }catch (Exception u){
            u.printStackTrace();
        }
        System.out.println(e.getKeyCode());}
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
