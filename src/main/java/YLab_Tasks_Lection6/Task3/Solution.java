package YLab_Tasks_Lection6.Task3;
/*3	3. По 50 000 объектов Cat и Dog
Создать в цикле по 50 000 объектов Cat и Dog.
(Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
*/
import Task2.*;
public class Solution {
    public static void main(String[] args) {
        for(int i = 0 ; i<50_000;i++){
            new Cat(""+i);
            new Dog("" + i);
        }
    }
}
