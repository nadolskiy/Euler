package com.nss.PifagorThree;

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

        int ab;
        double abc;
        double c;

        for (int a = 3; a <= 1000; a++)
        {
            for (int b = 4; b <= 1000; b++)
            {
                ab = (a*a)+(b*b);
                c = Math.sqrt(ab);
                if ((a < b) && (b < c))
                {
                    abc = a+b+c;
                    if (abc == 1000)
                        Log.w("NADOLSKIY",a + "^2 + " + b + "^2 = " + (a*a) + " + " + (b*b) + " = " + ab + " = " + c);
                }
            }
        }
    }
}
