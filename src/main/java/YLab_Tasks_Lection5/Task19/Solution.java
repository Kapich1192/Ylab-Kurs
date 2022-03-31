package YLab_Tasks_Lection5.Task19;
/*19. Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде «21 06 2015».*/
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Solution {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        int day  = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        System.out.println(day + " " + month + " "  + year);
    }
}
