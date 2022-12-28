import java.math.BigInteger;

/**
 * Created by president on 3/14/14.
 */
public class PRESIDENT
{
    public static void main(String args[])
    {
        int max = 1000000;
        int size = 1;
        BigInteger val;
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(0);

        for (int n = 1; n <= max; n++)
        {
            val = a.add(b);
            a = b;
            b = val;

            if (val.toString().length() == size)
            {
                System.out.println("F" + n  + " = " + val + " (" + val.toString().length() + ") ");
                size++;
                if (val.toString().length() == 1000)
                {
                    n = max;
                }
            }
        }


    System.out.println("THE END");
    }
}
