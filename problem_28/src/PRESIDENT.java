/**
 * Created by president on 3/14/14.
 */
public class PRESIDENT
{
    public static void main(String args[])
    {
        int size = 1001;

        int sum = 1;
        int k=0;
        int[] j = new int[0];
        int s = 2;
        int res = 1;

        for (int i = 1; i <= size*size; i++)
        {

            sum += s;

            res += sum;

            k++;
            if (k == 4)
            {
                s += 2;
                k = 0;
            }

            if (sum == size*size)
            {
                i = size*size;
            }

            //System.out.println(sum);

        }

        System.out.println("Сумма чисел в диагоналях спирали " + size + " на " + size + " равна " + res);


    }
}
