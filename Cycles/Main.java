import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int num = in.nextInt();
        int[] nums = new int[num];
        int x=2,y=3,z=5;
        String otvet=("1");
        for (int i=0;i<nums.length;i++){
            System.out.println("Введите "+ i + " член массива");
            num = in.nextInt();
            nums[i]=num;
            if (num==x || num==y || num==z){
                otvet = ("Данное значение имеется в константах");
            }
        }
        if (otvet!=("1")){
            System.out.println(otvet);
        }
    }
}