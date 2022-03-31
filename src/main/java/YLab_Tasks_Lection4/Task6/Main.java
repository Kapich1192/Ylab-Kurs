package YLab_Tasks_Lection4.Task6;
/*Задача 6. И 18-ти достаточно
Ввести с клавиатуры имя и возраст.
Если возраст больше 20 вывести надпись «И 18-ти достаточно»*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя: ");
        name = input.nextLine();
        System.out.println("Введите возраст: ");
        age = Integer.parseInt(input.nextLine());
        if(age>20)
            System.out.println("И 18 достаточно");
    }
}
