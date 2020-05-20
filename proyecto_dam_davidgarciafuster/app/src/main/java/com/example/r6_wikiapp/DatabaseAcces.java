package com.example.r6_wikiapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

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



    public String [] getTodoPersonaje(String nombre) {

        c = db.rawQuery("select * from personajes where nombreClave='" + nombre + "'", new String[]{});


        String[] campos = new String[11];
        while (c.moveToNext()) {
            String nombreClave = c.getString(0);
            String nombre1 = c.getString(1);
            String nacionalidad = c.getString(2);
            String armaPrincipal = c.getString(3);
            String armaPrincipal2 = c.getString(4);
            String armaSecundaria = c.getString(5);
            String armaSecundaria2 = c.getString(6);
            String habilidad = c.getString(7);
            String dificultad = String.valueOf(c.getInt(8));
            String velocidad = String.valueOf(c.getInt(9));
            String blindaje = String.valueOf(c.getInt(10));
            campos[0]=nombreClave;
            campos[1]=nombre1;
            campos[2]=nacionalidad;
            campos[3]=armaPrincipal;
            campos[4]=armaPrincipal2;
            campos[5]=armaSecundaria;
            campos[6]=armaSecundaria2;
            campos[7]=habilidad;
            campos[8]=dificultad;
            campos[9]=velocidad;
            campos[10]=blindaje;
        }
        return campos;


    }
    public String [] getStatsarmarPrincipal(String nombre) {

        c = db.rawQuery("select personajes.armaPrincipal,armaPrincipal.dano,armaPrincipal.cadencia,armaPrincipal.movilidad,armaPrincipal.cargador from personajes inner join armaPrincipal on personajes.armaPrincipal=armaPrincipal.nombre where nombreClave='" + nombre + "'", new String[]{});


        String[] campos = new String[11];
        while (c.moveToNext()) {
            String nombreArma = c.getString(0);
            String dano = String.valueOf(c.getInt(1));
            String cadencia = String.valueOf(c.getInt(2));
            String movilidad = String.valueOf(c.getInt(3));
            String cargador = String.valueOf(c.getInt(4));

            campos[0]=nombreArma;
            campos[1]=dano;
            campos[2]=cadencia;
            campos[3]=movilidad;
            campos[4]=cargador;

        }
        return campos;


    }
    public String [] getStatsarmarPrincipal2(String nombre) {

        c = db.rawQuery("select personajes.armaPrincipal2,armaPrincipal.dano,armaPrincipal.cadencia,armaPrincipal.movilidad,armaPrincipal.cargador from personajes inner join armaPrincipal on personajes.armaPrincipal2=armaPrincipal.nombre where nombreClave='" + nombre + "'", new String[]{});


        String[] campos = new String[11];
        while (c.moveToNext()) {
            String nombreArma = c.getString(0);
            String dano = String.valueOf(c.getInt(1));
            String cadencia = String.valueOf(c.getInt(2));
            String movilidad = String.valueOf(c.getInt(3));
            String cargador = String.valueOf(c.getInt(4));

            campos[0]=nombreArma;
            campos[1]=dano;
            campos[2]=cadencia;
            campos[3]=movilidad;
            campos[4]=cargador;

        }
        return campos;


    }
    public String [] getStatsarmarSecundaria(String nombre) {

        c = db.rawQuery("select personajes.armaSecundaria,armaSecundaria.dano,armaSecundaria.cadencia,armaSecundaria.movilidad,armaSecundaria.cargador from personajes inner join armaSecundaria on personajes.armaSecundaria=armaSecundaria.nombre where nombreClave='" + nombre + "'", new String[]{});


        String[] campos = new String[11];
        while (c.moveToNext()) {
            String nombreArma = c.getString(0);
            String dano = String.valueOf(c.getInt(1));
            String cadencia = String.valueOf(c.getInt(2));
            String movilidad = String.valueOf(c.getInt(3));
            String cargador = String.valueOf(c.getInt(4));

            campos[0]=nombreArma;
            campos[1]=dano;
            campos[2]=cadencia;
            campos[3]=movilidad;
            campos[4]=cargador;

        }
        return campos;


    }
    public String [] getStatsarmarSecundaria2(String nombre) {

        c = db.rawQuery("select personajes.armaSecundaria2,armaSecundaria.dano,armaSecundaria.cadencia,armaSecundaria.movilidad,armaSecundaria.cargador from personajes inner join armaSecundaria on personajes.armaSecundaria2=armaSecundaria.nombre where nombreClave='" + nombre + "'", new String[]{});


        String[] campos = new String[11];
        while (c.moveToNext()) {
            String nombreArma = c.getString(0);
            String dano = String.valueOf(c.getInt(1));
            String cadencia = String.valueOf(c.getInt(2));
            String movilidad = String.valueOf(c.getInt(3));
            String cargador = String.valueOf(c.getInt(4));

            campos[0]=nombreArma;
            campos[1]=dano;
            campos[2]=cadencia;
            campos[3]=movilidad;
            campos[4]=cargador;

        }
        return campos;


    }


}
