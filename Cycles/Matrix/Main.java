import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк и столбцов ");
        int numi = in.nextInt();
        int numj = in.nextInt();
        double[][] nums = new double[numi][numj];
        for (int i=0;i<numi;i++){
            for(int j=0;j<numj;j++){
                System.out.println("Введите ["+i+"]["+j+"] значение матрицы");
                double numm = in.nextDouble();
                nums[i][j]=numm;
            }
        }
        for (int i=0;i<1;i++){
            for(int j=0;j<numj;j++){
                System.out.print(nums[i][j]*3+";");

            }
        }
    }
}