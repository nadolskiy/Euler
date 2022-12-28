import android.util.Log;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by president on 3/19/14.
 */
public class PRESIDENT {
    public static void main(String args[]) {
        // Получене времени начала запуска приложения
        Date startDate = new Date();

        int divisor = 0;
        long sum;
        int maxLimit = 2000000;
        int currentLimit;

        // Для чисел меньше 18
        if (maxLimit <= 17)
        {
            sum = 2;
            for (int i = 2; i <= maxLimit ; i++)
            {
                currentLimit = (int) Math.ceil(Math.sqrt(i));
                for (int j = 2; j <= currentLimit; j++)
                {
                    if (i % j == 0)
                    {
                        divisor++;
                        if (divisor > 0)
                        {
                            j = currentLimit;
                        }
                    }
                }
                if (divisor == 0)
                {
                    sum += i;
                }
                divisor = 0;
            }
        }
        // Для чисел больше 18
        else
        {
            sum = 58;
            for (int a = 11; a <= maxLimit; a += 2)
            {
                if (Math.sqrt(a) % 1 == 0 || a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a % 7 == 0 || a % 11 == 0 || a % 13 == 0 || a % 17 == 0)
                {
                }
                else
                {
                    currentLimit = (int) Math.ceil(Math.sqrt(a));

                    for (int b = 3; b <= currentLimit; b++)
                    {
                        if (a % b == 0)
                        {
                            divisor++;   // Количество делителей у числа
                            if (divisor > 1)
                            {
                                b = currentLimit;
                            }
                        }
                    }
                    // Если число имеет только один делитель
                    if (divisor == 0)
                    {
                        sum += (long) a;
                    }

                    divisor = 0;
                }
            }
        }
        System.out.println("Сумма всех простых чисел меньше " + maxLimit + " составляет: " + sum);
        // Получение времени завершения приложения
        Date endDate = new Date();
        // Передаём время начала/конца на обработку и вывод
        TimeOfRunning.run(startDate,endDate);
    }
}
