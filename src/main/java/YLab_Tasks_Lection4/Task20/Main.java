package YLab_Tasks_Lection4.Task20;
/*4. Меня зовут ‘Вася’…
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       String name;
       int y,m,d;
       Scanner input = new Scanner(System.in);
       System.out.println("Введите имя: ");
       name = input.nextLine();
       System.out.println("Введите год рождения: ");
       y = Integer.parseInt(input.nextLine());
       System.out.println("Введите месяц рождения: ");
       m = Integer.parseInt(input.nextLine());
       System.out.println("Введите день рождения: ");
       d = Integer.parseInt(input.nextLine());
       System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + d + "." + m + "." +y);
    }
}
