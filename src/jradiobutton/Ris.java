package jradiobutton;

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

        GridBagConstraints constraints=new GridBagConstraints();
        constraints.gridx=0;
        constraints.gridy=GridBagConstraints.RELATIVE;
        constraints.anchor=GridBagConstraints.WEST;

        ButtonGroup group=new ButtonGroup();

        JRadioButton vesna= new JRadioButton("Весна");
        vesna.setSelected(true);
        group.add(vesna);
        add(vesna,constraints);

        JRadioButton leto = new JRadioButton("Лето");
        group.add(leto);
        add(leto,constraints);

        JRadioButton osen = new JRadioButton("Осень");
        group.add(osen);
        add(osen,constraints);

        JRadioButton zima = new JRadioButton("Зима");
        group.add(zima);
        add(zima,constraints);

        JLabel label=new JLabel("Ответ: ");
        label.setFont(new Font("",0,30));
        add(label,constraints);

        JButton button=new JButton("Ответить");
        button.getInsets(new Insets(20,0,0,0));
        constraints.insets=new Insets(10,10,0,0);
        add(button,constraints);
        button.addActionListener(e -> {
            if (vesna.isSelected())label.setText("Ответ: "+vesna.getText());
            if (leto.isSelected())label.setText("Ответ: "+leto.getText());
            if (osen.isSelected())label.setText("Ответ: "+osen.getText());
            if (zima.isSelected())label.setText("Ответ: "+zima.getText());
        });

        frame.setVisible(true);
    }
}
