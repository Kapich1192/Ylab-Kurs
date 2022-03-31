package YLab_Tasks_Lection4.Task3;
/*Задача 3. Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.*/
import java.util.Arrays;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        number1 = input.nextInt();
        System.out.println("Введите второе число: ");
        number2 = input.nextInt();
        System.out.println("Введите третье число: ");
        number3 = input.nextInt();
        System.out.println(Arrays.toString(sort(number1, number2, number3)));
    }

    public static int[] sort(int number1, int number2, int number3){
        int[] array = {number1,number2,number3};
        int temp = 0;
        for(int i = 0; i < array.length-1;i++){
            for(int j = i;j < array.length ;j++){
                if(array[i] < array[j]){
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                }
            }
        }
        return array;
    }
}
