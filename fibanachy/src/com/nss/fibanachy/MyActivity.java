package com.nss.fibanachy;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final EditText end = (EditText)findViewById(R.id.editText);
        final TextView tv_res = (TextView)findViewById(R.id.textView2);
        final Button find = (Button) findViewById(R.id.button);



        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Integer finis = Integer.parseInt(end.getText().toString());

                int sum_fib = 0;
                int a = 1;
                int b = 1;

                int result = 0;

                while (sum_fib < finis)
                {
                    sum_fib= a + b;
                    a = b;
                    b = sum_fib;

                    if (sum_fib % 2 == 0)
                    {
                        result += sum_fib;
                    }
                }

//                for (int i = sum_fib; i < finis; i+=sum_fib)
//                {
//                    sum_fib= a + b;
//                    a = b;
//                    b = sum_fib;
//
//                    if (sum_fib % 2 == 0)
//                    {
//                        result += sum_fib;
//                    }
//
//                }

                tv_res.setText("Сумма всех чётных элементов ряда Фибоначчи, которые не превышают " + finis + ", составляет: " + result);

            }
        });

    }
}
