package YLab_Tasks_Lection6.Task7;

public class Util {
    //constructors
    private Util(){}
    //static methods
    /*вычисляет длинну отрезка по координатам его концов*/
    public static double getDistance(int x1,int y1,int x2,int y2){
        double d;
        d = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2-y1,2));
        return d;
    }
}
