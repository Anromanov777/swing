package dvd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Random;

public class Board extends JPanel {
    int x;
    int y;
    boolean bx = true;
    boolean by = true;
    Color randomColor;

    Board() {
        setRandomCol();
        start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        setBackground(Color.BLACK);
        g2.setColor(randomColor);
        Rectangle2D rectangle2D = new Rectangle2D.Double(x, y, 256, 116);
        g2.fill(rectangle2D);
        g2.drawImage(icon().getImage(), x, y, null);
    }

    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            coord();
            repaint();
        }
    };

    void coord() {
        int w = getWidth();
        int h = getHeight();
        if (x + icon().getIconWidth() > w) {
            bx = false;
            setRandomCol();
        } else if (x < 0) {
            bx = true;
            setRandomCol();
        }
        if (bx) x++;
        else x--;
        if (y + icon().getIconHeight() > h) {
            by = false;
            setRandomCol();
        } else if (y < 0) {
            by = true;
            setRandomCol();
        }
        if (by) y++;
        else y--;
    }

    void setRandomCol() {
        Random r = new Random();
        randomColor = Color.getHSBColor(r.nextFloat(0, 361), 50, 50);
    }

    void start() {
        Timer timer = new Timer(3, listener);
        timer.start();
    }

    ImageIcon icon() {
        return new ImageIcon("res/dvd.png");
    }
}
