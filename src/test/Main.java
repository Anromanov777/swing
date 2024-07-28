package test;

public class Main {
    public static void main(String[] args) {
        String a="-654654";
        String b="54321";
        String c="+65465";
        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));

        String d="1234561";
        System.out.println(d.matches("[0-9]+"));


    }
}
