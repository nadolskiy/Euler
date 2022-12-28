import java.util.Date;

/**
 * Created by president on 3/25/14.
 */
public class PRESIDENT
{
    public static void main(String args[])
    {
        // Получене времени начала запуска приложения
        Date startDate = new Date();

        int limit = 10000;
        int count;

        for(int i = 2; i <= limit; i++)
        {
            count = 0;
            if (isOdd(i))
            {
                for (int j = 2; j<= i-2; j++)
                {
                    if (isSimple(j))
                    {
                        for (int q = 1; q <=j; q++)
                        {
                            int sum = (int) (j + (2*Math.pow(q,2)));
                            if (sum == i)
                            {
                                q = j;
                                j = i;
                                count++;
                            }

                        }

                    }

                }
                if (count == 0)
                {
                    System.out.println(i + " - нечетное составное число, которое нельзя записать в виде суммы простого числа и удвоенного квадрата");
                    i = limit;
                }
            }

        }

        // Получение времени завершения приложения
        Date endDate = new Date();
        // Передаём время начала/конца на обработку и вывод
        TimeOfRunning.run(startDate, endDate);
    }

    // Проверка на чётность
    public static boolean isOdd(int number)
    {
        if (number % 2 == 0)
            return false;
        else if (isSimple(number))
            return false;
        return true;
    }

    // Проверка на простоту
    public static boolean isSimple(int value)
    {
        if (value == 2)
        {
            return true;
        }
        else if (Math.sqrt(value) % 1 == 0 || value % 4 == 0 || value % 6 == 0 || value % 10 == 0)
        {
            return false;
        }
        else
        {
            int maxElement = (int) Math.ceil(Math.sqrt(value));
            int divisor = 0;

            for (int a = 2; a <= maxElement; a++) {
                if (value % a == 0) {
                    divisor++;
                    a = maxElement;
                }
            }

            if (divisor == 0) {
                return true;
            } else
                return false;
        }
    }
}
