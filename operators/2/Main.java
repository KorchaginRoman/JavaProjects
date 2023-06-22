import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1= in.nextDouble();
        System.out.println("Введите второе число: ");
        double num2= in.nextDouble();
        System.out.println("Введите знак действия с этими числами: ");
        String getZnak = in.next();

        switch (getZnak)

        {
            case ("*"):
                System.out.printf("%.2f %s %.2f %s %.3f",num1,'*',num2,'=',(num1 * num2));
                break;
            case ("-"):
                System.out.printf("%.2f %s %.2f %s %.3f",num1,'-',num2,'=',(num1 - num2));
                break;
            case ("+"):
                System.out.printf("%.2f %s %.2f %s %.3f",num1,'+',num2,'=',(num1 + num2));
                break;
            case "/":
                System.out.printf("%.2f %s %.2f %s %.3f",num1,'/',num2,'=',(num1 / num2));
                break;
            default:
                System.out.println("Не то");
                break;
        }

    }
}