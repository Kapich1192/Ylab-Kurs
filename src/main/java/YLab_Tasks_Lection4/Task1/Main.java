package YLab_Tasks_Lection4.Task1;
/*Задача 1. Минимум двух чисел Ввести с клавиатуры два числа,
 и вывести на экран минимальное из них.*/
import java.util.Scanner;
public class Main {
        public static void main(String[] args){
            int number1, number2;
            Scanner input = new Scanner(System.in);

            System.out.println("Введите первое целое число: ");
            number1 = input.nextInt();

            System.out.println("Введите второе целое число: ");
            number2 = input.nextInt();

            System.out.println("Минимальное из чисел равно " + min(number1,number2));
        }

        public static int min(int number1,int number2){
            if(number1 > number2){
                return number2;
            }else{
                return number1;
            }
        }
}
