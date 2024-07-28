package prostoeperemeschenie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ris extends JFrame implements KeyListener {
    int x;
    int y;

    Ris() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        panel.setPreferredSize(new Dimension(1000,1000));
        pack();
        setLocationRelativeTo(null);


        setVisible(true);
        addKeyListener(this);
    }

    JPanel panel = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.drawImage(new ImageIcon("res/kras.jpg").getImage(), x, y, null);
        }
    };

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT & x + 100 <= getWidth()) {
            x += 50;
            repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT & x - 50 >= 0) {
            x -= 50;
            repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN & y + 100 <= getWidth()) {
            y += 50;
            repaint();
        }
        if (e.getKeyCode() == KeyEvent.VK_UP & y - 50 >= 0) {
            y -= 50;
            repaint();
        }
    }
}
