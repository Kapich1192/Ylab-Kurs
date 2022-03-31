package YLab_Tasks_Lection5.Task6;
/*6. Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
— Имя
— Имя, возраст
— Имя, возраст, пол
*/
public class Friend {
    private String name;
    private int age;
    private String gender;
    //initialize
    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void initialize(String name, int age, String gender){
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
