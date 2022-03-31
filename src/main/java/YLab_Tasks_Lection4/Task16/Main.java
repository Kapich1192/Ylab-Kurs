package YLab_Tasks_Lection4.Task16;
/*5. Все любят Мамбу
Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String name;
        int n = 10;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя: ");
        name = input.nextLine();
        for(int i = 0; i < n; i++){
            System.out.println(name + " любит меня.");
        }
    }
}
