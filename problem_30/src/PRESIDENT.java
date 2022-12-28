import java.util.ArrayList;
import java.util.List;

/**
 * Created by president on 3/17/14.
 */
public class PRESIDENT
{
    public static void main(String args[])
    {
        int r = 0;
        int degree = 5;
        int result = 0;
        List<Integer> degList = new ArrayList<Integer>();
        String currentValue = "";

        for (int i = 0; i <= 9; i++)
        {
            degList.add((int) Math.pow(i,degree));
        }

        for (int i = 2; i <= 1000000; i++)
        {
            currentValue = "" + i;
            String[] number = currentValue.split("");



            for (int j = 1; j <= number.length-1; j++)
            {
                String num = number[j].toString();

                int s = Integer.parseInt(num);

                r+= degList.get(s);

                //System.out.println("s = " + s + "; r = " + r + "; i = " + i);

            }

            if (r == i)
            {
                System.out.println(i);
                result += i;
            }
            r = 0;
        }
        System.out.println("Сумма всех чисел, которые могут быть записаны в виде суммы " + degree + " степеней их цифр равна: " + result);
    }
}
