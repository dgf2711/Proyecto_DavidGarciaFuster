package com.example.r6_wikiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Attackers extends AppCompatActivity {
    private String personaje = null;
    private ImageView iana;
    private ImageView kali;
    private ImageView amaru;
    private ImageView nokk;
    private ImageView gridlock;
    private ImageView nomad;
    private ImageView maverick;
    private ImageView lion;
    private ImageView finka;
    private ImageView dokkaebi;
    private ImageView zofia;
    private ImageView ying;
    private ImageView jackal;
    private ImageView hibana;
    private ImageView capitao;
    private ImageView blackbeard;
    private ImageView buck;
    private ImageView sledge;
    private ImageView thatcher;
    private ImageView ash;
    private ImageView thermite;
    private ImageView montagne;
    private ImageView twitch;
    private ImageView blitz;
    private ImageView iq;
    private ImageView fuze;
    private ImageView glaz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attackers);

        iana = (ImageView) findViewById(R.id.iana_icon);
        kali = (ImageView) findViewById(R.id.kali_icon);
        amaru = (ImageView) findViewById(R.id.amaru_icon);
        nokk = (ImageView) findViewById(R.id.nokk_icon);
        gridlock = (ImageView) findViewById(R.id.gridlock_icon);
        nomad = (ImageView) findViewById(R.id.nomad_icon);
        maverick = (ImageView) findViewById(R.id.maverick_icon);
        lion = (ImageView) findViewById(R.id.lion_lion);
        finka = (ImageView) findViewById(R.id.finka_icon);
        dokkaebi = (ImageView) findViewById(R.id.dokkaebi_icon);
        zofia = (ImageView) findViewById(R.id.zofia_icon);
        ying = (ImageView) findViewById(R.id.ying_icon);
        jackal = (ImageView) findViewById(R.id.jackal_icon);
        hibana = (ImageView) findViewById(R.id.hibana_icon);
        capitao= (ImageView) findViewById(R.id.capitao_icon);
        blackbeard= (ImageView) findViewById(R.id.blackbeard_icon);
        buck= (ImageView) findViewById(R.id.buck_icon);
        sledge= (ImageView) findViewById(R.id.sledge_icon);
        thatcher= (ImageView) findViewById(R.id.thatcher_icon);
        ash= (ImageView) findViewById(R.id.ash_icon);
        thermite= (ImageView) findViewById(R.id.thermite_icon);
        montagne= (ImageView) findViewById(R.id.montagne_icon);
        twitch= (ImageView) findViewById(R.id.twitch_icon);
        blitz= (ImageView) findViewById(R.id.blitz_icon);
        iq= (ImageView) findViewById(R.id.iq_icon);
        fuze= (ImageView) findViewById(R.id.fuze_icon);
        glaz= (ImageView) findViewById(R.id.glaz_icon);

        iana.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "iana";
                guardarPersonaje();


            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "kali";
                guardarPersonaje();


            }
        });
        amaru.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "amaru";
                guardarPersonaje();


            }
        });
        nokk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "nokk";
                guardarPersonaje();


            }
        });
        gridlock.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "gridlock";
                guardarPersonaje();


            }
        });
        nomad.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "nomad";
                guardarPersonaje();


            }
        });
        maverick.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "maverick";
                guardarPersonaje();


            }
        });
        lion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "lion";
                guardarPersonaje();


            }
        });
        finka.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "finka";
                guardarPersonaje();


            }
        });
        dokkaebi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "dokkaebi";
                guardarPersonaje();


            }
        });
        zofia.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "zofia";
                guardarPersonaje();


            }
        });
        ying.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "ying";
                guardarPersonaje();


            }
        });
        jackal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "jackal";
                guardarPersonaje();


            }
        });
        hibana.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "hibana";
                guardarPersonaje();


            }
        });
        capitao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "capitao";
                guardarPersonaje();


            }
        });
        blackbeard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "blackbeard";
                guardarPersonaje();


            }
        });
        buck.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "buck";
                guardarPersonaje();


            }
        });
        sledge.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "sledge";
                guardarPersonaje();


            }
        });
        thatcher.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "thatcher";
                guardarPersonaje();


            }
        });
        ash.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "ash";
                guardarPersonaje();


            }
        });
        thermite.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "thermite";
                guardarPersonaje();


            }
        });
        montagne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "montagne";
                guardarPersonaje();


            }
        });
        twitch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "twitch";
                guardarPersonaje();


            }
        });
        blitz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "blitz";
                guardarPersonaje();


            }
        });
        iq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "iq";
                guardarPersonaje();


            }
        });
        fuze.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "fuze";
                guardarPersonaje();


            }
        });
        glaz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                personaje = "glaz";
                guardarPersonaje();


            }
        });


    }




    private void guardarPersonaje(){


        Intent intentGuardar = new Intent(Attackers.this, PersonajeVisualizar.class);
        intentGuardar.putExtra("Key",personaje);
        startActivity(intentGuardar);

    }
}
