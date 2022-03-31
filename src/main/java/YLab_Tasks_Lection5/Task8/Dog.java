package YLab_Tasks_Lection5.Task8;
/*8. Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
— Имя
— Имя, рост
— Имя, рост, цвет
*/
public class Dog {
    private String name;
    private int height;
    private String color;
    //initialize
    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int height){
        this.name = name;
        this.height = height;
    }
    public void initialize(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }
    //getters
    public String getName(){ return name; }
    public int getHeight(){ return height; }
    public String getColor(){ return color; }
    //setters
    public void setName(String name){ this.name = name; }
    public void setHeight(int height){ this.height = height; }
    public void setColor(String color){ this.color = color; }
}
