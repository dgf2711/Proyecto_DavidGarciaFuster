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

   private Button buttonOperadores;
   private Button buttonArmaPrincipal;
   private Button buttonArmaSecundaria;
   private String opcion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtrar);
        buttonOperadores = (Button) findViewById(R.id.buttonOperadores);
        buttonArmaPrincipal= (Button) findViewById(R.id.buttonArmaPrincipal);
        buttonArmaSecundaria= (Button) findViewById(R.id.buttonArmaSecundaria);

        buttonOperadores.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                opcion="personaje";
                guardar();

            }

        });
        buttonArmaPrincipal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                opcion="arma1";
                guardar();

            }

        });
        buttonArmaSecundaria.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                opcion="arma2";
                guardar();


            }

        });




    }
    private void guardar(){


        Intent intentFiltrar = new Intent(Filtrar.this, FiltrarVisualizar.class);
        intentFiltrar.putExtra("Key",opcion);
        startActivity(intentFiltrar);

    }


}
