package com.nss.simple_number_2milliion;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        int n = 0; // Счётчик простых чисел
        int kolDelit = 0; // Количество делителей
        long sum = 0;

        for (int a = 2; a < 2000000; a++)
        {
            for (int b = 2; b <= a; b++)
            {
                if (a % b == 0)
                {
                    kolDelit +=1;   // Количество делителей у числа
                }
            }
            // Если число имеет только один делитель
            if (kolDelit == 1)
            {
                n++;    // Увеличиваем счётчик на 1
                sum += (long) a;
                Log.w("NADOLSKIY",n + ". Число '" + a + "' - является простым числом;");
            }
            kolDelit = 0;
        }
        Log.w("NADOLSKIY","--------------------------------------------------------");
        Log.w("NADOLSKIY","Сумма всех простых чисел меньше 2 000 000 составляет: " + sum);
    }
}