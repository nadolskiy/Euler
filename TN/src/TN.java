import android.util.Log;

/**
 * Created by president on 3/7/14.
 */
public class TN
{
    public static void main(String[] args)
    {

        long triangularNumber = 0;
        int length = 0;
        int max_length = 0;
        int max = 10000000;

        for (int a = 1; a <= max; a++)
        {
            triangularNumber +=a;

            if (triangularNumber >= 9223372036854775807l)
            {
                a = max;
            }

            for (int c = 1; c <= triangularNumber; c++)
            {
                if (triangularNumber % c == 0)
                {
                    length++;

                    if (length >= 501)
                    {
                        System.out.print("ОТВЕТ: ******** " + a + ":  " + triangularNumber + " (имеет " + length + " делителей) ********\n");
                        a = max;
                    }
                }
            }

            if (length > max_length)
            {
                max_length = length;
                System.out.print(a + ":  " + triangularNumber + " (имеет -= " + length + " =- делителей)\n");
            }

            length = 0;
        }
        System.out.print("ХХХХХХХХХХХ !!! КОНЕЦ ДИАПАЗОНА ЧИСЕЛ !!! ХХХХХХХХХХХ");
    }
}
