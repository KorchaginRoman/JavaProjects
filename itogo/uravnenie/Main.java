import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите уравнение: ");
        String s = in.nextLine();
        Character x='x';
        Character x1='+';
        Character x2='-';
        Character x3='=';
        int otvet=0;
        Character[] nums=new Character[s.length()];
        for (int i=0;i<s.length();i++){
            nums[i]=s.charAt(i);
        }
        if ((nums[1].equals(x1) || nums[1].equals(x2)) && nums[3].equals(x3) && nums.length==5){
            if (Character.isDigit(nums[0]) && Character.isDigit(nums[2]) && nums[4].equals(x)){
                int a = Integer.parseInt(String.valueOf(nums[0]));
                int b = Integer.parseInt(String.valueOf(nums[2]));
                if (nums[1].equals(x1)){
                    otvet= a+b;
                    System.out.println("Х равен: " + otvet);
                }
                else {
                    otvet= a-b;
                    System.out.println("Х равен: " + otvet);
                }
            }
            if (Character.isDigit(nums[4]) && Character.isDigit(nums[2]) && nums[0].equals(x)) {
                int c = Integer.parseInt(String.valueOf(nums[4]));
                int b = Integer.parseInt(String.valueOf(nums[2]));
                if (nums[1].equals(x1)){
                    otvet= c-b;
                    System.out.println("Х равен: " + otvet);
                }
                else {
                    otvet= c+b;
                    System.out.println("Х равен: " + otvet);
                }
            }
            if (Character.isDigit(nums[0]) && Character.isDigit(nums[4]) && nums[2].equals(x)){
                int a = Integer.parseInt(String.valueOf(nums[0]));
                int c = Integer.parseInt(String.valueOf(nums[4]));
                if (nums[1].equals(x1)){
                    otvet= c-a;
                    System.out.println("Х равен: " + otvet);
                }
                else {
                    otvet= c+a;
                    System.out.println("Х равен: " + otvet);
                }
            }
        }
        else{
            System.out.println("Вы ввели неправильное уравнение");
        }
    }
}