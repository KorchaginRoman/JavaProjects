import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: 'I like Java!!!'");
        String s = in.nextLine();
        if (s.contains("Java") && s.startsWith("I like") && s.endsWith("!!!")){
            System.out.println(s.toUpperCase());
           s = s.replace("a","o");
            System.out.println(s.substring(7,11));
        }
        else{
            System.out.println("Вы ввели неправильную строку");
        }
    }
}