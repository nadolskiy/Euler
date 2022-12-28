import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Calendar;

/**
 * Created by president on 3/12/14.
 */
public class PRESIDENT
{
    public static void main(String args[])
    {
        Calendar calendar = Calendar.getInstance();
        int dayWeek;
        int count = 0;

        for (int i = 1901; i <= 2000; i++)
        {
            for (int j = 0; j <= 11; j++)
            {
                calendar.set(i, j, 1);
                dayWeek = calendar.get(Calendar.DAY_OF_WEEK);

                if (dayWeek == 1)
                    count++;
            }
        }
        System.out.println(count);
    }
}