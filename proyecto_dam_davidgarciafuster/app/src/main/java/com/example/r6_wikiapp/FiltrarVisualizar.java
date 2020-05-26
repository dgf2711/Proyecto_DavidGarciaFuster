package com.example.r6_wikiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class FiltrarVisualizar extends AppCompatActivity {
    private TextView visualizarText;
    private String opcion;
    private SQLiteDatabase db;
    private static  DatabaseAcces instance;
  private String almacenador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtrar_visualizar);
        visualizarText= (TextView) findViewById(R.id.visualizarText);

        DatabaseAcces databaseAcces = DatabaseAcces.getInstance(getApplicationContext());
        databaseAcces.open();
        Bundle bundle = getIntent().getExtras();
        opcion = bundle.getString("Key");

            if(opcion.equals("personaje")){
                almacenador=databaseAcces.getNombres();
                visualizarText.setText(almacenador);
            }
             if(opcion.equals("arma1")){
            almacenador=databaseAcces.getArmas1();
            visualizarText.setText(almacenador);
            }
            if(opcion.equals("arma2")){
            almacenador=databaseAcces.getArmas2();
            visualizarText.setText(almacenador);
            }




    }
}
