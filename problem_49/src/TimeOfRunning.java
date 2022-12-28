import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Расчёт времени выполнения приложения
 */
public class TimeOfRunning
{
    public static DateFormat formatter = new SimpleDateFormat("HH:mm:ss");

    public static void run(Date startDate, Date endDate)
    {
        String start =  formatter.format(startDate);
        String end =  formatter.format(endDate);

        System.out.println("+ ----------------------------------- +");
        System.out.println("| Время начала: " + start + "\t\t\t  |");
        System.out.println("| Время конца:  " + end + "\t\t\t  |");

        String[] sTime = start.split(":");
        String[] eTime = end.split(":");

        int h = Integer.parseInt(eTime[0]) - Integer.parseInt(sTime[0]);
        int m = Integer.parseInt(eTime[1]) - Integer.parseInt(sTime[1]);
        int s;
        if (Integer.parseInt(eTime[2]) > Integer.parseInt(sTime[2]))
        {
            s = Integer.parseInt(eTime[2]) - Integer.parseInt(sTime[2]);
        }
        else
        {
            s = Integer.parseInt(sTime[2]) - Integer.parseInt(eTime[2]);
        }


        String H = String.valueOf(h);
        String M = String.valueOf(m);
        String S = String.valueOf(s);

        if (h <= 9)
        {
            H = "0" + H;
        }
        if (m <= 9)
        {
            M = "0" + M;
        }
        if (s <= 9)
        {
            S = "0" + S;
        }

        System.out.println("| Время выполнения: (Ч)" + H + ":(М)" + M + ":(С)" + S + " |");
        System.out.println("+ ----------------------------------- +");
    }
}