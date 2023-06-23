import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите курс доллара: ");
        Double curs = in.nextDouble();
        System.out.print("Введите кол-во рублей: ");
        Double amount = in.nextDouble();
        System.out.printf("%s %.2f %s","Итого: ",(amount/curs) ," долларов.");
    }
}