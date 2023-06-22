import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива ");
        int num = in.nextInt();
        double[] nums = new double[num];
        double total =0;
        for (int i=0;i<num;i++){
            System.out.println("Введите "+ i + " член массива");
            double num2 = in.nextDouble();
            nums[i]=num2;
            total+=num2;
        }
        total/=num;
        for (int i=0;i<num;i++){
            System.out.println(i + ": "+ (nums[i]*total));
        }
    }
}