package com.nss.Simple_numbera;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    Button go;
    EditText value;
    TextView result;
    String toShow;

    //Integer val;
    long res;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        go = (Button) findViewById(R.id.buttonGo);
        value = (EditText) findViewById(R.id.et_value);
        result = (TextView) findViewById(R.id.tv_result);



        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String toInt = value.getText().toString();
                //val = Integer.parseInt(toInt);
                long nod = 1;



                for (Integer i = 2; nod < 600851475143l; i++)
                {
                    if (600851475143l % (long)i == 0)
                    {
                        nod *= (long) i;
                        res = (long) i;

                        toShow = "" +(long) i;
                        result.setText(toShow);
                    }
                }

            }
        });

    }
}
