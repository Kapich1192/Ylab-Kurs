package YLab_Tasks_Lection5.Task17;
/*17. Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными, используя конструктор.
5. Объекты выведи на экран в таком формате [name + » » + age + » » + address].*/
public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Bob", 25,"Moskva, Maroseika d8, kv 1");
        Man man2 = new Man("Tim", 47,"Moskva, Vavilova d17, kv 97");
        Women women1 = new Women("Kate", 17,"Moskva, Severnaia d25, kv 19");
        Women women2 = new Women("Mary", 35,"Moskva, Ygnaia d21, kv 57");
        System.out.println(man1.toString());
        System.out.println(man2.toString());
        System.out.println(women1.toString());
        System.out.println(women2.toString());

    }

    public static class Man{
        String name;
        int age;
        String address;
        //constructors
        Man(String name){
            this.name = name;
        }
        Man(String name, int age){
            this.name = name;
            this.age = age;
        }
        Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        //methods
        @Override
        public String toString(){
            return "name = " + name + ", age = " + age + ", address = " + address + ";";
        }
    }

    public static class Women{
        String name;
        int age;
        String address;
        //constructors
        Women(String name){
            this.name = name;
        }
        Women(String name, int age){
            this.name = name;
            this.age = age;
        }
        Women(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        //methods
        @Override
        public String toString(){
            return "name = " + name + ", age = " + age + ", address = " + address + ";";
        }
    }
}
