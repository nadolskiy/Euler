import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by president on 3/17/14.
 */
public class PRESIDENT
{
    public static void main(String args[]) {
        List<Integer> simpleNumbers = new ArrayList<Integer>();
        int limit = 10000;
        int count;
        int result;
        int maxValue = 0;
        int maxCount = 0;


        for (int i = 2; i <= limit; i++) {
            count = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 1) {
                simpleNumbers.add(i);
            }
        }

        for (int i = 1; i < simpleNumbers.size(); i++) {
            result = 0;
            count = 0;
            for (int j = i - 1; j >= 0; j--) {
                result += simpleNumbers.get(j);
                count++;

                if (result == simpleNumbers.get(i)) {
                    if (count > maxCount) {
                        maxCount = count;
                        maxValue = simpleNumbers.get(i);
                        System.out.println(maxValue + " (" + maxCount + ")");

                    }
                    count = 0;
                    j = 0;
                }

                if (result > simpleNumbers.get(i)) {
                    result = 0;
                    count = 0;
                    j++;
                }
            }
        }
    }

}
