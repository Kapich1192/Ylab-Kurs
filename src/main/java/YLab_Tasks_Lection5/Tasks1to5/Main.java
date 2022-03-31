package YLab_Tasks_Lection5.Tasks1to5;
/*1. Создать класс Cat
Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int),
 вес (weight, int), сила (strength, int).
 2. Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat): реализовать механизм драки котов в зависимости от их веса,
 возраста и силы. Зависимость придумать самому. Метод должен определять,
  выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false — если нет.
Должно выполняться условие:
если cat1.fight(cat2) == true , то cat2.fight(cat1) == false
3. Геттеры и сеттеры для класса Dog
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
4. Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
5. Провести три боя попарно между котами
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
*/
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 3,7,13 );
        Cat cat2 = new Cat("Bob", 1,5,18 );
        Cat cat3 = new Cat("Stive", 6,11,9 );
        System.out.println("Бой №1,нападение кота по имени " + cat1.getName() + " на кота по имени " + cat2.getName());
        resultFight(cat1,cat2);
        System.out.println("Бой №2,нападение кота по имени " + cat2.getName() +" на кота по имени " +cat3.getName());
        resultFight(cat2,cat3);
        System.out.println("Бой №3,нападение кота по имени " + cat1.getName() +" на кота по имени " + cat3.getName());
        resultFight(cat1,cat3);
    }
    /*Вывод результата боя на экран, первый параметр нападающий кот, второй защищающийся*/
    public static void resultFight(Cat cat1,Cat cat2){
       if(cat1.fight(cat2)){
           System.out.println("В бою победил нападающий кот по имени " + cat1.getName());
       }else{
           System.out.println("В бою победил защищающийся кот по имени " + cat2.getName());
       }
    }
}
