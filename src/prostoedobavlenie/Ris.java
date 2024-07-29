package prostoedobavlenie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

public class Ris extends JPanel {
    int x;
    int y;
    ArrayList<Integer> list = new ArrayList<>();

    public Ris() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        setPreferredSize(new Dimension(1000, 1000));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                mous1();
                list.add(e.getX());
                list.add(e.getY());
                repaint();
            }
        });
    }

    void mous1() {
        Random random = new Random();
        setBackground(Color.getHSBColor(random.nextFloat(0, 361), random.nextFloat(40, 80), random.nextFloat(60, 80)));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        draw3(g2);
    }

    void draw3(Graphics2D g) {
        for (int i = 0; i < list.size(); i += 2) {
            g.drawString(list.get(i) + " " + list.get(i + 1), list.get(i), list.get(i + 1));
        }
    }
}
