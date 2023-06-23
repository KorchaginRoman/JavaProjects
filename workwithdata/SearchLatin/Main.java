import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку с пробелами");
        String s = in.nextLine();
        String[] result= s.split(" ");
        int counter = 0;
        boolean flag = false;
        for (int i=0;i<result.length;i++){
            if (result[i].matches("^[a-zA-Z]+$")){
                    counter++;
                    System.out.println(result[i]);
                }

        }
        System.out.println("Кол-во слов, содержащих только латиницу: " + counter);
    }
}