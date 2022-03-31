package YLab_Tasks_Lection6.Task11;

public class Solution {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            new Cat("name" + i);
        }
        Cat.printCats();
    }
}
