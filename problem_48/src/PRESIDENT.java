import java.math.BigInteger;
import java.util.Date;

/**
 * Created by president on 3/20/14.
 */
public class PRESIDENT
{
    public static void main(String args[])
    {
        // Получене времени начала запуска приложения
        Date startDate = new Date();

        int limit = 1000;

        BigInteger result = BigInteger.valueOf(0);
        BigInteger cValue = BigInteger.valueOf(0);

        for (int i = 1; i <= limit; i++)
        {
            cValue = BigInteger.valueOf(i);
            result = result.add(cValue.pow(i));
        }

        String sResult = String.valueOf(result);
        String[] arrayValue = sResult.split("");
        String lastTen = "";
        for (int i = arrayValue.length-10; i <= arrayValue.length-1; i++)
        {
            lastTen += arrayValue[i].toString();
        }

        System.out.println("Сумма: " + result);
        System.out.println("Последние десять цифр суммы: " + lastTen);


        // Получение времени завершения приложения
        Date endDate = new Date();
        // Передаём время начала/конца на обработку и вывод
        TimeOfRunning.run(startDate,endDate);
    }
}
