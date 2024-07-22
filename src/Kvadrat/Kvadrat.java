package Kvadrat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kvadrat extends JPanel {

    int x;
    int y;
    int sw = 1;

    Kvadrat() {
        start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(getImage().getImage(), x, y, null);
    }

    private ImageIcon getImage() {
        ImageIcon icon = new ImageIcon("res/Nastia.png");
        return icon;
    }

    private void setCoord() {
        int w = getWidth();
        int h = getHeight();
        int step=10;
        switch (sw) {
            case 1: {
                if (x + step < (w - getImage().getIconWidth())) x += step;
                else {
                    sw = 2;
                    x = w - getImage().getIconWidth();
                }
            }
            break;
            case 2: {
                if (y + step < (h - getImage().getIconHeight())) y += step;
                else {
                    sw = 3;
                    y = h - getImage().getIconHeight();
                }
            }
            break;
            case 3: {
                if (x-step > 0) x -= step;
                else {
                    sw = 4;
                    x = 0;
                }
            }
            break;
            case 4: {
                if (y-step > 0) y -= step;
                else {
                    sw = 1;
                    y = 0;
                }
            }
            break;
        }


    }

    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            setCoord();
            repaint();
        }
    };

    void start() {
        Timer timer = new Timer(5, listener);
        timer.start();
    }
}
