import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by president on 3/14/14.
 */
public class PRESIDENT
{
    public static void main(String args[])
    {
        List<String> allResult = new ArrayList<String>();
        BigInteger c;

        BigInteger k;

        for (int a = 2; a <= 100; a++)
        {
           for (int b = 2; b <= 100; b++)
           {
               k = BigInteger.valueOf(a);
               c = k.pow(b);
               allResult.add(c.toString());

           }
        }

        for (int i = 0; i < allResult.size()-1; i++)
        {
            for (int j = i+1; j < allResult.size(); j++)
            {
                if ((i != j) && (allResult.get(i).equals(allResult.get(j))))
                {
                    allResult.remove(allResult.get(j));
                    i--;
                    j = allResult.size();
                }
            }
        }

        System.out.println("Последовательность ab для 2 ≤ a ≤ 100 и 2 ≤ b ≤ 100 имеет " + allResult.size() + " различных членов;");
    }
}
