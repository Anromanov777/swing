package earth;

import javax.swing.*;

public class Earth{
    Earth(){
        JFrame frame =new JFrame("Земля");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setLocationRelativeTo(null);
        frame.add(new MyPanel());
        frame.setVisible(true);
    }


}
