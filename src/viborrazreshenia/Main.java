package viborrazreshenia;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] s = {"800x600", "1024x768", "1200x600", "1280x1024", "1680x1050", "1920x1080"};
        String[] mas;
        Object res = JOptionPane.showInputDialog(null, "Выберите разрешение", "Выбор разрешения", JOptionPane.QUESTION_MESSAGE, null, s, s[0]);
        mas = ((String) res).split("x");
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Integer.parseInt(mas[0]), Integer.parseInt(mas[1]));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
