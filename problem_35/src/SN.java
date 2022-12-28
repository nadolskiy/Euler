import java.util.ArrayList;
import java.util.List;

/**
 * Created by president on 3/24/14.
 */
public class SN
{
    public static List<Integer> simpleNumbers = new ArrayList<Integer>();
    public static int snSize;

    public static void sNumbers(int maxLimit)
    {
        int currentLimit;
        int divisor = 0;
        simpleNumbers.add(2);

        for (int a = 1; a <= maxLimit; a += 2){
            if (Math.sqrt(a) % 1 == 0 || a % 4 == 0 || a % 6 == 0 || a % 10 == 0){}
            else {
                currentLimit = (int) Math.ceil(Math.sqrt(a));
                for (int b = 2; b <= currentLimit; b++){
                    if (a % b == 0){
                        divisor++;   // Количество делителей у числа
                        if (divisor > 1){
                            b = currentLimit;}}}
                // Если число имеет только один делитель
                if (divisor == 0){
                    simpleNumbers.add(a);
                }divisor = 0;}}

        snSize = simpleNumbers.size();
    }

}
