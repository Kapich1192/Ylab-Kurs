package YLab_Tasks_Lection5.Task12;
//12. Создать класс Cat
//Создать класс Cat (кот) с пятью конструкторами:
//— Имя,
//— Имя, вес, возраст
//— Имя, возраст (вес стандартный)
//— вес, цвет, (имя, адрес и возраст – неизвестные. Кот — бездомный)
//— вес, цвет, адрес ( чужой домашний кот)
//
//Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес.
// Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
public class Cat {
    private String name;
    private int weight = 3;
    private int age;
    private String color;
    private String address;
    //constructors
    public Cat(String name){
        this.name = name;
    }
    public Cat(String name, int weight,int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public Cat(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
    }
    public Cat(int weight,String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
    //getters
    public String getName(){ return name; }
    public int getWeight(){ return weight; }
    public int getAge(){ return age; }
    public String getColor(){ return color; }
    public String getAddress(){ return address; }
    //setters
    public void setName(String name){ this.name = name;}
    public void setWeight(int weight){ this.weight = weight;}
    public void setAge(int age){ this.age = age; }
    public void setColor(String color){ this.color = color; }
    public void setAddress(String address){ this.address = address; }

}
