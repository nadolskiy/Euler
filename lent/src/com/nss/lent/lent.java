package com.nss.lent;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class lent extends Activity
{
    // Базы данных
    DB_lent         sqh;
    SQLiteDatabase  sqdb;

    // Кнопки
    Button saveInformation;                                                     // Кнопка сохранения введённых данных

    // Поля ввода данных
    EditText etWhatYouFeelToday;                                                // Поле ввода состояния (самочувствия)
    EditText etWhatYouEatToday;                                                 // Поле ввода продуктов питания
    EditText etWeight;                                                          // Поле ввода веса
    EditText etWaist;                                                           // Поле ввода объёма талии
    EditText etHaunch;                                                          // Поле ввода объёма бёдер

    ProgressBar progress;                                                       // Прогресс

    // Поля вывода информации
    TextView tvDayLeft;                                                         // Количество дней до окончания поста
    TextView tvCurrentDay;                                                      // Текущий номер дня поста
    TextView tvEat;                                                             // Что можно кушать. а что нельзя
    TextView tvWeightGoneToday;                                                 // Сбросил сегодня (вес)
    TextView tvWeightGoneAll;                                                   // Сбросил за всё время (вес)
    TextView tvWaistToday;                                                      // Объём талии уменьшился за день
    TextView tvWaistAll;                                                        // Обём талии уменьшился за все время
    TextView tvHaunchToday;                                                     // Объём бедер уменьшился за день
    TextView tvHaunchAll;                                                       // Объём бедер уменьшился за все время

    String currentDay;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        saveInformation     = (Button) findViewById(R.id.btn_saveToDB);

        etWhatYouFeelToday  = (EditText) findViewById(R.id.et_feling);
        etWhatYouEatToday   = (EditText) findViewById(R.id.et_eat);
        etWeight            = (EditText) findViewById(R.id.et_weight);
        etWaist             = (EditText) findViewById(R.id.et_waist);
        etHaunch            = (EditText) findViewById(R.id.et_haungth);

        progress            = (ProgressBar) findViewById(R.id.progress);

        tvDayLeft           = (TextView) findViewById(R.id.tv_day_left);
        tvCurrentDay        = (TextView) findViewById(R.id.tv_day_number);
        tvEat               = (TextView) findViewById(R.id.tv_eat);
        tvWeightGoneToday   = (TextView) findViewById(R.id.tv_weight_gone_today);
        tvWeightGoneAll     = (TextView) findViewById(R.id.tv_weight_gone_all);
        tvWaistToday        = (TextView) findViewById(R.id.tv_waist_today);
        tvWaistAll          = (TextView) findViewById(R.id.tv_waist_all);
        tvHaunchToday       = (TextView) findViewById(R.id.tv_haunch_today);
        tvHaunchAll         = (TextView) findViewById(R.id.tv_haunch_all);

        String month = null;

        switch (Calendar.getInstance().get(Calendar.MONTH))
        {
            case 2:
                month = "марта";
                switch (Calendar.getInstance().get(Calendar.DAY_OF_MONTH))
                {
                    case 3:
                        progress.setProgress(0);
                        tvDayLeft.setText("Осталось 47 дней");
                        tvCurrentDay.setText("ДЕНЬ №1");
                        break;
                    case 4:
                        progress.setProgress(2);
                        tvDayLeft.setText("Осталось 46 дней");
                        tvCurrentDay.setText("ДЕНЬ №2");
                        break;
                    case 5:
                        progress.setProgress(4);
                        tvDayLeft.setText("Осталось 45 дней");
                        tvCurrentDay.setText("ДЕНЬ №3");
                        break;
                    case 6:
                        progress.setProgress(6);
                        tvDayLeft.setText("Осталось 44 дня");
                        tvCurrentDay.setText("ДЕНЬ №4");
                        break;
                    case 7:
                        progress.setProgress(8);
                        tvDayLeft.setText("Осталось 43 дня");
                        tvCurrentDay.setText("ДЕНЬ №5");
                        break;
                    case 8:
                        progress.setProgress(10);
                        tvDayLeft.setText("Осталось 42 дня");
                        tvCurrentDay.setText("ДЕНЬ №6");
                        break;
                    case 9:
                        progress.setProgress(12);
                        tvDayLeft.setText("Осталось 41 день");
                        tvCurrentDay.setText("ДЕНЬ №7");
                        break;
                    case 10:
                        progress.setProgress(14);
                        tvDayLeft.setText("Осталось 39 дней");
                        tvCurrentDay.setText("ДЕНЬ №8");
                        break;
                    case 11:
                        progress.setProgress(16);
                        tvDayLeft.setText("Осталось 38 дней");
                        tvCurrentDay.setText("ДЕНЬ №9");
                        break;
                    case 12:
                        progress.setProgress(18);
                        tvDayLeft.setText("Осталось 37 дней");
                        tvCurrentDay.setText("ДЕНЬ №10");
                        break;
                    case 13:
                        progress.setProgress(20);
                        tvDayLeft.setText("Осталось 36 дней");
                        tvCurrentDay.setText("ДЕНЬ №11");
                        break;
                    case 14:
                        progress.setProgress(22);
                        tvDayLeft.setText("Осталось 35 дней");
                        tvCurrentDay.setText("ДЕНЬ №12");
                        break;
                    case 15:
                        progress.setProgress(24);
                        tvDayLeft.setText("Осталось 34 дня");
                        tvCurrentDay.setText("ДЕНЬ №13");
                        break;
                    case 16:
                        progress.setProgress(26);
                        tvDayLeft.setText("Осталось 33 дня");
                        tvCurrentDay.setText("ДЕНЬ №14");
                        break;
                    case 17:
                        progress.setProgress(28);
                        tvDayLeft.setText("Осталось 32 дня");
                        tvCurrentDay.setText("ДЕНЬ №15");
                        break;
                    case 18:
                        progress.setProgress(30);
                        tvDayLeft.setText("Осталось 31 день");
                        tvCurrentDay.setText("ДЕНЬ №16");
                        break;
                    case 19:
                        progress.setProgress(32);
                        tvDayLeft.setText("Осталось 30 дней");
                        tvCurrentDay.setText("ДЕНЬ №17");
                        break;
                    case 20:
                        progress.setProgress(34);
                        tvDayLeft.setText("Осталось 29 дней");
                        tvCurrentDay.setText("ДЕНЬ №18");
                        break;
                    case 21:
                        progress.setProgress(36);
                        tvDayLeft.setText("Осталось 28 дней");
                        tvCurrentDay.setText("ДЕНЬ №19");
                        break;
                    case 22:
                        progress.setProgress(38);
                        tvDayLeft.setText("Осталось 27 дней");
                        tvCurrentDay.setText("ДЕНЬ №20");
                        break;
                    case 23:
                        progress.setProgress(40);
                        tvDayLeft.setText("Осталось 26 дней");
                        tvCurrentDay.setText("ДЕНЬ №21");
                        break;
                    case 24:
                        progress.setProgress(42);
                        tvDayLeft.setText("Осталось 25 дней");
                        tvCurrentDay.setText("ДЕНЬ №22");
                        break;
                    case 25:
                        progress.setProgress(44);
                        tvDayLeft.setText("Осталось 24 дня");
                        tvCurrentDay.setText("ДЕНЬ №23");
                        break;
                    case 26:
                        progress.setProgress(46);
                        tvDayLeft.setText("Осталось 23 дня");
                        tvCurrentDay.setText("ДЕНЬ №24");
                        break;
                    case 27:
                        progress.setProgress(48);
                        tvDayLeft.setText("Осталось 22 дня");
                        tvCurrentDay.setText("ДЕНЬ №25");
                        break;
                    case 28:
                        progress.setProgress(50);
                        tvDayLeft.setText("Осталось 21 дня");
                        tvCurrentDay.setText("ДЕНЬ №26");
                        break;
                    case 29:
                        progress.setProgress(52);
                        tvDayLeft.setText("Осталось 20 дней");
                        tvCurrentDay.setText("ДЕНЬ №27");
                        break;
                    case 30:
                        progress.setProgress(54);
                        tvDayLeft.setText("Осталось 19 дней");
                        tvCurrentDay.setText("ДЕНЬ №28");
                        break;
                    case 31:
                        progress.setProgress(56);
                        tvDayLeft.setText("Осталось 18 дней");
                        tvCurrentDay.setText("ДЕНЬ №29");
                        break;

                }
                break;
            case 3:
                month = "апреля";
                switch (Calendar.getInstance().get(Calendar.DAY_OF_MONTH))
                {
                    case 1:
                        progress.setProgress(58);
                        tvDayLeft.setText("Осталось 17 дней");
                        tvCurrentDay.setText("ДЕНЬ №30");
                        break;
                    case 2:
                        progress.setProgress(60);
                        tvDayLeft.setText("Осталось 16 дней");
                        tvCurrentDay.setText("ДЕНЬ №31");
                        break;
                    case 3:
                        progress.setProgress(62);
                        tvDayLeft.setText("Осталось 15 дней");
                        tvCurrentDay.setText("ДЕНЬ №32");
                        break;
                    case 4:
                        progress.setProgress(64);
                        tvDayLeft.setText("Осталось 14 дней");
                        tvCurrentDay.setText("ДЕНЬ №33");
                        break;
                    case 5:
                        progress.setProgress(66);
                        tvDayLeft.setText("Осталось 13 дней");
                        tvCurrentDay.setText("ДЕНЬ №34");
                        break;
                    case 6:
                        progress.setProgress(68);
                        tvDayLeft.setText("Осталось 12 дней");
                        tvCurrentDay.setText("ДЕНЬ №35");
                        break;
                    case 7:
                        progress.setProgress(70);
                        tvDayLeft.setText("Осталось 11 дней");
                        tvCurrentDay.setText("ДЕНЬ №36");
                        break;
                    case 8:
                        progress.setProgress(72);
                        tvDayLeft.setText("Осталось 10 дней");
                        tvCurrentDay.setText("ДЕНЬ №37");
                        break;
                    case 9:
                        progress.setProgress(74);
                        tvDayLeft.setText("Осталось 9 дней");
                        tvCurrentDay.setText("ДЕНЬ №38");
                        break;
                    case 10:
                        progress.setProgress(76);
                        tvDayLeft.setText("Осталось 8 дней");
                        tvCurrentDay.setText("ДЕНЬ №39");
                        break;
                    case 11:
                        progress.setProgress(78);
                        tvDayLeft.setText("Осталось 7 дней");
                        tvCurrentDay.setText("ДЕНЬ №40");
                        break;
                    case 12:
                        progress.setProgress(80);
                        tvDayLeft.setText("Осталось 6 дней");
                        tvCurrentDay.setText("ДЕНЬ №41");
                        break;
                    case 13:
                        progress.setProgress(82);
                        tvDayLeft.setText("Осталось 5 дней");
                        tvCurrentDay.setText("ДЕНЬ №42");
                        break;
                    case 14:
                        progress.setProgress(84);
                        tvDayLeft.setText("Осталось 4 дня");
                        tvCurrentDay.setText("ДЕНЬ №43");
                        break;
                    case 15:
                        progress.setProgress(86);
                        tvDayLeft.setText("Осталось 3 дня");
                        tvCurrentDay.setText("ДЕНЬ №44");
                        break;
                    case 16:
                        progress.setProgress(88);
                        tvDayLeft.setText("Осталось 2 дня");
                        tvCurrentDay.setText("ДЕНЬ №45");
                        break;
                    case 17:
                        progress.setProgress(90);
                        tvDayLeft.setText("Остался 1 день");
                        tvCurrentDay.setText("ДЕНЬ №46");
                        break;
                    case 18:
                        progress.setProgress(95);
                        tvDayLeft.setText("Осталось 0 дней");
                        tvCurrentDay.setText("ДЕНЬ №47");
                        break;
                    case 19:
                        progress.setProgress(100);
                        tvDayLeft.setText("ПОСТ ОКОНЧИЛСЯ =)");
                        tvCurrentDay.setText("ДЕНЬ №48");
                        break;

                }
                break;
        }

        currentDay = String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_MONTH))
                + "-е "
                + month.toString()
                + " "
                + String.valueOf(Calendar.getInstance().get(Calendar.YEAR)) ;

        Log.w("PRESIDENT", "Сегодня: " + currentDay);

        // Инициализируем наш класс-обёртку
        sqh  = new DB_lent(this);

        // База нам нужна для записи и чтения
        sqdb = sqh.getWritableDatabase();

        // При нажатии кнопки сохранить
        saveInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ContentValues cv = new ContentValues();

                cv.put(DB_lent.HOW_FEELING,    etWhatYouFeelToday.getText().toString());             // Самочувствие
                cv.put(DB_lent.WHAT_YOU_EAT,   etWhatYouEatToday.getText().toString());              // Что кушал
                cv.put(DB_lent.WEIGHT_MORNING, etWeight.getText().toString());                       // Вес
                cv.put(DB_lent.WAIST,          etWaist.getText().toString());                        // Талия
                cv.put(DB_lent.HAUNCH,         etHaunch.getText().toString());                       // Бёдра
                cv.put(DB_lent.DATE,           currentDay.toString());                               // Текущая дата






            }
        });










//        one.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Метод 1: INSERT через класс CONTENTVALUE
//                ContentValues cv = new ContentValues();
//                cv.put(DB_lent.CATNAME, txtData.getText().toString());
//                // вызываем метод вставки
//                sqdb.insert(DB_lent.TABLE_NAME, DB_lent.CATNAME, cv);
//                txtData.setText("");
//            }
//        });
//
//
//        four.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Метод 2: Сырой SQL-запрос
//                String query = "SELECT " + DB_lent.UID + ", "
//                        + DB_lent.CATNAME + " FROM " + DB_lent.TABLE_NAME;
//                Cursor cursor2 = sqdb.rawQuery(query, null);
//                while (cursor2.moveToNext()) {
//                    int id = cursor2.getInt(cursor2
//                            .getColumnIndex(DB_lent.UID));
//                    String name = cursor2.getString(cursor2
//                            .getColumnIndex(DB_lent.CATNAME));
//                    Log.i("LOG_TAG", "ROW " + id + " HAS NAME " + name);
//                }
//                cursor2.close();
//            }
//        });

}
    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        // закрываем соединения с базой данных
        sqdb.close();
        sqh.close();
    }


}

