package YLab_Tasks_Lection6.Task2;

public class Dog {
    private String name;
    private int age;
    private int weight;
    private String color;
    //constructors
    public Dog(String name){
        this.name = name;
    }
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Dog(String name, int age,int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Dog(String name, int age, int weight,String color){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    //initialize
    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void initialize(String name, int age,int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void initialize(String name, int age, int weight,String color){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    //getters
    public String getName(){return name;}
    public int getAge(){return age;}
    public int getWeight(){return weight;}
    public String getColor(){return color;}
    //setters
    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public void setWeight(int weight){this.weight = weight;}
    public void setColor(String color){this.color = color;}
    //methods
    @Override
    public String toString(){
        return "name = " + name + ", age = " + age + ", weight = " + weight + ", color = " + color + ";";
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println(name + " destroyed");
    }
}
