package YLab_Tasks_Lection5.Task16;
/*16. Три класса
По аналогии с классом Duck(утка) создай классы Cat(кошка) и Dog(собака).
Подумай, что должен возвращать метод toString в классах Cat и Dog?
В методе main создай по два объекта каждого класса и выведи их на экран.
Объекты класса Duck уже созданы и выводятся на экран.*/
public class Solution {
    public static void main(String[] args) {
        Duck duck1 = new Duck("Marusia", 5, "red");
        Cat cat1 = new Cat("Tom", 6, "black");
        Dog dog1 = new Dog("Baks", 2, "white");
        System.out.println(duck1.toString());
        System.out.println(cat1.toString());
        System.out.println(dog1.toString());
    }
}
