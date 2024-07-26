package races;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Car {
    String name;
    static int count;
    int x;
    int y;
    int type;

    public Car(int type,String name) {
        this.type = type;
        y = count;
        count = y + 200;
        this.name=name;
    }

    public int getX() {
        Random random = new Random();
        x += random.nextInt(0, 6);
        return x;
    }

    public String getName() {
        return name;
    }

    public int summ(){
        return x+getImage().getWidth(null);
    }

    public Image getImage() {
        switch (type) {
            case 1:
                return new ImageIcon("res/ferrari.png").getImage();
            case 2:
                return new ImageIcon("res/lada.png").getImage();
            case 3:
                return new ImageIcon("res/porsh.png").getImage();
            case 4:
                return new ImageIcon("res/suzuki.png").getImage();
            default:
                return new ImageIcon("res/volvo.png").getImage();
        }
    }



}
