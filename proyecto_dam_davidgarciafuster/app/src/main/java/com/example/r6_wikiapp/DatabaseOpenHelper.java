package com.example.r6_wikiapp;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseOpenHelper  extends SQLiteAssetHelper {
    private static final String DATABASE_NAME="r6wikiapp.db";
    private static final  int DATABASE_VERSION=1;

    public DatabaseOpenHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

}
