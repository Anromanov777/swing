import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            System.out.println(str.matches("\\d+"));
        }
    }
    //[+\-*/] Правильный вариант
    //[\+\-\*/]
    //[+\-\*/]
}
