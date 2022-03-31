package YLab_Tasks_Lection5.Task14;
/*14. Создать класс Circle
        Создать класс (Circle) круг, с тремя конструкторами:
        — centerX, centerY, radius
        — centerX, centerY, radius, width
        — centerX, centerY, radius, width, color
        Я считаю, что реализация пункта 2 и 3 приведет к логической ошибке.
        Когда меняется радиус меняется ширина и наоборот.
        */
public class Circle {
    private int centerX;
    private int centerY;
    private double radius;
    private double width;
    private String color;
    //constructors
    public Circle(int centerX,int centerY,double radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        width = (int)(2 * Math.PI * radius * 100) / 100.0;
    }
    public Circle(int centerX,int centerY, double width,String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.width = width;
        this.color = color;
        radius = (int)(width / Math.PI / 2 * 100) / 100.0;
    }
    //getters
    public int getCenterX(){ return centerX; }
    public int getCenterY(){ return centerY; }
    public double getRadius(){ return radius; }
    public double getWidth(){ return width; }
    public String getColor(){ return color; }
    //setters
    public void setCenterX(int centerX){ this.centerX = centerX; }
    public void setCenterY(int centerY){ this.centerY = centerY; }
    public void setRadius( double radius){
        this.radius = radius;
        width = (int)(2 * Math.PI * radius * 100) / 100.0;
    }
    public void setWidth(double width){
        this.width = width;
        radius = (int)(width / Math.PI / 2 * 100) / 100.0;
    }
    public void setColor(String color){ this.color = color; }
}
