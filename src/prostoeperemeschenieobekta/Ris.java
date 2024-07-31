package prostoeperemeschenieobekta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.util.LinkedList;
import java.util.Random;

public class Ris extends JPanel {
    int newX;
    int newY;
    int x = 5;
    boolean pressButton1 = false;
    boolean pressButton2 = false;
    int vibraniiKrug;
    LinkedList<int[]> list = new LinkedList<>();
    ActionListener padenie = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < list.size(); i++) {
                list.get(i)[1] += x;
                if (list.get(i)[1] > getHeight() + 35) list.remove(i);
                if (list.size() == 0) {
                    sbros.stop();
                    x = 5;
                }
            }
            x++;
            repaint();
        }
    };

    ActionListener listner2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Random r = new Random();
            int[] mas = new int[5];
            mas[0] = newX;
            mas[1] = newY;
            mas[2] = r.nextInt(0, 256);
            mas[3] = r.nextInt(0, 256);
            mas[4] = r.nextInt(0, 256);
            list.add(mas);
            repaint();
        }
    };
    Timer timer2 = new Timer(70, listner2);
    Timer sbros = new Timer(1, padenie);

    public Ris() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        setPreferredSize(new Dimension(1000, 1000));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                pressButton1 = false;
                pressButton2 = false;
                timer2.stop();
                vibraniiKrug = -1;
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);

                if (e.getButton() == MouseEvent.BUTTON3) {
                    sbros.start();

                } else if (e.getButton() == MouseEvent.BUTTON2) {
                    pressButton2 = true;
                    for (int i = list.size() - 1; i != -1; i--) {
                        Ellipse2D k = new Ellipse2D.Double(list.get(i)[0] - 35, list.get(i)[1] - 35, 70, 70);
                        if (k.contains(e.getPoint())) {
                            vibraniiKrug = i;
                        }
                    }
                    if (e.getClickCount() == 2) {
                        for (int i = list.size() - 1; i != -1; i--) {
                            Ellipse2D k = new Ellipse2D.Double(list.get(i)[0] - 35, list.get(i)[1] - 35, 70, 70);
                            if (k.contains(e.getPoint())) {
                                list.remove(i);
                                repaint();
                            }
                        }
                    }
                } else if (e.getButton() == MouseEvent.BUTTON1) {
                    pressButton1 = true;
                    Random r = new Random();
                    int[] mas = new int[5];
                    mas[0] = e.getX();
                    mas[1] = e.getY();
                    mas[2] = r.nextInt(0, 256);
                    mas[3] = r.nextInt(0, 256);
                    mas[4] = r.nextInt(0, 256);
                    list.add(mas);
                    repaint();

                }
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                if (pressButton1) {
                    timer2.start();
                }
                if (pressButton2) {
                    newX = e.getX();
                    newY = e.getY();
                    if (vibraniiKrug != -1) {
                        list.get(vibraniiKrug)[0] = newX;
                        list.get(vibraniiKrug)[1] = newY;
                    }
                    repaint();
                }
                newX = e.getX();
                newY = e.getY();
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
            g.setColor(new Color(list.get(i)[2], list.get(i)[3], list.get(i)[4]));
            g.fill(new Ellipse2D.Double(list.get(i)[0] - 35, list.get(i)[1] - 35, 70, 70));
        }
    }
}
