import java.math.BigInteger;
import java.util.Date;

/**
 * Пятизначное число 16807 = 7^5 является также пятой степенью натурального числа. Аналогично, девятизначное число
 * 134217728 = 8^9 является девятой степенью. Сколько существует положительных n-значных целых чисел, являющихся также
 * и n-ыми степенями натурального числа?
 */

public class PRESIDENT {
    public static void main(String[] args) {
        // Получене времени начала запуска приложения
        Date start = new Date();

        int numberLimit = 9;
        int powLimit    = 100;
        int count       = 0;

        BigInteger result;

        for (int i = 1; i <= numberLimit; i++) {
            for (int j = 1; j <= powLimit; j++) {
                result = BigInteger.valueOf(i);
                result = result.pow(j);

                String[] arrayNumber = result.toString().split("");

                if (arrayNumber.length-1 == j)
                {
                    count++;
                    System.out.println(count + ". " + i + " ^ " + j + " = " + result + "( " + (arrayNumber.length-1) + " )");
                } else if (arrayNumber.length-1 > 9) {
                    j=powLimit;
                }
                else if (arrayNumber.length-1 > j)
                {
                    j = powLimit;
                }
            }
        }

        System.out.println("\nВсего существует " + count +" положительных n-значных целых чисел, являющихся также" +
                " и n-ыми степенями натурального числа?");

        // Получение времени завершения приложения
        Date stop = new Date();
        // Передаём время начала/конца на обработку и вывод
        runTime.calculateTime(start, stop);
    }
}
