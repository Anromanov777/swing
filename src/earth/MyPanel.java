package earth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {
    int xz;
    int yz;
    int grad;


    MyPanel() {
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        setBackground(Color.BLACK);
        g2.drawImage(getImage(1).getImage(), getCentr(1, "x"), getCentr(1, "y"), this);
        g2.drawImage(getImage(2).getImage(), xz, yz, this);

    }

    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            draw1(400);
            repaint();
        }
    };

    void draw1(int radius) {
        if (grad == 360) grad = 0;
        double radian = Math.toRadians(grad);
        xz = (int) (radius * Math.cos(radian)) + getCentr(2, "x");
        yz = (int) (radius * Math.sin(radian)) + getCentr(2, "y");
        grad++;
    }

    Timer timer = new Timer(1, listener);

    ImageIcon getImage(int n) {
        switch (n) {
            case 1:
                return new ImageIcon("res/sun.png");
            case 2:
                return new ImageIcon("res/zemlia.png");
            default:
                return null;
        }
    }

    int getCentr(int ris, String xy) {
        if (xy.equals("x"))
            return getWidth() / 2 - getImage(ris).getImage().getWidth(this) / 2;
        else return getHeight() / 2 - getImage(ris).getImage().getHeight(this) / 2;
    }
}
