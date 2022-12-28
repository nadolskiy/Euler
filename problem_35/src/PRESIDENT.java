import java.util.*;

/**
 * Created by president on 3/21/14.
 */
public class PRESIDENT {
    public static void main(String args[])
    {
        // Получене времени начала запуска приложения
        Date startDate = new Date();

        int maxLimit = 1000000;
        int result = 0;

        for (int i = 0; i <= maxLimit; i++)
        {
            if (isSimple(i))
            {
                if (isCircular(i))
                {
                    result++;
//                    System.out.println(i);
                }
            }
        }

        System.out.println("Всего существует (" + result + ") круговых простых чисел меньше " + maxLimit);
        // Получение времени завершения приложения
        Date endDate = new Date();
        // Передаём время начала/конца на обработку и вывод
        TimeOfRunning.run(startDate, endDate);
    }

    public static boolean isCircular(int value)
    {
        String[] cValue = String.valueOf(value).split("");

        if (cValue.length-1 == 1)
        {
            return true;
        }
        else if (cValue.length-1 == 2)
        {
            String snValue = cValue[2].toString() + cValue[1].toString();
            int nValue = Integer.parseInt(snValue);
            if (isSimple(nValue))
            {
                return true;
            }
            else
                return false;
        }
        else if (cValue.length-1 == 3)
        {
            String snValue1 = cValue[2].toString() + cValue[3].toString() + cValue[1].toString();
            String snValue2 = cValue[3].toString() + cValue[1].toString() + cValue[2].toString();

            int nValue1 = Integer.parseInt(snValue1);
            int nValue2 = Integer.parseInt(snValue2);

            if ((isSimple(nValue1) && nValue1 > 99) && (isSimple(nValue2) && nValue2 > 99))
            {
                return true;
            }
            else
                return false;
        }
        else if (cValue.length-1 == 4)
        {
            String snValue1 = cValue[2].toString() + cValue[3].toString() + cValue[4].toString() + cValue[1].toString();
            String snValue2 = cValue[3].toString() + cValue[4].toString() + cValue[1].toString() + cValue[2].toString();
            String snValue3 = cValue[4].toString() + cValue[1].toString() + cValue[2].toString() + cValue[3].toString();

            int nValue1 = Integer.parseInt(snValue1);
            int nValue2 = Integer.parseInt(snValue2);
            int nValue3 = Integer.parseInt(snValue3);

            if ((isSimple(nValue1) && nValue1 > 999) && (isSimple(nValue2) && nValue2 > 999) && (isSimple(nValue3) && nValue3 > 999))
            {
                return true;
            }
            else
                return false;
        }
        else if (cValue.length-1 == 5)
        {
            String snValue1 = cValue[2].toString() + cValue[3].toString() + cValue[4].toString() + cValue[5].toString() + cValue[1].toString();
            String snValue2 = cValue[3].toString() + cValue[4].toString() + cValue[5].toString() + cValue[1].toString() + cValue[2].toString();
            String snValue3 = cValue[4].toString() + cValue[5].toString() + cValue[1].toString() + cValue[2].toString() + cValue[3].toString();
            String snValue4 = cValue[5].toString() + cValue[1].toString() + cValue[2].toString() + cValue[3].toString() + cValue[4].toString();

            int nValue1 = Integer.parseInt(snValue1);
            int nValue2 = Integer.parseInt(snValue2);
            int nValue3 = Integer.parseInt(snValue3);
            int nValue4 = Integer.parseInt(snValue4);

            if ((isSimple(nValue1) && nValue1 > 9999) && (isSimple(nValue2) && nValue2 > 9999) && (isSimple(nValue3) && nValue3 > 9999) && (isSimple(nValue4) && nValue4 > 9999))
            {
                return true;
            }
            else
                return false;
        }
        else if (cValue.length-1 == 6)
        {
            String snValue1 = cValue[2].toString() + cValue[3].toString() + cValue[4].toString() + cValue[5].toString() + cValue[6].toString() + cValue[1].toString();
            String snValue2 = cValue[3].toString() + cValue[4].toString() + cValue[5].toString() + cValue[6].toString() + cValue[1].toString() + cValue[2].toString();
            String snValue3 = cValue[4].toString() + cValue[5].toString() + cValue[6].toString() + cValue[1].toString() + cValue[2].toString() + cValue[3].toString();
            String snValue4 = cValue[5].toString() + cValue[6].toString() + cValue[1].toString() + cValue[2].toString() + cValue[3].toString() + cValue[4].toString();
            String snValue5 = cValue[6].toString() + cValue[1].toString() + cValue[2].toString() + cValue[3].toString() + cValue[4].toString() + cValue[5].toString();

            int nValue1 = Integer.parseInt(snValue1);
            int nValue2 = Integer.parseInt(snValue2);
            int nValue3 = Integer.parseInt(snValue3);
            int nValue4 = Integer.parseInt(snValue4);
            int nValue5 = Integer.parseInt(snValue5);

            if ((isSimple(nValue1) && nValue1 > 99999) && (isSimple(nValue2) && nValue2 > 99999) && (isSimple(nValue3) && nValue3 > 99999) && (isSimple(nValue4) && nValue4 > 99999) && (isSimple(nValue5) && nValue5 > 99999))
            {
                return true;
            }
            else
                return false;
        }
        else
            return true;
    }

    public static boolean isSimple(int value)
    {
        if (value == 2)
        {
            return true;
        }
        else if (Math.sqrt(value) % 1 == 0 || value % 4 == 0 || value % 6 == 0 || value % 10 == 0)
        {
            return false;
        }
        else
        {
            int maxElement = (int) Math.ceil(Math.sqrt(value));
            int divisor = 0;

            for (int a = 2; a <= maxElement; a++) {
                if (value % a == 0) {
                    divisor++;
                    a = maxElement;
                }
            }

            if (divisor == 0) {
                return true;
            } else
                return false;
        }
    }
}
