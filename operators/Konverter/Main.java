import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Что вы хотите сконвертировать? 1 - расстояние, 2 - валюту");
        int num1= in.nextInt();
        if (num1==1) {
            System.out.println("Перевести в: 1 - метры, 2 - мили, 3 - ярды, 4 - футы");
            int num2= in.nextInt();
            switch (num2)
            {
                case 1:
                    System.out.println("Введите кол-во:");
                    double num11= in.nextDouble();
                    System.out.printf("%.2f %s %.2f %s",num11,"метров = ", (num11*1) ," метров");
                    break;
                case 2:
                    System.out.println("Введите кол-во:");
                    double num12= in.nextDouble();
                    System.out.printf("%.2f %s %.2f %s",num12, "метров = " , (num12/1609) ," миль");
                    break;
                case 3:
                    System.out.println("Введите кол-во:");
                    double num13= in.nextDouble();
                    System.out.printf("%.2f %s %.2f %s",num13, "метров = " , (num13*1.094) ," ярдов");
                    break;
                case 4:
                    System.out.println("Введите кол-во:");
                    double num14= in.nextDouble();
                    System.out.printf("%.2f %s %.2f %s",num14, "метров = " , (num14*3.281) ," фут");
                    break;
                default:
                    System.out.println("нужно было ввести цифру от 1 до 4");
                    break;
            }
        }
        else{
            System.out.println("Перевести в: 1 - рубли, 2 - доллары, 3 - евро, 4 - фунты");
            int num3= in.nextInt();
            switch (num3)
            {
                case 1:
                    System.out.println("Введите кол-во:");
                    double num21= in.nextDouble();
                    System.out.printf("%.2f %s %.2f %s",num21, "рублей = " , (num21*1) ," рублей");
                    break;
                case 2:
                    System.out.println("Введите кол-во:");
                    double num22= in.nextDouble();
                    System.out.printf("%.2f %s %.2f %s",num22,"рублей = ",(num22/83.61)," долларов");
                    break;
                case 3:
                    System.out.println("Введите кол-во:");
                    double num23= in.nextDouble();
                    System.out.printf("%.2f %s %.2f %s",num23,"рублей = " ,(num23/91.94) ," евро");
                    break;
                case 4:
                    System.out.println("Введите кол-во:");
                    double num24= in.nextDouble();
                    System.out.printf("%.2f %s %.2f %s",num24, "рублей = " , (num24/106.44) ," фунтов");
                    break;
                default:
                    System.out.println("нужно было ввести цифру от 1 до 4");
                    break;
            }
        }

    }
}