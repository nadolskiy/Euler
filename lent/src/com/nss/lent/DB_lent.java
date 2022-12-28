package com.nss.lent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by president on 3/3/14.
 */
public class DB_lent extends SQLiteOpenHelper
{

    private static final String DATABASE_NAME       = "lent_DB.db";                  // Имя базы данных
    private static final int    DATABASE_VERSION    = 1;                             // Версия текущей базы данных

    public static final String TABLE_NAME   = "lent_info_table";                     // Имя таблицы БД

    public static final String UID            = "_id";                               // Уникальный номер строки
    public static final String HOW_FEELING    = "how_feeling";                       // Самочувстивие
    public static final String WHAT_YOU_EAT   = "what_you_eat";                      // Питание
    public static final String WEIGHT_MORNING = "weight_morning";                    // Утренний вес
    public static final String WAIST          = "waist";                             // Объём талии
    public static final String HAUNCH         = "haunch";                            // Объём бёдер
    public static final String DATE           = "date";                              // Дата

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE "     + TABLE_NAME                                         // Создаём таблицу
            + " ("
            + UID               + " INTEGER PRIMARY KEY AUTOINCREMENT,"              // Уникальный столбец "ID"
            + HOW_FEELING       + " TEXT, "                                          // Столбец "Самочувствия"
            + WHAT_YOU_EAT      + " TEXT, "                                          // Столбец "Питания"
            + WEIGHT_MORNING    + " FLOAT, "                                         // Столбец "Вес"
            + WAIST             + " FLOAT, "                                         // Столбец "Обём талии"
            + HAUNCH            + " FLOAT, "                                         // Объём бёдер
            + DATE              + " TEXT"                                            // Текущая дата
            + ");";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + TABLE_NAME;

    public DB_lent(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        // Удаляем предыдущую таблицу при апгрейде
        db.execSQL(SQL_DELETE_ENTRIES);
        // Создаём новый экземпляр таблицы
        onCreate(db);
    }
}
