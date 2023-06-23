import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] nums= new int[15];
        Random random = new Random();
        int maxm=0;
        int max=(-20);
        int min=20;
        for (int i=0;i<nums.length;i++) {
            int j = random.nextInt(40 + 1);
            j += (-20);
            nums[i]=j;
            System.out.println(j);
            if (Math.abs(j)>maxm){
                maxm=Math.abs(j);
            }
            if (j>max){
                max=j;
            }
            if (j<min){
                min=j;
            }
        }
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
        System.out.println("Максимум по модулю" + maxm);
    }
}