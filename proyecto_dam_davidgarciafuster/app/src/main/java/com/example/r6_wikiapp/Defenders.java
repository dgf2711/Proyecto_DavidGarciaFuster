package com.example.r6_wikiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Defenders extends AppCompatActivity {
    private String personaje = null;
    private ImageView oryx;
    private ImageView wamai;
    private ImageView goyo;
    private ImageView warden;
    private ImageView mozzie;
    private ImageView kaid;
    private ImageView clash;
    private ImageView maestro;
    private ImageView alibi;
    private ImageView vigil;
    private ImageView ela;
    private ImageView lesion;
    private ImageView mira;
    private ImageView echo;
    private ImageView caveira;
    private ImageView valkyrie;
    private ImageView frost;
    private ImageView mute;
    private ImageView smoke;
    private ImageView castle;
    private ImageView pulse;
    private ImageView doc;
    private ImageView rook;
    private ImageView jager;
    private ImageView bandit;
    private ImageView tachanka;
    private ImageView kapkan;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defenders);
        oryx = (ImageView) findViewById(R.id.oryx_icon);
        wamai = (ImageView) findViewById(R.id.wamai_icon);
        goyo = (ImageView) findViewById(R.id.goyo_icon);
        warden = (ImageView) findViewById(R.id.warden_icon);
        mozzie = (ImageView) findViewById(R.id.moozie_icon);
        kaid = (ImageView) findViewById(R.id.kaid_icon);
        clash = (ImageView) findViewById(R.id.clash_icon);
        maestro = (ImageView) findViewById(R.id.maestro_icon);
        alibi = (ImageView) findViewById(R.id.alibi_icon);
        vigil = (ImageView) findViewById(R.id.vigil_icon);
        ela = (ImageView) findViewById(R.id.ela_icon);
        lesion = (ImageView) findViewById(R.id.lesion_icon);
        mira = (ImageView) findViewById(R.id.mira_icon);
        echo = (ImageView) findViewById(R.id.echo_icon);
        caveira = (ImageView) findViewById(R.id.caveira_icon);
        valkyrie = (ImageView) findViewById(R.id.valkyrie_icon);
        frost= (ImageView) findViewById(R.id.frost_icon);
        mute = (ImageView) findViewById(R.id.mute_icon);
        smoke = (ImageView) findViewById(R.id.smoke_icon);
        castle = (ImageView) findViewById(R.id.castle_icon);
        pulse = (ImageView) findViewById(R.id.pulse_icon);
        doc = (ImageView) findViewById(R.id.doc_icon);
        rook = (ImageView) findViewById(R.id.rook_icon);
        jager = (ImageView) findViewById(R.id.jager_icon);
        bandit = (ImageView) findViewById(R.id.bandit_icon);
        tachanka = (ImageView) findViewById(R.id.tachanka_icon);
        kapkan = (ImageView) findViewById(R.id.kapkan_icon);


        oryx.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "oryx";
                guardarPersonaje();


            }
        });
        wamai.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "wamai";
                guardarPersonaje();


            }
        });
        goyo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "goyo";
                guardarPersonaje();


            }
        });
        warden.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "warden";
                guardarPersonaje();


            }
        });
        mozzie.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "mozzie";
                guardarPersonaje();


            }
        });
        kaid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "kaid";
                guardarPersonaje();


            }
        });
        clash.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "clash";
                guardarPersonaje();


            }
        });
        maestro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "maestro";
                guardarPersonaje();


            }
        });
        alibi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "alibi";
                guardarPersonaje();


            }
        });
        vigil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "vigil";
                guardarPersonaje();


            }
        });
        ela.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "ela";
                guardarPersonaje();


            }
        });
        lesion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "lesion";
                guardarPersonaje();


            }
        });
        mira.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "mira";
                guardarPersonaje();


            }
        });
        echo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "echo";
                guardarPersonaje();


            }
        });
        caveira.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "caveira";
                guardarPersonaje();


            }
        });
        valkyrie.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "valkyrie";
                guardarPersonaje();


            }
        });
        frost.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "frost";
                guardarPersonaje();


            }
        });
        mute.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "mute";
                guardarPersonaje();


            }
        });
        smoke.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "smoke";
                guardarPersonaje();


            }
        });
        castle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "castle";
                guardarPersonaje();


            }
        });
        pulse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "pulse";
                guardarPersonaje();


            }
        });
        doc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "doc";
                guardarPersonaje();


            }
        });
        rook.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "rook";
                guardarPersonaje();


            }
        });
        jager.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "jager";
                guardarPersonaje();


            }
        });
        bandit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "bandit";
                guardarPersonaje();


            }
        });
        tachanka.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "tachanka";
                guardarPersonaje();


            }
        });
        kapkan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "kapkan";
                guardarPersonaje();


            }
        });


    }
    private void guardarPersonaje(){


        Intent intentGuardar = new Intent(Defenders.this, PersonajeVisualizar.class);
        intentGuardar.putExtra("Key",personaje);
        startActivity(intentGuardar);

    }
}
