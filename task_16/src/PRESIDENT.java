import java.math.BigInteger;

/**
 * Created by president on 3/10/14.
 */
public class PRESIDENT
{
    public static void main(String args[])
    {
        BigInteger a = BigInteger.valueOf(2);
        int c = 1000;
        a = a.pow(c);

        int res = 0;

        String sBigValue = a.toString();

        String[] iBigValue = sBigValue.split("");

        for (int i=1; i <= iBigValue.length-1; i++)
        {
            res += Integer.parseInt(iBigValue[i].toString());
            System.out.println(res);
        }

        System.out.println("***");
        System.out.println(res);
    }
}
