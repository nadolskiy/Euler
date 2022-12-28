import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by president on 3/20/14.
 */
public class PRESIDENT
{
    public static void main(String args[])
    {
        // Получене времени начала запуска приложения
        Date startDate = new Date();

        System.out.println(new PRESIDENT().run());

        // Получение времени завершения приложения
        Date endDate = new Date();
        // Передаём время начала/конца на обработку и вывод
        TimeOfRunning.run(startDate,endDate);
    }

    private String run()
    {
        for (int i = 2; ; i++) {
            if ( has4PrimeFactors(i + 0)
                    && has4PrimeFactors(i + 1)
                    && has4PrimeFactors(i + 2)
                    && has4PrimeFactors(i + 3))
                return Integer.toString(i);
        }
    }

    private static boolean has4PrimeFactors(int n) {
        return countDistinctPrimeFactors(n) == 4;
    }


    private static int countDistinctPrimeFactors(int n) {
        int count = 0;
        for (int i = 2, end = sqrt(n); i <= end; i++) {
            if (n % i == 0) {
                do n /= i;
                while (n % i == 0);
                count++;
                end = sqrt(n);
            }
        }
        if (n > 1)
            count++;
        return count;
    }

    public static int sqrt(int x) {
        if (x < 0)
            throw new IllegalArgumentException("Square root of negative number");
        int y = 0;
        for (int i = 32768; i != 0; i >>>= 1) {
            y |= i;
            if (y > 46340 || y * y > x)
                y ^= i;
        }
        return y;
    }
}
