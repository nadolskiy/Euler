import android.util.Log;

/**
 * Created by president on 3/2/14.
 */
public class SimpleJava
{
        public static void main(String[] args) {


            int n = 0; // Счётчик простых чисел
            int kolDelit = 0; // Количество делителей
            long sum = 0;

            for (int a = 2; a < 2000000; a++)
            {
                for (int b = 2; b <= a; b++)
                {
                    if (a % b == 0)
                    {
                        kolDelit +=1;   // Количество делителей у числа
                    }
                }
                // Если число имеет только один делитель
                if (kolDelit == 1)
                {
                    n++;    // Увеличиваем счётчик на 1
                    sum += (long) a;
                    System.out.println(n + ". Число '" + a + "' - является простым числом; Сумма простых чисел: " + sum);
                }
                kolDelit = 0;
            }
            System.out.println("--------------------------------------------------------");
            System.out.println("Сумма всех простых чисел меньше 2 000 000 составляет: " + sum);
        }
        }


