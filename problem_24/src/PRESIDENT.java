import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PRESIDENT
{
    public static void main(String args[])
    {
        String variable = "";
        int max = 9;
        List<String> varList = new ArrayList<String>();
        for (int a = 0; a <= max; a++) // 0
        {
            for (int b = 0; b <= max; b++) // 1
            {
                for (int c = 0; c <= max; c++) // 2
                {
                    for (int d = 0; d <= max; d++) // 3
                    {
                        for (int e = 0; e <= max; e++) // 4
                        {
                            for (int f = 0; f <= max; f++) // 5
                            {
                                for (int g = 0; g <= max; g++) // 6
                                {
                                    for (int h = 0; h <= max; h++) // 7
                                    {
                                        for (int i = 0; i <= max; i++) // 8
                                        {
                                            for (int j = 0; j <= max; j++) // 9
                                            {
                                                if ((a != b) && (a != c) && (a != d) && (a != e) && (a != f) && (a != g) && (a != h) && (a != i) && (a != j))
                                                {
                                                    if ((b != c) && (b != d) && (b != e) && (b != f) && (b != g) && (b != h) && (b != i) && (b != j))
                                                    {
                                                        if ((c != d) && (c != e) && (c != f) && (c != g) && (c != h) && (c != i) && (c != j))
                                                        {
                                                            if ((d != e) && (d != f) && (d != g) && (d != h) && (d != i) && (d != j))
                                                            {
                                                                if ((e != f) && (e != g) && (e != h) && (e != i) && (e != j))
                                                                {
                                                                    if ((f != g) && (f != h) && (f != i) && (f != j))
                                                                    {
                                                                        if ((g != h) && (g != i) && (g != j))
                                                                        {
                                                                            if ((h != i) && (h != j))
                                                                            {
                                                                                if ((i != j))
                                                                                {
                                                                                    variable = "" + a + b + c + d + e + f + g + h + i + j;
                                                                                    varList.add(variable);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < varList.size(); i++)
        {
            if (i == 1000000 )
            {
                System.out.println((i+1) + ": " + varList.get(i));
            }

        }
    }
}
