import java.util.Arrays;
import java.util.Date;

/**
 Created by president on 3/27/14.

 Возьмем число 192 и умножим его по очереди на 1, 2 и 3:

 192 X 1 = 192
 192 X 2 = 384
 192 X 3 = 576

 Объединяя все три произведения, получим девятизначное число 192384576 из цифр от 1 до 9 (пан-цифровое число). Будем
 называть число 192384576 объединенным произведением 192 и (1,2,3)

 Таким же образом можно начать с числа 9 и по очереди умножать его на 1, 2, 3, 4 и 5, что в итоге дает пан-цифровое
 число 918273645, являющееся объединенным произведением 9 и (1,2,3,4,5).

 Какое самое большое девятизначное пан-цифровое число можно образовать как объединенное произведение целого числа
 и (1,2, ... , n), где n > 1?

 */

public class PRESIDENT {
    public static void main(String args[]) {
        // Получене времени начала запуска приложения
        Date start = new Date();

        int min = 9;
        int max = 9876;

        for (int i = max; i >= min; i--)
        {
            if (isUnique(i))
            {
                String newPanNumber = "";
                for (int j = 1; j < max; j++)
                {
                    int value = i * j;
                    if (isUnique(value))
                    {
                        newPanNumber += String.valueOf(value);
                        value = Integer.parseInt(newPanNumber);
                        if (newPanNumber.length() >= 9 || value > 987654321)
                        {
                            j = max;
                        }
                    } else j = max;

                }
                int P = Integer.parseInt(newPanNumber);
                if (isPanNumber(P))
                {
                    System.out.println("Самое большое девятизначное пан-цифровое число, которое можно образовать как объединенное произведение целого числа" +
                            " и (1,2, ... , n), где n > 1 - " + P);
                    i = min;
                }
            }
        }


        // Получение времени завершения приложения
        Date stop = new Date();
        // Передаём время начала/конца на обработку и вывод
        runTime.calculateTime(start, stop);
    }

    // Проверка на "ПАН" число;
    public static boolean isPanNumber(long number) {
        String sortNumber = "";
        String[] arrNumber = String.valueOf(number).split("");
        Arrays.sort(arrNumber);
        for (int i = 1; i <= 9; i++) { sortNumber += arrNumber[i].toString(); }
        if (sortNumber.equals("123456789")) { return true; }
        else return false;
    }

    // Проверка на уникальность числа:
    public static boolean isUnique(int number) {
        String[] arrNumber = String.valueOf(number).split("");
        for (int i = 1; i < arrNumber.length; i++) {
            for (int j = i+1; j < arrNumber.length; j++) {
                if (arrNumber[i] == arrNumber[j])
                    return false;
            }
        }
        return true;
    }
}

