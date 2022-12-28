import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PRESIDENT
{
    public static void main(String args[])
    {
        // Получене времени начала запуска приложения
        Date startDate = new Date();

        List<Integer> applicants = new ArrayList<Integer>();
        String result = "";

        System.out.println("Арифметические прогрессии: \n---");

        for (int a = 1000; a <= 9999; a++)
        {
            int count = 1;

            for (int i = 2; i <= (a/2); i++)
            {
                if (a % i == 0)
                {
                    count++;

                    if (count > 1)
                    {
                        i = a;
                    }
                }
            }
            if (count == 1)
            {
                    applicants.add(a);
            }
        }

        List<Integer> suitableB = new ArrayList<Integer>();
        for (int a = 0; a < applicants.size(); a++)
        {
            suitableB.clear();

            String[] currentA = String.valueOf(applicants.get(a)).split("");

            for (int b = applicants.size()-1; b >= a; b--)
            {
                if (a != b)
                {
                    String[] currentB = String.valueOf(applicants.get(b)).split("");

                    int count = 0;

                    for (int i = 1; i < currentA.length; i++)
                    {
                        for (int j = 1; j< currentB.length; j++)
                        {
                            if (currentA[i].equals(currentB[j]))
                            {
                                count++;
                                currentB[j] = null;
                                j = currentB.length;
                            }
                        }
                    }

                    if (count >= 4)
                    {
                        suitableB.add(applicants.get(b));
                    }
                }
            }

            for (int b = suitableB.size()-1; b >= 0; b--)
            {
                    int c = (suitableB.get(b) - applicants.get(a))/2;

                    for (int i = 0; i <= suitableB.size()-1; i++)
                    {
                        if ((c + applicants.get(a)) == suitableB.get(i))
                        {
                            System.out.println("(" + applicants.get(a) + ") + " + c + " = (" + suitableB.get(i) + ") + " + c + " = (" + suitableB.get(b) + ")");
                            result = "" + applicants.get(a) + suitableB.get(i)  + suitableB.get(b);
                        }
                    }
            }
        }

        System.out.println("---\n12-значное число, образованное при объединении трёх членов этой прогрессии: " + result);

        // Получение времени завершения приложения
        Date endDate = new Date();
        // Передаём время начала/конца на обработку и вывод
        TimeOfRunning.run(startDate,endDate);
    }
}
