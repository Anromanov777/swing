package cliker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ris extends JPanel {
    int i;
    JLabel label;

    public Ris() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout g = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridy = 1;
        setLayout(g);
        frame.add(this);
        setPreferredSize(new Dimension(1000, 1000));
        frame.pack();
        frame.setLocationRelativeTo(null);
        label = new JLabel("0");
        label.setFont(new Font("", Font.BOLD, 40));
        add(label);
        JButton button = new JButton("Кликер");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i++;
                label.setText(i + "");
            }
        });
        add(button,constraints);
        frame.setVisible(true);
    }
}
