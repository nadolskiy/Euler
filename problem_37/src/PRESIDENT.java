import java.util.Date;

/**
 * Created by president on 3/26/14.
 */
public class PRESIDENT {
    public static void main(String args[]) {
        // Получене времени начала запуска приложения
        Date startDate = new Date();

        int min = 8;
        int max = 1000000;
        int count = 0;
        long result = 0;

        for (int i = min; i <= max; i++) {
            if (isSimple(i)) {
                if (isAllSimpleToRight(i))
                {
                    if (isAllSimpleToLeft(i))
                    {
                        count++;

                        if (count <= 11)
                        {
                            result+= i;
                            System.out.println(count + ". " + i);
                        }
                        if (count > 11)
                        {
                            i = max;
                        }

                    }
                }
            }
        }

        System.out.println("Сумма единственных одиннадцати простых чисел, из которых можно выбрасывать цифры как справа налево, так и слева направо, и числа при этом остаются простыми равна " + result);

        // Получение времени завершения приложения
        Date endDate = new Date();
        // Передаём время начала/конца на обработку и вывод
        TimeOfRunning.run(startDate, endDate);
    }

    // Проверка на простоту
    public static boolean isSimple(int value) {
        if (value == 1) { return false; }
        else if (value == 2) { return true; }
        else if (Math.sqrt(value) % 1 == 0 || value % 4 == 0 || value % 6 == 0 || value % 10 == 0) { return false; }
        else {
            int maxElement = (int) Math.ceil(Math.sqrt(value));
            int divisor = 0;

            for (int a = 2; a <= maxElement; a++) {
                if (value % a == 0) {
                    divisor++;
                    a = maxElement; }
            }

            if (divisor == 0) { return true; }
            else
                return false;
        }
    }

    public static boolean isAllSimpleToRight(int number) {
        String[] value = String.valueOf(number).split("");
        String newValue = "";

        int length = value.length-1;

        for (int i = 1; i <= length-1; i++) { newValue = "";
            for (int j = i+1; j <= length; j++) { newValue += value[j].toString(); }

            int newNumber = Integer.parseInt(newValue);
            if (!isSimple(newNumber)) { return false; }
        }
        return true;
    }

    public static boolean isAllSimpleToLeft(int number) {
        String[] value = String.valueOf(number).split("");
        String newValue = "";

        int length = value.length-1;

        for (int i = 1; i <= length-1; i++) { newValue = "";
            for (int j = 1; j <= length-i; j++) { newValue += value[j].toString(); }

            int newNumber = Integer.parseInt(newValue);
            if (!isSimple(newNumber)) { return false; }
        }
        return true;
    }
}
