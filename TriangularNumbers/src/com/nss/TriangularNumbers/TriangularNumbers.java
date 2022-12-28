package com.nss.TriangularNumbers;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class TriangularNumbers extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        result();
    }

    public void result()
    {

        long triangularNumber = 0;
        int length = 0;
        int max_length = 0;
        int max = 10000000;

        for (int a = 1; a <= max; a++)
        {
            triangularNumber +=a;

            if (triangularNumber >= 9223372036854775807l)
            {
                a = max;
            }

            for (int c = 1; c <= triangularNumber; c++)
            {
                if (triangularNumber % c == 0)
                {
                    length++;

                    if (length >= 501)
                    {
                        Log.w("PRESIDENT: "," ОТВЕТ: ******** " + a + ":  " + triangularNumber + " (имеет " + length + " делителей) ********");
                        a = max;
                    }
                }
            }

            if (length > max_length)
            {
                max_length = length;
                Log.w("PRESIDENT: ", a + ":  " + triangularNumber + " (имеет -= " + length + " =- делителей)");
            }

            length = 0;
        }
        Log.w("PRESIDENT: ","ХХХХХХХХХХХ !!! КОНЕЦ ДИАПАЗОНА ЧИСЕЛ !!! ХХХХХХХХХХХ");
    }
}