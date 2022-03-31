package YLab_Tasks_Lection5.Task21;

import java.util.Scanner;
/*21. Нужно исправить программу, чтобы компилировалась и работала.
Задача: Программа вводит два числа с клавиатуры и выводит их сумму на экран.*/
public class Solution {
    public static void main(String[] args) {
        int number1,number2,sum;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        number1 = input.nextInt();
        System.out.println("Введите второе число: ");
        number2 = input.nextInt();
        sum = number1 + number2;
        System.out.println("Сумма двух чисел равна " + sum);
    }
}
