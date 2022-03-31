package YLab_Tasks_Lection5.Tasks1to5;

public class Dog {
    private String name;
    private int age;
    //constructors
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    //setters
    public void setName(String name){ this.name = name;}
    public void setAge(int age){this.age = age;}
    //getters
    public String getName(){return name;}
    public int getAge(){return age;}
}
