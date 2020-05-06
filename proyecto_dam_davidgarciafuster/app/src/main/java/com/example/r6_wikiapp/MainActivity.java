package com.example.r6_wikiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button personajes;
    private Button foro;
    private Button mapas;
    private Button noticias;
    private Button filtrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personajes = (Button) findViewById(R.id.personajes_button);
        foro = (Button) findViewById(R.id.foro_button);
        mapas= (Button) findViewById(R.id.mapas_button);
        noticias= (Button) findViewById(R.id.noticias_button);
        filtrar= (Button) findViewById(R.id.filtrar_button);

        personajes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intentPersonajes = new Intent(MainActivity.this, Personajes.class);
                startActivity(intentPersonajes);

            }

        });
        foro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intentPersonajes = new Intent(MainActivity.this, Foro.class);
                startActivity(intentPersonajes);

            }

        });

        mapas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intentMapas = new Intent(MainActivity.this, Mapas.class);
                startActivity(intentMapas);

            }

        });
        noticias.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intentNoticias = new Intent(MainActivity.this,Noticias.class);
                startActivity(intentNoticias);

            }

        });

        filtrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intentFiltrar = new Intent(MainActivity.this,Filtrar.class);
                startActivity(intentFiltrar);

            }

        });

    }
}
