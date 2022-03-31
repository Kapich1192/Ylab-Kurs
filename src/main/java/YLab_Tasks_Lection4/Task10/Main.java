package YLab_Tasks_Lection4.Task10;
/*4. S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.*/
public class Main {
    public static void main(String[] args) {
        int size1 = 10;
        while(size1 > 0){
            int size2 = 10;
            while (size2 > 0){
                System.out.print("S");
                size2--;
            }
            System.out.println("");
            size1--;
        }
    }
}
