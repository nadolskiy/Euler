import java.util.Date;

/**
 * Created by president on 3/26/14.
 */
public class PRESIDENT {
    public static void main(String args[]) {
        // Получене времени начала запуска приложения
        Date startDate = new Date();

        int max = 5000;

        for (int i = 1; i <= max; i++) {
            for (int j = i+1; j <= max/2; j++) {
                long a = Pentagonal(j);
                long b = Pentagonal(i);
                long diff = a - b;

                if (isPentagonal(diff)) { long sum = a + b;
                    if (isPentagonal(sum)) {
                        System.out.println("Пара пятиугольных чисел, P"+ j +" и P" + i + ", для которых сумма и разность являются пятиугольными числами и значение " + diff + " = |" + Pentagonal(j) + " − " + Pentagonal(i) + "| минимально;");
                        j = max; i = max; }
                }
            }
        }

        // Получение времени завершения приложения
        Date endDate = new Date();
        // Передаём время начала/конца на обработку и вывод
        TimeOfRunning.run(startDate, endDate);
    }

    public static long Pentagonal(int number){ return (number * ((3*number)-1))/2; }

    public static boolean isPentagonal(long number){
        for (int i = 1; i < number; i++) {
            long value = Pentagonal(i);
            if (value == number) { return true; }
            else if (value > number) { return false; }
        }
        return true;
    }
}
