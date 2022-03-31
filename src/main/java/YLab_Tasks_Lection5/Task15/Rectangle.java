package YLab_Tasks_Lection5.Task15;
/*15. Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
 Создать для него как можно больше конструкторов:

Примеры:
— заданы 4 параметра: left, top, width, height
— ширина/высота не задана (оба равны 0)
— высота не задана (равно ширине) создаём квадрат
— создаём копию другого прямоугольника (он и передаётся в параметрах)*/
public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;
    //Constructors
    public Rectangle(Rectangle rectangle){
        top = rectangle.getTop();
        left = rectangle.getLeft();
        width = rectangle.getWidth();
        height = rectangle.getHeight();
    }
    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
    }
    public Rectangle(int top, int left,int width){
        this.top = top;
        this.left = left;
        this.width = width;
        height = width;
    }
    public Rectangle(int top, int left,int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    //getters
    public int getTop(){return top;}
    public int getLeft(){return left;}
    public int getWidth(){return width;}
    public int getHeight(){return height;}
    //setters
    public void setTop(int top){this.top = top;}
    public void setLeft(int left){this.left = left;}
    public void setWidth(int width){this.width = width;}
    public void setHeight(int height){this.height = height;}
}
