package YLab_Tasks_Lection5.Task11;
/*11. Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
— Имя
— Имя, возраст
— Имя, возраст, пол
*/
public class Friend {
    private String name;
    private int age;
    private String gender;
    //constructors
    public Friend(String name){
        this.name = name;
    }
    public Friend(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Friend(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //getters
    public String getName(){ return name; }
    public int getAge(){ return age; }
    public String getGender(){ return gender; }
    //setters
    public void setName(String name){ this.name = name; }
    public void setAge(int age){ this.age = age; }
    public void setGender(String gender){ this.gender = gender; }
}
