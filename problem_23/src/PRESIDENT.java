import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PRESIDENT
{
    public static void main(String args[])
    {
        List<Integer> idealList         = new ArrayList<Integer>();                                                      // Массив с "идеальными" числами
        List<Integer> insufficientList  = new ArrayList<Integer>();                                                      // Массив с "недостаточными" числами
        List<Integer> excessList        = new ArrayList<Integer>();                                                      // Массив с "избыточными" числами
        List<Integer> excessSumList     = new ArrayList<Integer>();                                                      // Массив с "избыточными" числами

        int finish  = 28123;                                                                                               // Последнее число
        int divider = 0;                                                                                                 // Делитель

        int result  = 0;                                                                                                 // Результат

        for (int i = 1; i <= finish; i++)
        {
            for (int j = 1; j < i; j++)
            {
                if (i % j == 0)
                {
                    divider += j;
                }
            }

            if (i == divider)
            {
                insufficientList.add(i);
            }
            else if (i > divider)
            {
                insufficientList.add(i);
            }
            else if (i < divider)
            {
                excessList.add(i);
            }

            divider = 0;
        }

        for (int i = 0; i < excessList.size(); i++)
        {
            for (int j = 0; j <= i; j++)
            {
                for (int k = 0; k <= i; k++)
                {
                    if (excessList.get(j) + excessList.get(k) == excessList.get(i))
                    {
                        j = i;
                        k = i;
                        excessSumList.add(excessList.get(i));
                    }
                }
            }
        }

        for (int i = 0; i < insufficientList.size(); i++)
        {
            for (int j = 0; j < excessList.size(); j++)
            {
                if ((excessList.get(j) < insufficientList.get(i)))
                {
                    for (int k = 0; k < excessList.size(); k++)
                    {
                        if ((excessList.get(k) < insufficientList.get(i)))
                        {
                            if (excessList.get(j) + excessList.get(k) == insufficientList.get(i))
                            {
                                j = excessList.size();
                                k = excessList.size();
                                excessSumList.add(insufficientList.get(i));
                            }
                        } else
                            k = excessList.size();
                    }
                } else
                    j = excessList.size();

            }
        }


        for (int i = 0; i < insufficientList.size(); i++)
        {
            for (int j = 0; j < excessSumList.size(); j++)
            {
                if (insufficientList.get(i) == excessSumList.get(j))
                {
                    j = excessSumList.size();
                    insufficientList.remove(i);
                    i--;
                }
            }
        }

        for (int i = 0; i < excessList.size(); i++)
        {
            for (int j = 0; j < excessSumList.size(); j++)
            {
                if (excessList.get(i) == excessSumList.get(j))
                {
                    j = excessSumList.size();
                    excessList.remove(i);
                    i--;
                }
            }
        }

        for (int i = 0; i < idealList.size(); i++)
        {
            result += idealList.get(i);
        }

        for (int i = 0; i < insufficientList.size(); i++)
        {
            result += insufficientList.get(i);
        }

        for (int i = 0; i < excessList.size(); i++)
        {
            result += excessList.get(i);
        }

        System.out.println("Сумма всех положительных чисел, " +
                           "которые не могут быть записаны как " +
                           "сумма двух избыточных чисел равна: " + result);
    }
}