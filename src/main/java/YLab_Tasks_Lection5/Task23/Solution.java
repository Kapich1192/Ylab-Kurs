package YLab_Tasks_Lection5.Task23;
import java.util.Scanner;
/*23. Задача по алгоритмам.
Задача: Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.*/
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int[] number;

        System.out.println(" Введите целое число, количество чисел в цепочке: ");
        n = input.nextInt();
        number = new int[n];

        for(int i = 0; i < number.length; i++) {
            System.out.println(" Введите целое число ");
            number[i] = input.nextInt();
        }
        System.out.println("Наибольшее из чисел = " + maxInArray(number));
    }
    public static int maxInArray(int[] array){
        int temp = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if (temp < array[i])
                temp = array[i];
        }
        return temp;
    }
}
