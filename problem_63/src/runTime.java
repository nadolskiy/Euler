import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by president on 3/27/14.
 */
public class runTime {
    public static void calculateTime(Date start, Date stop) {
        DateFormat formatter = new SimpleDateFormat("HH:mm:ss");

        String startTime = formatter.format(start);
        String stopTime  = formatter.format(stop);

        System.out.println("+ ----------------------------------- +");
        System.out.println("| Время начала: " + startTime + "\t\t\t  |");
        System.out.println("| Время конца:  " + stopTime  + "\t\t\t  |");

        long diff = stop.getTime() - start.getTime();
        long dSeconds = diff / 1000 % 60;
        long dMinutes = diff / (60 * 1000) % 60;
        long dHours = diff / (60 * 60 * 1000);

        String H = String.valueOf(dHours);
        String M = String.valueOf(dMinutes);
        String S = String.valueOf(dSeconds);

        if (dHours <= 9)   { H = "0" + H; }
        if (dMinutes <= 9) { M = "0" + M; }
        if (dSeconds <= 9) { S = "0" + S; }

        System.out.println("| Время выполнения: (Ч)" + H + ":(М)" + M + ":(С)" + S + " |");
        System.out.println("+ ----------------------------------- +");
    }
}
