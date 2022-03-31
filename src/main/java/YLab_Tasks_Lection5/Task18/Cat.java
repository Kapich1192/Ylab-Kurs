package YLab_Tasks_Lection5.Task18;

public class Cat {
    private String name;
    private int weight = 1;
    private int age;
    //constructors
    public Cat(String name){
        this.name = name;
    }
    public Cat(String name, int age,int weight){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public Cat(String name,int age){
        this.name = name;
        this.age = age;
    }
    //getters
    public String getName(){ return name; }
    public int getWeight(){ return weight; }
    public int getAge(){ return age; }
    //setters
    public void setName(String name){ this.name = name; }
    public void setWeight(int weight){ this.weight = weight; }
    public void setAge(int age){ this.age = age; }
    //methods
    @Override
    public String toString(){
        return "name = " + name + ", age = " + age + ", weight = " + weight + ";";
    }
}
