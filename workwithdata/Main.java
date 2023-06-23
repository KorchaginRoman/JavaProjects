import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число ");
        String s = in.next();
        System.out.println("Введите второе число");
        int n = in.nextInt();
        int n2 = Integer.valueOf(s);
        System.out.println("Большее "+ Math.max(n,n2));
        double n3 = (double) Math.min(n,n2);
        System.out.println(n3);
    }
}