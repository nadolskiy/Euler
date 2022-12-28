import java.math.BigInteger;
import java.util.Date;

/**
 * Гугол (10^100) - гигантское число: один со ста нулями; 100^100 почти невообразимо велико: одни с двумяста нулями.
 * Несмотря на их размер, сумма цифр каждого числа равна всего лишь 1.
 * Рассматривая натуральные числа вида a^b, где a, b < 100, какова максимальная сумма цифр?
*/

public class PRESIDENT {
    public static void main(String[] args) {
        // Получене времени начала запуска приложения
        Date start = new Date();

        BigInteger number;
        int limit     = 100;
        int maxResult = 0;

        for (int i = 2; i < limit; i++) {
            for (int j = 1; j < limit; j++) {
                number = BigInteger.valueOf(i);
                number = number.pow(j);

                String[] arrayNumbers = number.toString().split("");
                int result = 0;

                for (int g = 1; g < arrayNumbers.length; g++ )
                    result += Integer.parseInt(arrayNumbers[g]);
                if (result > maxResult)
                    maxResult = result;
            }
        }
        // Получение времени завершения приложения
        Date stop = new Date();
        // Передаём время начала/конца на обработку и вывод
        runTime.calculateTime(start, stop);

        System.out.println("Максимальная сумма цифр - " + maxResult);
    }
}