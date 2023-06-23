import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        String answer = ("Заархивированный вирус");
        System.out.println("Введите ответ на загадку!");
        String answer1 = in.nextLine();
        if (answer1.equals(answer)){
            System.out.println("Правильно!");
        } else if (answer1.equals("Подсказка")) {
            System.out.println("Zip trojan");
            String answer2 =in.nextLine();
            if (answer2.equals(answer)){
                System.out.println("Правильно!");
            }
            else{
                System.out.println("Обидно, приходи в другой раз");
            }
        }
        else{
            System.out.println("Подумай еще!");
            String answer2 = in.nextLine();
            if (answer2.equals(answer)){
                System.out.println("Правильно!");
            }
            else if (answer2.equals("Подсказка")) {
                System.out.println("Подсказка уже недоступна");
                String answer3 =in.nextLine();
                if (answer3.equals(answer)){
                    System.out.println("Правильно!");
                }
                else{
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
            else{
                System.out.println("Подумай еще!");
                String answer4 = in.nextLine();
                if (answer4.equals(answer)){
                    System.out.println("Правильно!");
                } else if (answer4.equals("Подсказка")) {
                    System.out.println("Подсказка уже недоступна");
                    System.out.println("Обидно, приходи в другой раз");
                }
                else {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
        }
    }
}