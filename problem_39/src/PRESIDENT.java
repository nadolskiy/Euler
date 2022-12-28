import java.util.Date;

/**
 * Created by president on 3/28/14.
 */
public class PRESIDENT {
    public static void main(String args[])
    {
        // Получене времени начала запуска приложения
        Date start = new Date();

        int maxPerimeter = 0;
        int maxTriangles = 0;
        for (int p = 1; p < 1000; p++) {
            int triangles = countSolutions(p);
            if (triangles > maxTriangles){
                maxTriangles = triangles;
                maxPerimeter = p;
            }
        }

        System.out.println("P = " + maxPerimeter + "  (" + maxTriangles + ")");

        // Получение времени завершения приложения
        Date stop = new Date();
        // Передаём время начала/конца на обработку и вывод
        runTime.calculateTime(start, stop);
    }

    private static int countSolutions(int p) {
        int count = 0;
        for (int a = 1; a <= p; a++) {
            for (int b = a; b <= p; b++) {
                int c = p - a - b;
                if (b <= c && a * a + b * b == c * c)
                    count++;
            }
        }
        return count;
    }
}
