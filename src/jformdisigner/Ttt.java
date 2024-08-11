package jformdisigner;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Ttt extends JPanel {
    static int count;
    static int qveschon;


    public Ttt() {
        new Ris();
        if (Ris.str.size() < qveschon) qveschon = 0;
        qveschon++;
        initComponents();
    }

    private void thisMousePressed(MouseEvent e) {
        // TODO add your code here
    }

    private void button7MousePressed(MouseEvent e) {
        // TODO add your code here
    }

    private void button8MousePressed(MouseEvent e) {
        // TODO add your code here
    }

    private void button8MouseReleased(MouseEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label2 = new JLabel();
        label1 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();

        //======== this ========
        setPreferredSize(new Dimension(1000, 1000));
        setVerifyInputWhenFocusTarget(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                thisMousePressed(e);
            }
        });
        setLayout(new GridBagLayout());


        //---- label2 ----
        label2.setText("\u0412\u043e\u043f\u0440\u043e\u0441 " + qveschon + "/" + Ris.str.size());
        label2.setHorizontalAlignment(SwingConstants.RIGHT);
        label2.setVerticalAlignment(SwingConstants.BOTTOM);
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
        add(label2, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 15, 15), 0, 0));

        //---- label1 ----
        label1.setText(Ris.str.get(qveschon - 1)[0]);
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

        //---- button1 ----
        button1.setText(Ris.str.get(qveschon - 1)[1]);
        button1.setPreferredSize(new Dimension(400, 150));
        button1.setBorder(new LineBorder(Color.black, 2, true));
        button1.setBackground(Color.lightGray);
        button1.setFocusable(false);
        button1.setFont(new Font("Arial", button1.getFont().getStyle(), 22));
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button8MousePressed(e);
                button1.setContentAreaFilled(false);
                button1.setOpaque(true);
                button1.setBackground(Color.darkGray);
                if (Ris.str.get(qveschon-1)[5].equals("1"))count++;
                new Ttt();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button8MouseReleased(e);
                button1.setContentAreaFilled(true);
                button1.setBackground(Color.lightGray);
            }
        });
        add(button1, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 15, 15), 0, 0));

        //---- button2 ----
        button2.setText(Ris.str.get(qveschon - 1)[2]);
        button2.setPreferredSize(new Dimension(400, 150));
        button2.setBorder(new LineBorder(Color.black, 2, true));
        button2.setBackground(Color.lightGray);
        button2.setFocusable(false);
        button2.setFont(new Font("Arial", button2.getFont().getStyle(), 22));
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button8MousePressed(e);
                button2.setContentAreaFilled(false);
                button2.setOpaque(true);
                button2.setBackground(Color.darkGray);
                if (Ris.str.get(qveschon-1)[5].equals("2"))count++;
                new Ttt();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button8MouseReleased(e);
                button2.setContentAreaFilled(true);
                button2.setBackground(Color.lightGray);
            }
        });
        add(button2, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 15, 15), 0, 0));

        //---- button3 ----
        button3.setText(Ris.str.get(qveschon - 1)[3]);
        button3.setPreferredSize(new Dimension(400, 150));
        button3.setBorder(new LineBorder(Color.black, 2, true));
        button3.setBackground(Color.lightGray);
        button3.setFocusable(false);
        button3.setFont(new Font("Arial", button3.getFont().getStyle(), 22));
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button8MousePressed(e);
                button3.setContentAreaFilled(false);
                button3.setOpaque(true);
                button3.setBackground(Color.darkGray);
                if (Ris.str.get(qveschon-1)[5].equals("3"))count++;
                new Ttt();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button8MouseReleased(e);
                button3.setContentAreaFilled(true);
                button3.setBackground(Color.lightGray);
            }
        });
        add(button3, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 15, 15), 0, 0));

        //---- button4 ----
        button4.setText(Ris.str.get(qveschon - 1)[4]);
        button4.setPreferredSize(new Dimension(400, 150));
        button4.setBorder(new LineBorder(Color.black, 2, true));
        button4.setBackground(Color.lightGray);
        button4.setFocusable(false);
        button4.setFont(new Font("Arial", button4.getFont().getStyle(), 22));
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                button8MousePressed(e);
                button4.setContentAreaFilled(false);
                button4.setOpaque(true);
                button4.setBackground(Color.darkGray);
                if (Ris.str.get(qveschon-1)[5].equals("4"))count++;
                new Ttt();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button8MouseReleased(e);
                button4.setContentAreaFilled(true);
                button4.setBackground(Color.lightGray);
            }
        });
        add(button4, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 15, 15), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label2;
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
