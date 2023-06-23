import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во строк ");
        int n = in.nextInt();
        String[] s = new String[n];
        for (int i=0;i<n;i++){
            System.out.print("Строка " + (i+1) + ":");
            s[i]=in.next();
        }
        int index=0;
        int max=0;
        for(int i=0;i<n;i++){
            if (s[i].chars().distinct().count()>max){
                max=(int)s[i].chars().distinct().count();
                index=i;
            }
        }
        System.out.println("Ответ: " + s[index]);
    }
}