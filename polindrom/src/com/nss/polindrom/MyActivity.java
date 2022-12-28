package com.nss.polindrom;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    TextView result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Integer value = 0;
        int valueLength = 0;

        Integer maxPol = 0;


        String A;
        String B;
        String C;

        String D;
        String E;
        String F = null;

        result = (TextView) findViewById(R.id.tv_result);
        String r = "";

        for (int i = 999; i >= 100; i--)
        {

            for (int j = 999; j >= 100; j--)
            {
                value = i * j;
                Log.w("NADOLSKIY: ", i + " * " + j + " = " + value);
                r = value.toString();
                valueLength = r.length();

                String ch[] = r.split("");

                A = ch[1].toString();
                B = ch[2].toString();
                C = ch[3].toString();
                D = ch[4].toString();
                E = ch[5].toString();
                if (r.length() == 6)
                    F = ch[6].toString();

                switch (valueLength) {
                    case 5:
                        if (A.equals(E))
                        {
                            if (B.equals(D))
                            {
                                if (value > maxPol)
                                    maxPol = value;

                                Log.w("NADOLSKIY_5: ", i + " * " + j + " = " + value + " <-- 5-ти значный полиндром (" + value + ")");
                            }
                        }

                        break;
                    case 6:
                        if (A.equals(F))
                        {
                            if (B.equals(E))
                            {
                                if (C.equals(D))
                                {
                                    if (value > maxPol)
                                        maxPol = value;
                                    Log.w("NADOLSKIY_6: ", i + " * " + j + " = " + value + " <-- 6-ти значный полиндром (" + value + ")");

                                }
                            }
                        }
                        break;
                }



            }
        }
        result.setText(result.getText() + maxPol.toString());

    }
}
