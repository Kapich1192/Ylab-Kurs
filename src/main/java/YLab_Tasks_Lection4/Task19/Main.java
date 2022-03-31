package YLab_Tasks_Lection4.Task19;
/*3. Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1,
 вывести на экран сумму и завершить программу.
 -1 должно учитываться в сумме.*/
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number,sum = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Введите число или -1 для выхода: ");
            number = input.nextInt();
            sum += number;
        }while(number != -1);
        System.out.println("Сумма всех введенных чисел, включая -1 равна: " + sum);
    }
}
