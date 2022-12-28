import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by president on 3/14/14.
 */
public class PRESIDENT
{
    public static void main(String args[])
    {
        int d = 1000;
        double val;

        for (int i = 2; i < d; i++)
        {
            val = (double)1/i;
            String v = String.valueOf(val);
            System.out.println("1/" + i + " = " + val + " (" + (v.length()-2) + ")");
        }
    }
}
