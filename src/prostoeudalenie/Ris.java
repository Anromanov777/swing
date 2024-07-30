package prostoeudalenie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.util.LinkedList;
import java.util.Random;

public class Ris extends JPanel {
    LinkedList<Ellipse2D> list = new LinkedList<>();
    LinkedList<Color> colors = new LinkedList<>();

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
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);

                setBackground(Color.orange);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (e.getButton() == MouseEvent.BUTTON2) {
                    for (int i = list.size()-1; i !=-1 ; i--) {
                        if (list.get(i).contains(e.getPoint())) {
                            list.remove(i);
                            colors.remove(i);
                            repaint();
                            return;
                        }
                    }
                } else {
                    Random r = new Random();
                    colors.add(new Color(r.nextInt(0, 256), r.nextInt(0, 256), r.nextInt(0, 256)));
                    Ellipse2D krug = new Ellipse2D.Double(e.getX() - 35, e.getY() - 35, 70, 70);
                    list.add(krug);
                    repaint();
                }
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
        for (int i = 0; i < list.size(); i++) {
            g.setColor(colors.get(i));
            g.fill(list.get(i));
        }
    }
}
