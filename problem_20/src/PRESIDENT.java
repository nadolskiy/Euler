import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by president on 3/13/14.
 */
public class PRESIDENT
{
    public static void main(String args[])
    {
        int value = 100;
        BigInteger result = BigInteger.valueOf(100);

        for (int i = value-1; i >= 1; i--)
        {
            result = result.multiply(BigInteger.valueOf(i));
        }

        String bigValue = result.toString();

        System.out.println(bigValue);

        String[] oneChar = bigValue.split("");

        int a;
        int sum = 0;

        for (int i = 1; i <= oneChar.length-1; i++)
        {
            a = Integer.parseInt(oneChar[i]);
            sum += a;
        }
        System.out.println(sum);


    }
}
