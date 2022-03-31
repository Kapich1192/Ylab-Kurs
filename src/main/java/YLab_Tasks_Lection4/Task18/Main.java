package YLab_Tasks_Lection4.Task18;
/*2. Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них, т.е. не самое большое и не самое маленькое.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      int n1, n2, n3;
      Scanner input = new Scanner(System.in);
      System.out.println("Введите первое число: ");
      n1 = input.nextInt();
      System.out.println("Введите второе число: ");
      n2 = input.nextInt();
      System.out.println("Введите третье число: ");
      n3 = input.nextInt();
      System.out.println("Среднее арифметическое этих чисел: " + avg(n1,n2,n3));
    }

    public static int avg(int n1,int n2, int n3){
        int nAvg = (n1 + n2 + n3) / 3;
        return nAvg;
    }
}
