package Diagonal;

import Diagonal.Board;

import javax.swing.*;

public class Kartinka {
    {
        initFrame();
    }

    void initFrame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        Board board = new Board();
        frame.add(board);
    }
}