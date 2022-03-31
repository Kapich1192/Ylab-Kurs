package YLab_Tasks_Lection6.Task10;

public class Cat {
    private String name;
    public static int catCount = 0;
    //constructors
    public Cat(String name){
        this.name = name;
        catCount++;
    }
}
