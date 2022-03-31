package YLab_Tasks_Lection4.Task14;
/*Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.*/
public class Main {
    public static void main(String[] args) {
        int size = 10;
        for(int i = size; i > 0; i-- ){
            for(int j = 1; j<=size;j++){
                if(j > i)
                    System.out.print("8");
            }
            System.out.println("");
        }
    }
}
