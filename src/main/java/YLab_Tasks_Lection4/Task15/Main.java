package YLab_Tasks_Lection4.Task15;
/*4. Рисуем линии
Используя цикл for вывести на экран:
— горизонтальную линию из 10 восьмёрок
— вертикальную линию из 10 восьмёрок.*/
public class Main {
    public static void main(String[] args) {
        int size = 10;
        for (int i = 1; i <= size; i++) {
            System.out.print("8");
        }
        for (int i = 1; i <= size; i++) {
            System.out.println("8");
        }
    }
}