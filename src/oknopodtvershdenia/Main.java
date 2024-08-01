package oknopodtvershdenia;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int n = JOptionPane.showConfirmDialog(null, "Вы сегодня завтракали?", "Про завтрак", JOptionPane.YES_NO_OPTION);
        int m = JOptionPane.showConfirmDialog(null, "Вы сегодня обедали?", "Про обед", JOptionPane.YES_NO_OPTION);
        if (n==1&m==1){JOptionPane.showMessageDialog(null,"Вы голодный");}
        if (n==1&m==0){JOptionPane.showMessageDialog(null,"Лучше без завтрака, чем без обеда");}
        if (n==0&m==1){JOptionPane.showMessageDialog(null,"Пообедайте");}
        if (n==0&m==0){JOptionPane.showMessageDialog(null,"У вас сил до конца дня!");}
    }
}
