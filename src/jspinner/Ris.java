package jspinner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ris extends JPanel {

    public Ris() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        setPreferredSize(new Dimension(1000, 1000));
        frame.pack();
        frame.setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        Font font=new Font("",Font.BOLD,20);
        GridBagConstraints spin=new GridBagConstraints();
        GridBagConstraints constraints = new GridBagConstraints();
        GridBagConstraints constraints1 = new GridBagConstraints();
        constraints.gridy = 1;
        constraints.insets.top=10;
        constraints1.gridy = 2;
        constraints1.insets.top=10;
        JSpinner spinner = new JSpinner();
        spinner.setPreferredSize(new Dimension(50,30));
        spinner.setFont(font);
        JButton button = new JButton("Ответить");
        JLabel label = new JLabel("Ответ: 0");
        label.setFont(font);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i= (int) spinner.getValue();
                label.setText("Ответ: "+i);
            }
        });
        add(spinner,spin);
        add(button, constraints);
        add(label, constraints1);
        frame.setVisible(true);
    }
}
