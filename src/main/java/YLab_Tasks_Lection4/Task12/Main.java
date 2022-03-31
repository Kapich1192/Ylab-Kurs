package YLab_Tasks_Lection4.Task12;
/*1. Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.*/
public class Main {
    public static void main(String[] args) {
        for(int i = 1; i<=100;i++){
            if(i%2==0)
                System.out.print(" " + i);
        }
    }
}
