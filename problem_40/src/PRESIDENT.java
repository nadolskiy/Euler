import java.util.Date;

/**
 * Created by president on 3/28/14.
 */
public class PRESIDENT {
    public static void main(String args[])
    {
        // Получене времени начала запуска приложения
        Date start = new Date();

        int max = 1000000;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < max; i++)
            sb.append(i);

        int prod = 1;
        for (int i = 0; i <= 6; i++)
            prod *= sb.charAt(pow(10, i) - 1) - '0';

        System.out.println(prod);

        // Получение времени завершения приложения
        Date stop = new Date();
        // Передаём время начала/конца на обработку и вывод
        runTime.calculateTime(start, stop);
    }

    public static int pow(int x, int y) {

        if (y < 0)

            throw new IllegalArgumentException("Negative exponent");

        int z = 1;

        for (int i = 0; i < y; i++) {

            if (Integer.MAX_VALUE / z < x)

                throw new ArithmeticException("Overflow");

            z *= x;

        }

        return z;

    }
}
