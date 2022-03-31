package YLab_Tasks_Lection6.Task11;

import java.util.ArrayList;

public class Cat {
    public String name;
    public static int catCount = 0;
    public static ArrayList<Cat> cats = new ArrayList<>();
    //constructors
    public Cat(String name){
        this.name = name;
        catCount++;
        cats.add(this);
    }
    //methods
    @Override
    public String toString(){
        return "cat name = "+ name;
    }
    //static methods
    public static void printCats(){
        if(cats.size() == 0)return;
        else{
            for(int i = 0;i < cats.size();i++)
            {
                System.out.println(cats.get(i).toString());
            }
        }

    }
}
