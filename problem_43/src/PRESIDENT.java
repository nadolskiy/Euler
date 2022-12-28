import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by president on 3/26/14.
 */
public class PRESIDENT {
    public static void main(String args[]){
        // Получене времени начала запуска приложения
        Date startDate = new Date();


        System.out.println(new PRESIDENT().run());


        // Получение времени завершения приложения
        Date endDate = new Date();
        // Передаём время начала/конца на обработку и вывод
        TimeOfRunning.run(startDate, endDate);
    }

    private static int[] DIVISIBILITY_TESTS = {2, 3, 5, 7, 11, 13, 17};  // Первые 7-мь простых чисел


    public String run() {
        long sum = 0;
        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        outer:
        do {
            for (int i = 0; i < DIVISIBILITY_TESTS.length; i++) {
                if (toInteger(digits, i + 1, 3) % DIVISIBILITY_TESTS[i] != 0)
                    continue outer;
            }
            sum += toInteger(digits, 0, digits.length);
        } while (nextPermutation(digits));
        return Long.toString(sum);
    }

    public static boolean nextPermutation(int[] a) {
        int i, n = a.length;
        for (i = n - 2; ; i--) {
            if (i < 0)
                return false;
            if (a[i] < a[i + 1])
                break;
        }
        for (int j = 1; i + j < n - j; j++) {
            int tp = a[i + j];
            a[i + j] = a[n - j];
            a[n - j] = tp;
        }
        int j;
        for (j = i + 1; a[j] <= a[i]; j++);
        int tp = a[i];
        a[i] = a[j];
        a[j] = tp;
        return true;
    }

    private static long toInteger(int[] digits, int off, int len) {
        long result = 0;
        for (int i = off; i < off + len; i++)
            result = result * 10 + digits[i];
        return result;
    }
}
