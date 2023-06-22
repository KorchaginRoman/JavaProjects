import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1= in.nextDouble();
        double num2= in.nextDouble();
        double num3= in.nextDouble();
        double srznach = (num1+num2+num3)/3;
        System.out.println(srznach);
        int num4 = (int) (srznach/2);
        if (num4>3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}