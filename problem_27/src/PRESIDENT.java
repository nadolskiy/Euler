import java.util.List;

/**
 * Created by president on 3/14/14.
 */
public final class PRESIDENT implements EulerSolution
{
    public static void main(String args[])
    {
        System.out.println(new PRESIDENT().run());
    }

    public String run()
    {
        int bestNumber = 0;
        int bestA = 0;
        int bestB = 0;

        for (int a = -1000; a <= 1000; a++)
        {
            for (int b = -1000; b <= 1000; b++)
            {
                int num = numberOfConsecutivePrimesGenerated(a, b);
                if (num > bestNumber)
                {
                    bestNumber = num;
                    bestA = a;
                    bestB = b;
                }
            }
        }
        return Integer.toString(bestA*bestB);
    }

    private static int numberOfConsecutivePrimesGenerated(int a, int b)
    {
        for (int i = 0; ; i++)
        {
            int n = i * i + i * a + b;
            if (n < 0 || !Library.isPrime(n))
                return i;
        }
    }
}
