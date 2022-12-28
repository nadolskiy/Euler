import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by president on 3/27/14.
 */
public class PRESIDENT {
    public static void main(String args[]){
        // Получене времени начала запуска приложения
        Date start = new Date();

        long max = 7654321l;

        for (long i = max; i >= 1; i--)
        {
            if (isPanNumber(i))
            {
                if (isSimpleNumber(i))
                {
                    System.out.println(i);
                    i = 1;
                }
            }
        }

        //System.out.println(maxValue + " - наибольшее пан-цифровое простое число;");
        // Получение времени завершения приложения
        Date stop = new Date();
        // Передаём время начала/конца на обработку и вывод
        runTime.calculateTime(start, stop);
    }

    // Проверка на ПАН числа
    private static boolean isPanNumber(long number) {
        String[] N = String.valueOf(number).split("");
        int length = N.length - 1;
        if ((N[length].equals("1") && !N[1].equals("1") && !N[2].equals("1") && !N[length-1].equals("1")) ||
                (N[length].equals("3") && !N[1].equals("3") && !N[2].equals("3") && !N[length-1].equals("3")) ||
                (N[length].equals("7") && !N[1].equals("7") && !N[2].equals("3") && !N[length-1].equals("3"))) {
            Arrays.sort(N);
            if (N[1].equals("1")) {
                for (int i = 1; i <= length; i++) {
                    for (int j = i + 1; j <= length; j++) {
                        if (N[i].equals(N[j]) || Integer.parseInt(N[i]) + 1 != Integer.parseInt(N[j])) return false;
                        else j = length;} }}
            else return false;
        } else return false;
        return true;
    }

    // Проверка чисел на простоту
    private static boolean isSimpleNumber(long number) {
        if (Math.sqrt(number) % 1 == 0 || number % 2  == 0 || number % 3  == 0  || number % 5  == 0 || number % 7 == 0
                                       || number % 11 == 0 || number % 13 == 0  || number % 17 == 0) return false;
        else { int max = (int)Math.ceil(Math.sqrt(number));
            for (int i = 18; i <= max; i++) { if (number % i == 0) return false; } }
        return true;
    }
}