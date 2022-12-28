import java.util.Date;

public class PRESIDENT
{
    public static void main(String args[])
    {
        // Получене времени начала запуска приложения
        Date startDate = new Date();
    // -----------------------------------------------------------------------------------------------------------------
        int denproduct = 1;
        int nomproduct = 1;

        for (int i = 1; i < 10; i++) {
            for (int den = 1; den < i; den++) {
                for (int nom = 1; nom < den; nom++) {
                    if ((nom * 10 + i) * den == nom * (i * 10 + den)) {
                        denproduct *= den;
                        nomproduct *= nom;
                        System.out.println("d: " + denproduct + " *= " + den);
                        System.out.println("n: " + nomproduct + " *= " + nom);
                        System.out.println("---");
                    }
                }
            }
        }

        denproduct /= gcd(nomproduct, denproduct);
        System.out.println(denproduct);


    // -----------------------------------------------------------------------------------------------------------------
        // Получение времени завершения приложения
        Date endDate = new Date();
        // Передаём время начала/конца на обработку и вывод
        TimeOfRunning.run(startDate,endDate);
    }

    private static int gcd(int a, int b)
    {
        int y, x;

        if (a > b) {
            x = a;
            y = b;
        } else {
            x = b;
            y = a;
        }

        while (x % y != 0) {
            int temp = x;
            x = y;
            y = temp % x;
        }

        return y;
    }
}
