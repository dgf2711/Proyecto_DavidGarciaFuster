package com.example.r6_wikiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Mapas extends AppCompatActivity {

    private ImageView bank;
    private ImageView border;
    private String mapa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapas);


       bank = (ImageView) findViewById(R.id.bank_icon);
       border = (ImageView) findViewById(R.id.border_icon);


        bank.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentAttackers = new Intent(Mapas.this, MapasVisualizar.class);
                startActivity(intentAttackers);
                mapa="bank";
                guardarMapa();


            }
        });
        border.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentAttackers = new Intent(Mapas.this, MapasVisualizar.class);
                startActivity(intentAttackers);
                mapa="border";
                guardarMapa();


            }
        });


    }

    private void guardarMapa() {

        Intent intentGuardar = new Intent(Mapas.this, MapasVisualizar.class);
        intentGuardar.putExtra("Key",mapa);
        startActivity(intentGuardar);

    }


}
