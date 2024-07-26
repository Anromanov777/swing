package races;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Races extends JPanel {
    int a=1;
    public Races() {
        timer.start();
        setLayout(new GridBagLayout());
        add(label);
        Font f = new Font("verdana", 0, 40);
        label.setFont(f);
        label.setVisible(false);
    }

    JLabel label = new JLabel();

    Car ferrari = new Car(1, "Феррари!");
    Car lada = new Car(2, "Лада!");
    Car porsh = new Car(3, "Порш!");
    Car suzuki = new Car(4, "Сузуки!");
    Car volvo = new Car(5, "Вольво!");

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(ferrari.getImage(), ferrari.getX(), ferrari.y, this);
        g2.drawImage(lada.getImage(), lada.getX(), lada.y, this);
        g2.drawImage(porsh.getImage(), porsh.getX(), porsh.y, this);
        g2.drawImage(suzuki.getImage(), suzuki.getX(), suzuki.y, this);
        g2.drawImage(volvo.getImage(), volvo.getX(), volvo.y, this);
    }

    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
            stop();

        }
    };

    private void stop() {
        for (int i = 0; i < a; i++) {
            a=0;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (ferrari.summ() >= getWidth()) {
            timer.stop();
            label.setText("Победила Феррари!!!");
            label.setVisible(true);
        }
        if (lada.summ() >= getWidth()) {
            timer.stop();
            label.setText("Победа Лады!!!!");
            label.setVisible(true);
        }
        if (porsh.summ() >= getWidth()) {
            timer.stop();
            label.setText("Победил Порш!!!!");
            label.setVisible(true);
        }
        if (suzuki.summ() >= getWidth()) {
            timer.stop();
            label.setText("Победил Сузуки!!!!");
            label.setVisible(true);
        }
        if (volvo.summ() >= getWidth()) {
            timer.stop();
            label.setText("Победило Вольво!!!!");
            label.setVisible(true);
        }
    }

    Timer timer = new Timer(10, listener);

}

