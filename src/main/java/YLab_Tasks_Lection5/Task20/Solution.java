package YLab_Tasks_Lection5.Task20;

import java.util.Scanner;
/*20. Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму,
пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.*/
public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        int temp = 0;
        String sumString,tempString;
        Scanner input = new Scanner(System.in);
        for(;;){
            if (sum == 0) {
                System.out.println("Введите первое число или слово \"сумма\" для выхода: ");
                sumString = input.nextLine();
                if(sumString.equals("сумма"))break;
                else {
                    sum = Integer.parseInt(sumString);
                }
            }
            if(sum > 0)
            {
                System.out.println("Введите число для прибавления к сумме или слово \"сумма\" для выхода: ");
                tempString = input.nextLine();
                if (tempString.equals("сумма")) break;
                else {
                    temp = Integer.parseInt(tempString);
                    sum += temp;
                    System.out.println("Сумма чисел равна " + sum);
                }
            }
        }
        System.out.println("Сумма всех введенных чисел равна " + sum);
    }
}
