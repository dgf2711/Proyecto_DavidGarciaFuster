package com.example.r6_wikiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

public class Filtrar extends AppCompatActivity {
   private EditText pruebadb;
   private Button botonPrueba;
   private TextView pruebadb2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtrar);
        pruebadb = (EditText) findViewById(R.id.pruebadb);
        pruebadb2 = (TextView) findViewById(R.id.pruebadb2);
        botonPrueba = (Button) findViewById(R.id.botonPrueba);
        botonPrueba.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                DatabaseAcces databaseAcces=DatabaseAcces.getInstance(getApplicationContext());
                databaseAcces.open();

                String n = pruebadb.getText().toString();
                String nombre = databaseAcces.getNombre(n);
                pruebadb2.setText(nombre);
                databaseAcces.close();
            }

        });

    }


}
