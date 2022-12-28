import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by president on 3/13/14.
 */
public class PRESIDENT
{
    public static void main(String args[])
    {
        int a = 10000;
        int b = 0;
        int[] mass = new int[a+1];

        for (int i = 1; i < a; i++)
        {
            for (int j = 1; j < a; j++)
            {
                if (i % j == 0)
                {
                    if (i != j)
                    {
                        b += j;
                    }
                }
            }
            mass[i] = b;
            b = 0;
        }

        int l = 0;

        for (int i = 1; i <= mass.length-1; i++)
        {
            for (int j = 1; j < mass.length; j++)
            {
                if (i != j)
                {
                    if (mass[i] == j)
                    {
                        if (mass[j] == i)
                        {
                            System.out.println("d(" + i + ") = " + mass[i] + ". d(" + j +") = " + mass[j]);
                            l += mass[i];

                        }
                    }
                }
            }
        }

        System.out.println(l);

    }
}