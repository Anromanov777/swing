package viktorina;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Ttt extends JPanel {
    static int count;
    static int qveschon;

    public Ttt() {
        new Voproses();
        initComponents();
        drawText();
    }

    private void initComponents() {
        label2 = new JLabel();
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();

        setPreferredSize(new Dimension(1000, 1000));
        setVerifyInputWhenFocusTarget(false);

        setLayout(new GridBagLayout());

        label2.setHorizontalAlignment(SwingConstants.RIGHT);
        label2.setVerticalAlignment(SwingConstants.BOTTOM);
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
        add(label2, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 15, 15), 0, 0));

        label1.setBackground(Color.white);
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        label1.setFont(new Font("Arial", label1.getFont().getStyle(), 20));
        label1.setBorder(LineBorder.createBlackLineBorder());
        label1.setPreferredSize(new Dimension(35, 150));
        label1.setForeground(Color.darkGray);
        label1.setOpaque(true);
        add(label1, new GridBagConstraints(0, 3, 2, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 15, 15), 0, 0));

        button1.setPreferredSize(new Dimension(400, 150));
        button1.setBorder(new LineBorder(Color.black, 2, true));
        button1.setBackground(Color.lightGray);
        button1.setFocusable(false);
        button1.setFont(new Font("Arial", button1.getFont().getStyle(), 22));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button1.setContentAreaFilled(false);
                button1.setOpaque(true);
                button1.setBackground(Color.darkGray);
                if (Voproses.str.get(qveschon - 1)[5].equals("1")) count++;
                rezultat();
                drawText();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                relise(button1);
            }
        });
        add(button1, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 15, 15), 0, 0));

        button2.setPreferredSize(new Dimension(400, 150));
        button2.setBorder(new LineBorder(Color.black, 2, true));
        button2.setBackground(Color.lightGray);
        button2.setFocusable(false);
        button2.setFont(new Font("Arial", button2.getFont().getStyle(), 22));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button2.setContentAreaFilled(false);
                button2.setOpaque(true);
                button2.setBackground(Color.darkGray);
                if (Voproses.str.get(qveschon - 1)[5].equals("2")) count++;
                rezultat();
                drawText();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                relise(button2);
            }
        });
        add(button2, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 15, 15), 0, 0));

        button3.setPreferredSize(new Dimension(400, 150));
        button3.setBorder(new LineBorder(Color.black, 2, true));
        button3.setBackground(Color.lightGray);
        button3.setFocusable(false);
        button3.setFont(new Font("Arial", button3.getFont().getStyle(), 22));
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button3.setContentAreaFilled(false);
                button3.setOpaque(true);
                button3.setBackground(Color.darkGray);
                if (Voproses.str.get(qveschon - 1)[5].equals("3")) count++;
                rezultat();
                drawText();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                relise(button3);
            }
        });
        add(button3, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 15, 15), 0, 0));

        button4.setPreferredSize(new Dimension(400, 150));
        button4.setBorder(new LineBorder(Color.black, 2, true));
        button4.setBackground(Color.lightGray);
        button4.setFocusable(false);
        button4.setFont(new Font("Arial", button4.getFont().getStyle(), 22));
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button4.setContentAreaFilled(false);
                button4.setOpaque(true);
                button4.setBackground(Color.darkGray);
                if (Voproses.str.get(qveschon - 1)[5].equals("4")) count++;
                rezultat();
                drawText();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                relise(button4);
            }
        });
        add(button4, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 15, 15), 0, 0));
    }

    private JLabel label2;
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    void drawText() {
        label2.setText("\u0412\u043e\u043f\u0440\u043e\u0441 " + (qveschon + 1) + "/" + Voproses.str.size());
        label1.setText(Voproses.str.get(qveschon)[0]);
        button1.setText(Voproses.str.get(qveschon)[1]);
        button2.setText(Voproses.str.get(qveschon)[2]);
        button3.setText(Voproses.str.get(qveschon)[3]);
        button4.setText(Voproses.str.get(qveschon)[4]);
        qveschon++;
    }

    void rezultat() {
        if (qveschon == Voproses.str.size()) {
            qveschon = 0;
            JOptionPane.showMessageDialog(null, "Правильных ответов: " + count, "Ваш результат", JOptionPane.INFORMATION_MESSAGE);
            count = 0;
            relise(button1);
            relise(button2);
            relise(button3);
            relise(button4);
        }
    }

    void relise(JButton b) {
        b.setContentAreaFilled(true);
        b.setBackground(Color.lightGray);
    }

}
