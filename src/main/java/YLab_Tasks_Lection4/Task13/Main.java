package YLab_Tasks_Lection4.Task13;
/*2. Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int m,n;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число m: ");
        m = input.nextInt();
        System.out.println("Введите число n: ");
        n = input.nextInt();
        for(int i = m; i > 0; i--){
            for (int j = n; j > 0; j--){
                System.out.print("8");
            }
            System.out.println("");
        }
    }
}
