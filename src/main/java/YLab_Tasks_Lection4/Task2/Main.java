package YLab_Tasks_Lection4.Task2;
/*Задача 2. Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int number1, number2,number3,number4;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        number1 = input.nextInt();
        System.out.println("Введите второе целое число: ");
        number2 = input.nextInt();
        System.out.println("Введите третье целое число: ");
        number3 = input.nextInt();
        System.out.println("Введите четвертое целое число: ");
        number4 = input.nextInt();
        System.out.println("Максимальное из чисел равно " + max(number1,number2,number3,number4));
    }

    public static int max(int number1,int number2,int number3,int number4){
        int[]array = {number1,number2,number3,number4};
        int temp = 0;
        for(int i = 0; i < array.length; i++){
            if(i==0)
                temp=array[0];
            if(array[i]>temp)
                temp=array[i];
        }
        return temp;
    }
}

