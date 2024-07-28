package bistroeperemeschenie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ris extends JPanel implements KeyListener {
    int x;
    int y;
    int speed = 50;
    JFrame frame = new JFrame();

    public Ris() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(this);
        frame.add(this);
        setPreferredSize(new Dimension(1000, 1000));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(new ImageIcon("res/kras.jpg").getImage(), x, y, null);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.isShiftDown()) {
            speed = 100;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x += speed;
            if (x >= getWidth()) x = x - getWidth();
            repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x -= speed;
            if (x < 0) x = getWidth() + x;
            repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y += speed;
            if (y > getHeight()) y = y - getHeight();
            repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            y -= speed;
            if (y < 0) y = getHeight() + y;
            repaint();
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SHIFT) speed = 50;

    }
}
