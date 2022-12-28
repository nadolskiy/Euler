package com.nss.Multiples_of_3_and_5;

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

        final EditText pervoeKratnoe = (EditText) findViewById(R.id.et_pervoe_kratnoe);
        final EditText vtoroeKratnoe = (EditText) findViewById(R.id.vtoroe_cratnoe);
        final EditText promejutok = (EditText) findViewById(R.id.et_promejutok);
        final Button raschet = (Button) findViewById(R.id.b_raschitat);
        final TextView rezultat = (TextView) findViewById(R.id.tv_rezultat);

        raschet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer a = Integer.parseInt(pervoeKratnoe.getText().toString());
                Integer b = Integer.parseInt(vtoroeKratnoe.getText().toString());
                Integer prom = Integer.parseInt(promejutok.getText().toString());


                Integer c = 0;


                for (int i = 0; i < prom; i++)
                {

                    if (i % a == 0)
                    {
                        c += i;
                    }
                    if (i % b == 0)
                    {
                        if (i % a != 0)
                        {
                            c+=i;
                        }
                    }
                }


               // c = A + B;

                final Integer aaa = a;
                final Integer bbb = b;
                final Integer ccc = c;
                final Integer res = prom;


                rezultat.setText("Cумма всех чисел меньше " + res + ", кратных " + aaa + " или " + bbb + " cсоставляет: " + ccc);
            }
        });

    }
}
