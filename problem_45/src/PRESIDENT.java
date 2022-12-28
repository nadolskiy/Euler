import java.util.Date;

/**
 * Created by president on 3/26/14.
 */
public class PRESIDENT {
    public static void main(String args[]) {
        // Получене времени начала запуска приложения
        Date startDate = new Date();

        int limit = 1000000;

        for (long i = 286; i <= limit; i++) {
            for (long j = 1; j <= i; j++) {
                if (Triangle(i) == Pentagonal(j)) {
                    for (long k = 1; k <= j; k++) {
                        if (Pentagonal(j) == Hexagonal(k)) {
                            System.out.println("- - -");
                            System.out.println("Треуголное число: " + Triangle(i) + " = " + i + " * (" + i + " + 1)/2");
                            System.out.println("Пятиугольное число: " + Pentagonal(j) + " = " + j + " * (3 * " + j + " - 1)/2");
                            System.out.println("Шестиугольное число: " + Hexagonal(k) + " = " + k + " * (2 * " + k + " - 1)");
                            System.out.println("- - -");

                            System.out.println("Следующее за 40755 треугольное число, являющееся также пятиугольным и шестиугольным - " + Triangle(i));
                            k = j;
                            j = i;
                            i = limit;

                        } else if (Pentagonal(j) < Hexagonal(k)) { k = j; }
                    }
                } else if (Triangle(i) < Pentagonal(j)) { j = i; }
            }
        }

        // Получение времени завершения приложения
        Date endDate = new Date();
        // Передаём время начала/конца на обработку и вывод
        TimeOfRunning.run(startDate, endDate);
    }

    public static long Triangle(long number)
    {
        return (number * (number+1))/2;
    }

    public static long Pentagonal(long number)
    {
        return (number * ((3*number)-1))/2;
    }

    public static long Hexagonal(long number)
    {
        return (number * ((2*number)-1));
    }
}
