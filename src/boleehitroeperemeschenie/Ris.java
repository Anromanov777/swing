package boleehitroeperemeschenie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ris extends JPanel implements KeyListener {
    int x = 0;
    int y = 0;

    JFrame frame = new JFrame();

    public Ris() {
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
        g2.drawImage(new ImageIcon("res/kras.jpg").getImage(), x, y, this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x += 50;
            if (x >= getWidth()) x = x - getWidth();
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x -= 50;
            if (x < 0) x = getWidth() + x;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y += 50;
            if (y >= getHeight()) y = y - getHeight();
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            y -= 50;
            if (y < 0) y = getHeight() + y;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
