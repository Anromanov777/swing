package jcombobox;

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
        c.insets = new Insets(20, 0, 0, 0);

        String[] mas = {"Красный", "Оранжевый", "Желтый", "Зеленый"};
        JComboBox<String> comboBox = new JComboBox<>(mas);
        comboBox.setPreferredSize(new Dimension(200, 30));
        c.gridy = 0;
        add(comboBox, c);

        JTextField field = new JTextField();
        field.setPreferredSize(new Dimension(200, 30));
        field.setEditable(false);
        c.gridy = 2;
        c.fill = GridBagConstraints.NONE;
        add(field, c);

        JCheckBox checkBox = new JCheckBox("Свой вариант");
        c.gridy = 1;
        add(checkBox, c);
        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected())field.setEditable(true);
                else field.setEditable(false);
            }
        });

        JLabel label = new JLabel("Ответ: ");
        Font font = new Font("", Font.BOLD, 30);
        label.setFont(font);
        c.gridy = 4;
        add(label, c);

        JButton button = new JButton("Ответить");
        c.gridy = 3;
        add(button, c);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(checkBox.isSelected());
                if (!checkBox.isSelected())
                    label.setText("Ответ: " + mas[comboBox.getSelectedIndex()]);
                else label.setText("Ответ: " + field.getText());
            }
        });

        frame.setVisible(true);
    }
}
