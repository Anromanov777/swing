package otherplanets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ris extends JPanel {


    JFrame frame = new JFrame("Другие планеты");
    Planets sun = new Planets("res/sun.png", 0, 0);
    Planets mercurii = new Planets("res/mercurii.png", 70, 1);
    Planets zemlia = new Planets("res/zemlia.png", 140, 0.7);
    Planets mars = new Planets("res/mars.png", 210, 0.6);
    Planets jupiter = new Planets("res/jupiter.png", 320, 0.2);
    Planets saturn = new Planets("res/saturn.png", 470, 0.1);
    Planets uran = new Planets("res/uran.png", 600, 0.1);

    Ris() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 1500);
        frame.setLocationRelativeTo(null);
        frame.add(this);
        frame.setVisible(true);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        setBackground(Color.BLACK);
        g2.drawImage(sun.getImage2(), sun.getX() + frame.getWidth() / 2, sun.getY() + frame.getHeight() / 2, this);
        g2.drawImage(mercurii.getImage2(), mercurii.getX() + frame.getWidth() / 2, mercurii.getY() + frame.getHeight() / 2, this);
        g2.drawImage(zemlia.getImage2(), zemlia.getX() + frame.getWidth() / 2, zemlia.getY() + frame.getHeight() / 2, this);
        g2.drawImage(mars.getImage2(), mars.getX() + frame.getWidth() / 2, mars.getY() + frame.getHeight() / 2, this);
        g2.drawImage(jupiter.getImage2(), jupiter.getX() + frame.getWidth() / 2, jupiter.getY() + frame.getHeight() / 2, this);
        g2.drawImage(saturn.getImage2(), saturn.getX() + frame.getWidth() / 2, saturn.getY() + frame.getHeight() / 2, this);
        g2.drawImage(uran.getImage2(), uran.getX() + frame.getWidth() / 2, uran.getY() + frame.getHeight() / 2, this);

    }

    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    };

    Timer timer = new Timer(1, listener);
}
