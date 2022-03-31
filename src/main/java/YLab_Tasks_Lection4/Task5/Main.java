package YLab_Tasks_Lection4.Task5;
/*Задача 5. 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String name;
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя");
        name = input.nextLine();
        System.out.println("Введите возраст");
        age = Integer.parseInt(input.nextLine());
        if(age<18){
            System.out.println(name + " Подрасти еще");
        }
    }
}
