import java.math.BigInteger;

/**
 * Created by president on 3/10/14.
 */
public class PRESIDENT
{
    public static long getRoutes(int size)
    {
        long[][] matrix = new long[size + 1][size + 1];
        System.out.println("matrix:" + matrix);
        matrix[size - 1][size - 1] = 1;
        for (int x = size - 1; x >= 0; x--)
        {
            for (int y = size - 1; y >= 0; y--)
            {
                if (x == size - 1 && y == size - 1)
                {
                    matrix[x][y] = 1;
                    System.out.println("matrix["+x+"]["+y+"] = 1");
                }
                else
                {
                    matrix[x][y] = matrix[x + 1][y] + matrix[x][y + 1];
                    System.out.println("matrix["+x+"]["+y+"] = matrix[" + (x + 1) + "][" + y+"] + matrix["+x+"]["+(y + 1)+"];");
                }
            }
        }
        return matrix[0][0];
    }
    public static void main(String args[])
    {String answer = "";

        final int SIZE = 21;
        long result = getRoutes(SIZE);
        System.out.printf("Result:%d%n", result);
    }
}