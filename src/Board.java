import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel {
    int x;
    int y;


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(getImage(), x, y, this);

    }

    private Image getImage() {
        ImageIcon icon = new ImageIcon("res/icon.png");
        return icon.getImage();
    }

    public void setXY() {
        x += 10;
        y += 10;
        repaint();
    }

    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            setXY();
        }
    };

    void initTimer(){
        Timer timer=new Timer(300,listener);
        timer.start();
    }




}
