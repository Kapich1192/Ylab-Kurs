package YLab_Tasks_Lection5.Task22;

import java.util.Scanner;

/*22. Нужно добавить в программу новую функциональность.
Старая Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.*/
public class Solution {
    public static void main(String[] args) {
        int[] number = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < number.length; i++)
        {
            System.out.println(" Введите целое число");
            number[i] = input.nextInt();
        }
        System.out.println("Самое меньшее число из введенных = " + minInArray(number));
    }
public static int minInArray(int[] array){
        int temp = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if (temp > array[i])
                temp = array[i];
        }
            return temp;
}
}
