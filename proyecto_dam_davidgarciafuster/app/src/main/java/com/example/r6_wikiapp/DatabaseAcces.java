package com.example.r6_wikiapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseAcces {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase db;
    private static  DatabaseAcces instance;
    Cursor c=null;
    private DatabaseAcces(Context context){
        this.openHelper= new DatabaseOpenHelper(context);
    }

    static DatabaseAcces getInstance(Context context){
        if(instance==null){
            instance=new DatabaseAcces(context);
        }
        return instance;
    }
    public void open(){
        this.db=openHelper.getWritableDatabase();
    }
    public void close(){
        if(db!=null){
            this.db.close();
        }
    }

    public String getNombre(String nombre) {
        c = db.rawQuery("select nombre from personajes where nombreClave='"+nombre+"'", new String[]{});

        StringBuffer buffer = new StringBuffer();
        while (c.moveToNext()) {
            String nombre1 = c.getString(0);
            buffer.append("" + nombre1);


        }
        return buffer.toString();
    }
}
