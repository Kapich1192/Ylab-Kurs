package YLab_Tasks_Lection5.Tasks1to5;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int strength;
    //constructors
    Cat(String name, int age, int weight, int strength){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }
    //setters
    public void setName(String name){ this.name = name; }
    public void setAge(int age){ this.age = age; }
    public void setWeight(int weight){ this.weight = weight; }
    public void  setStrength(int strength){ this.strength = strength; }
    //getters
    public String getName(){ return name; }
    public int getAge(){ return age; }
    public int getWeight(){ return weight; }
    public int getStrength(){ return strength; }
    //methods
    /*
    Бой между котами, Возвращает true если нападающий кот победил
    */
    public boolean fight(Cat cat){
        int k1,k2;
        if(age >= 2 && age <=6)
            k1 = (int) ((age + strength) * 1.2);
        else
            k1 =   (int) ((age + strength) * 0.8);

        if(cat.getAge() >= 2 && cat.getAge() <=6)
            k2 = (int) ((cat.getStrength() + cat.getWeight()) * 1.2);
        else
            k2 =   (int) ((cat.getStrength() + cat.getWeight()) * 0.8);

        if(k1 > k2) {
            return true;
        }else return false;
    }
    /*
    Выводит характеристики кота
    */
    public void info(){
        System.out.println("Name: " + name + ";");
        System.out.println("Age: " + age + ";");
        System.out.println("Weight " + weight + ";");
        System.out.println("Strength: " + strength + ";");
    }
}
