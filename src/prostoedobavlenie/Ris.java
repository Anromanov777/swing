package prostoedobavlenie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.Random;

public class Ris extends JPanel {
    LinkedList<Integer[]> list = new LinkedList<>();

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
                Random r = new Random();
                Integer[] mas = new Integer[5];
                mas[0] = e.getX();
                mas[1] = e.getY();
                mas[2] = r.nextInt(0, 256);
                mas[3] = r.nextInt(0, 256);
                mas[4] = r.nextInt(0, 256);
                list.add(mas);
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        draw3(g2);
    }

    void draw3(Graphics2D g) {
        for (Integer[] integers : list) {
            g.setColor(new Color(integers[2], integers[3], integers[4]));
            g.fillOval(integers[0] - 35, integers[1] - 35, 70, 70);
        }
    }
}
