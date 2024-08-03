package vvediteparol;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String login;
        String password;
        String povtor;
        int n = JOptionPane.showConfirmDialog(null, "Хотите зарегистрироваться?", "Окно регистрации", JOptionPane.YES_NO_OPTION);
        if (n == 1) return;

        do {
            login = JOptionPane.showInputDialog(null, "Введите логин", "Регистрация", JOptionPane.PLAIN_MESSAGE);
            if (login == null) return;
        } while (!login.matches("[^ ]{6,}"));

        do {
            JPasswordField characters = new JPasswordField();
            int m = JOptionPane.showConfirmDialog(null, characters, "Ввод пароля", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (m == 2) return;
            password = new String(characters.getPassword());
        } while (!password.matches("[^ ]{9,}") || !password.matches("(.*[a-zA-Z]+.*\\d+.*)|(.*\\d+.*[a-zA-Z]+.*)"));

        do {
            JPasswordField characters = new JPasswordField();
            int m = JOptionPane.showConfirmDialog(null, characters, "Повторите пароль!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (m == 2) return;
            povtor = new String(characters.getPassword());
        } while (!povtor.equals(password));

        JOptionPane.showMessageDialog(null, "<html><h2>Вы успешно зарегистрировались!");
    }
}
