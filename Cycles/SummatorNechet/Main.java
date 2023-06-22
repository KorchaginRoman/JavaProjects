import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите положительное целое число: ");
        int num = in.nextInt();
        int total=0;
        for (int i=1;i<=num;i+=2){
            total+=i;
        }
        System.out.println(total);
    }
}