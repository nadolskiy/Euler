import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by president on 3/26/14.
 */
public class PRESIDENT {
    public static void main(String args[]) {
        // Получене времени начала запуска приложения
        Date startDate = new Date();

        int limit = 1000000;
        int result = 0;

        for (int i = 1; i <= limit; i++) { if (isPalindrome2(i) && isPalindrome16(i)){ result += i; } }

        System.out.println("Сумма всех чисел меньше " + limit + ", являющихся палиндромами по основаниям 10 и 2 равна " + result);

        // Получение времени завершения приложения
        Date endDate = new Date();
        // Передаём время начала/конца на обработку и вывод
        TimeOfRunning.run(startDate, endDate);
    }

    public static boolean isPalindrome2(int number) {
        String[] value = Integer.toBinaryString(number).split("");

        int length = value.length - 1;

        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();

        if (length % 2 == 0) {
            for (int i = 1; i <= length/2; i++) { a.add(Integer.parseInt(value[i])); }
            for (int i = length; i > length/2; i--) { b.add(Integer.parseInt(value[i])); }
        } else {
            for (int i = 1; i <= length/2; i++) { a.add(Integer.parseInt(value[i])); }
            for (int i = length; i > length/2+1; i--) { b.add(Integer.parseInt(value[i])); }
        }

        String A = "";
        String B = "";

        for (int i = 0; i < a.size(); i++){
            A += a.get(i);
            B += b.get(i);
        }

        if (A.equals(B)) { return true; }

        return false;
    }

    public static boolean isPalindrome16(long number) {
        if (number < 10) { return true; }
        else {
            String[] value = String.valueOf(number).split("");
            int length = value.length - 1;

            List<Integer> a = new ArrayList<Integer>();
            List<Integer> b = new ArrayList<Integer>();

            if (length % 2 == 0) {
                for (int i = 1; i <= length/2; i++) { a.add(Integer.parseInt(value[i])); }
                for (int i = length; i > length/2; i--) { b.add(Integer.parseInt(value[i])); }
            } else {
                for (int i = 1; i <= length/2; i++) { a.add(Integer.parseInt(value[i])); }
                for (int i = length; i > length/2+1; i--) { b.add(Integer.parseInt(value[i])); }
            }

            String A = "";
            String B = "";

            for (int i = 0; i < a.size(); i++) {
                A += a.get(i);
                B += b.get(i);
            }

            if (A.equals(B)) { return true; }

            return false;
        }
    }
}
