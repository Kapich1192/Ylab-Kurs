package YLab_Tasks_Lection5.Task16;

public class Cat {
    private String name;
    private int age;
    private String color;
    //constructors
    public Cat(String name){
        this.name = name;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Cat(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    //getters
    public String getName(){ return name; }
    public int getHeight(){ return age; }
    public String getColor(){ return color; }
    //setters
    public void setName(String name){ this.name = name; }
    public void setHeight(int age){ this.age = age; }
    public void setColor(String color){ this.color = color; }
    //methods
    @Override
    public String toString(){
        String info = "name = " + name + ", age = " + age + ", color = " + color + ";";
        return info ;
    }
}
