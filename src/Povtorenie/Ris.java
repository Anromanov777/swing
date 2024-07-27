package Povtorenie;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Ris extends JPanel {
    int x;
    int y;
    boolean b;

    JFrame frame = new JFrame("Повторение");

    public Ris() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLocationRelativeTo(null);
        frame.add(this);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        try {
            for (int i = 0; i < 10; i++) {
                y = 50 * i; b=!b;
                for (int j = 0; j < 10; j++) {
                    x = 50 * j;
                    g2.drawImage(getImag(), x, y, null);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private BufferedImage getImag() throws IOException {

        BufferedImage image = ImageIO.read(new File("res/kras.jpg"));
        BufferedImage image2 = ImageIO.read(new File("res/zel.jpg"));
        if (b) {
            b = false;
            return image;

        } else {
            b = true;
            return image2;

        }

    }
}
