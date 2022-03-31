package YLab_Tasks_Lection4.Task4;
/*Задача 4. Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String name1, name2;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое имя: ");
        name1 = input.nextLine();
        System.out.println("Введите второе имя: ");
        name2 = input.nextLine();
        name1 = name1.trim();
        name2 = name2.trim();
        if(name1.equals(name2)){
            System.out.println("Имена идентичны");
        }else
        if(name1.length()==name2.length()){
            System.out.println("Длины имен равны");
        }
    }
}
