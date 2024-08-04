package izmenenieshriftanadpisi;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Ris{
    int x = 5;
    JSlider slider = new JSlider(5, 100, 5);

    Ris() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new GridBagLayout());
        frame.add(panel);
        panel.setPreferredSize(new Dimension(1200, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Моя первая надпись!");
        label.setFont(new Font("", Font.BOLD, x));
        panel.add(label);
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                x = slider.getValue();
                System.out.println(x);
                label.setFont(new Font("", Font.BOLD, x));
            }
        });
        frame.add(slider, BorderLayout.SOUTH);
        frame.setVisible(true);
    }

}
