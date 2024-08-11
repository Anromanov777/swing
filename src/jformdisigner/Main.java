package jformdisigner;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Ttt ttt=new Ttt();
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(ttt);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
