package com.dk.listviewexample;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ClubDBOpenHelper extends SQLiteOpenHelper {


    public ClubDBOpenHelper(@Nullable Context context) {
        super(context, "club_db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String createStatement = "Create table club (name text, address text, clubType text)";

        sqLiteDatabase.execSQL(createStatement);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void insertClubDetail(String name, String address, String type){

        SQLiteDatabase db = getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put("name",name);
        cv.put("address",address);
        cv.put("type",type);

        db.insert("club",null,cv);
        db.close();


    }




}
