import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class PRESIDENT
{
    public static void main(String args[])
    {
        // Получене времени начала запуска приложения
        Date startDate = new Date();

        int limit = 50000;
        int factorial = 1;
        long result = 0;
        List<Integer> lFac = new ArrayList<Integer>();

        // Находим значения фактериала чисел от 0! до 9!
        for (int i = 0; i <= 9; i++)
        {
            if (i == 0 || i == 1)
            {

            } else
            {
                for (int j = 1; j <= i; j++)
                {
                    factorial *= j;
                }
            }
            lFac.add(factorial);
            factorial = 1;
        }

        for (int i = 3; i <= limit; i++)
        {
            if (i < 10)
            {
                if (lFac.get(i) == i)
                {
                    result += i;
                }
            }
            else
            {
                String[] cValue = String.valueOf(i).split("");
                long sum = 0;
                for (int j = 1; j < cValue.length; j++)
                {
                    sum += lFac.get(Integer.parseInt(cValue[j]));
                }

                if (i == sum)
                {
                    result += i;
                }
            }
        }

        System.out.println("Сумма всех чисел, каждое из которых равно сумме факториалов своих цифр равна " + result);

        // Получение времени завершения приложения
        Date endDate = new Date();
        // Передаём время начала/конца на обработку и вывод
        TimeOfRunning.run(startDate,endDate);
    }
}
