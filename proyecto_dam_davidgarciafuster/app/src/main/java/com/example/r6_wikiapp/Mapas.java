package com.example.r6_wikiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Mapas extends AppCompatActivity {

    private ImageView bank;
    private ImageView border;
    private ImageView chalet;
    private ImageView clubhouse;
    private ImageView coastline;
    private ImageView consulate;
    private ImageView favela;
    private ImageView fortress;
    private ImageView hereford;
    private ImageView house;
    private ImageView kafe;
    private ImageView kanal;
    private ImageView oregon;
    private ImageView outback;
    private ImageView plane;
    private ImageView skyscraper;
    private ImageView themepark;
    private ImageView tower;
    private ImageView villa;
    private ImageView yatch;


    private String mapa;
    private SharedPreferences.Editor editor;
    private SharedPreferences preferencias;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapas);


       bank = (ImageView) findViewById(R.id.bank_icon);
       border = (ImageView) findViewById(R.id.border_icon);
       chalet = (ImageView) findViewById(R.id.chalet_icon);
       clubhouse = (ImageView) findViewById(R.id.clubhouse_icon);
       coastline = (ImageView) findViewById(R.id.coastline_icon);
       consulate = (ImageView) findViewById(R.id.consulate_icon);
       favela = (ImageView) findViewById(R.id.favela_icon);
       fortress = (ImageView) findViewById(R.id.fortress_icon);
       hereford= (ImageView) findViewById(R.id.hereford_icon);
       house = (ImageView) findViewById(R.id.house_icon);
       kafe = (ImageView) findViewById(R.id.kafe_icon);
       kanal = (ImageView) findViewById(R.id.kanal_icon);
       oregon = (ImageView) findViewById(R.id.oregon_icon);
       outback = (ImageView) findViewById(R.id.outback_icon);
       plane = (ImageView) findViewById(R.id.plane_icon);
       skyscraper = (ImageView) findViewById(R.id.skyscraper_icon);
       themepark = (ImageView) findViewById(R.id.thermepark_icon);
       tower = (ImageView) findViewById(R.id.tower_icon);
       villa = (ImageView) findViewById(R.id.villa_icon);
       yatch = (ImageView) findViewById(R.id.yatch_icon);


        bank.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapa="bank";
                guardarMapa();


            }
        });
        border.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapa="border";
                guardarMapa();


            }
        });
        chalet.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapa="chalet";
                guardarMapa();


            }
        });
        clubhouse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapa="clubhouse";
                guardarMapa();


            }
        });
        coastline.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapa="coastline";
                guardarMapa();


            }
        });
        consulate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapa="consulate";
                guardarMapa();


            }
        });
        favela.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapa="favela";
                guardarMapa();


            }
        });
        fortress.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapa="fortress";
                guardarMapa();


            }
        });
        hereford.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapa="hereford";
                guardarMapa();


            }
        });
        house.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapa="house";
                guardarMapa();


            }
        });
        kafe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapa="kafe";
                guardarMapa();


            }
        });
        kanal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapa="kanal";
                guardarMapa();


            }
        });
        oregon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapa="oregon";
                guardarMapa();


            }
        });
        outback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapa="outback";
                guardarMapa();


            }
        });
        plane.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapa="plane";
                guardarMapa();


            }
        });
        skyscraper.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapa="skyscraper";
                guardarMapa();


            }
        });
        themepark.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapa="themepark";
                guardarMapa();


            }
        });
        tower.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapa="tower";
                guardarMapa();


            }
        });
        villa.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapa="villa";
                guardarMapa();


            }
        });
        yatch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapa="yatch";
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
