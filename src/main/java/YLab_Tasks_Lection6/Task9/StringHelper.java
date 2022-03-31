package YLab_Tasks_Lection6.Task9;
/*
5. Класс StringHelper
Cделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку, повторенную count раз.
String multiply(String s) – возвращает строку, повторенную 5 раз.
*/

public class StringHelper {
    //constructors
    private StringHelper(){};
    //static methods
    /**возвращает строку, повторенную count раз.*/
    public static String multiply(String s,int count){
        String m = s;
        for(int i = 0; i < count - 1; i++){
            s +=m;
        }
        return s;
    }
    /**возвращает строку, повторенную 5 раз.*/
    public static String multiply(String s){
        String m = s;
        for(int i = 0; i < 4; i++){
            s += m;
        }
        return s;
    }
}
