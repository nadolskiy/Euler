import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by president on 3/17/14.
 */
public class PRESIDENT
{
    public static void main(String args[])
    {
        int sum = 0;
        for (int i = 1; i < 10000; i++) {
            if (hasPandigitalProduct(i))
                sum += i;
        }
        System.out.println(sum);
    }

    private static boolean hasPandigitalProduct(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && isPandigital("" + n + i + n/i))
                return true;
        }
        return false;
    }

    private static boolean isPandigital(String s) {
        if (s.length() != 9)
            return false;
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        return new String(temp).equals("123456789");
    }
}
