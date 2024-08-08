package jtextarea;

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

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(15, 0, 0, 0);

        JTextField field = new JTextField(35);
        field.setPreferredSize(new Dimension(0, 30));
        add(field, c);
        c.gridy = 2;
        JTextArea area = new JTextArea(5, 20);
        area.setLineWrap(true);
        JScrollPane pane = new JScrollPane(area);
        c.fill = GridBagConstraints.HORIZONTAL;
        add(pane, c);

        c.gridy = 1;
        c.fill=GridBagConstraints.NONE;

        JButton button = new JButton("Записать");
        add(button, c);
        button.addActionListener(e -> {
            area.setText(area.getText() + field.getText() + "\n");
            field.setText("");
        });

        frame.setVisible(true);
    }
}
