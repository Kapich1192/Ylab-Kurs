package YLab_Tasks_Lection4.Task9;
/*3. Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз, используя цикл while.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String string;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку");
        string = input.nextLine();
        System.out.println("Введите количество повторений строки");
        n = Integer.parseInt(input.nextLine());
        while(n>0){
            System.out.println(string);
            n--;
        }
    }
}
