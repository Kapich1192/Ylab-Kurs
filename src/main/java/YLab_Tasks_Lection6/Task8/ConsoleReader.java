package YLab_Tasks_Lection6.Task8;
import java.util.Scanner;
/*	4. Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку «true» или «false» и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода*/
public class ConsoleReader {
    //constructors
    private ConsoleReader(){}
    //static methods
    /**читает с клавиатуры строку*/
    public static String readString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = input.nextLine();
        return string;
    }
    /**итает с клавиатуры число*/
    public static int readInt(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int i = Integer.parseInt(input.nextLine());
        return i;
    }
    /**читает с клавиатуры дробное число*/
    public static double readDouble(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите вещественное число: ");
        double d = Double.parseDouble(input.nextLine());
        return d;
    }
    /**читает с клавиатуры строку «true» или «false» и возвращает
    соответствующую логическую переменную true или false*/
    public static boolean readBoolean(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите логическое значение true или false: ");
        boolean b = Boolean.parseBoolean(input.nextLine());
        return b;
    }
}
