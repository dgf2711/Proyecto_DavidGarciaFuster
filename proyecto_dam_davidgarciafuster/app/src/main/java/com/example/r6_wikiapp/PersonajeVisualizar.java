package com.example.r6_wikiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class PersonajeVisualizar extends AppCompatActivity {
    private ImageView imagePersonaje;
    private TextView nombreClave;
    private TextView nombre;
    private TextView nacionalidad;
    private TextView armaPrincipal;
    private TextView dañoArma1;
    private TextView cadenciaArma1;
    private TextView movilidadArma1;
    private TextView cargadorArma1;
    private TextView armaPrincipal2;
    private TextView dañoArma2;
    private TextView cadenciaArma2;
    private TextView movilidadArma2;
    private TextView cargadorArma2;
    private TextView armaSecundaria;
    private TextView dañoArma3;
    private TextView cadenciaArma3;
    private TextView movilidadArma3;
    private TextView cargadorArma3;
    private TextView armaSecundaria2;
    private TextView dañoArma4;
    private TextView cadenciaArma4;
    private TextView movilidadArma4;
    private TextView cargadorArma4;
    private TextView habilidad;
    private TextView dificultad;
    private TextView velocidad;
    private TextView blindaje;
    private Button buttonVideo;
    String personaje;
    String[] campos;
    String[] arma1;
    String[] arma2;
    String[] arma3;
    String[] arma4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personaje_visualizar);
        buttonVideo= (Button)findViewById(R.id.buttonVideo);
        imagePersonaje = (ImageView) findViewById(R.id.imagePersonaje);
        nombreClave = (TextView) findViewById(R.id.nombreClaveText);
        nombre = (TextView) findViewById(R.id.nombreText);
        nacionalidad = (TextView) findViewById(R.id.nacionalidadText);
        armaPrincipal = (TextView) findViewById(R.id.armaPrincipalText);
        dañoArma1 = (TextView) findViewById(R.id.dañoArma1Text);
        cadenciaArma1 = (TextView) findViewById(R.id.cadenciaArma1Text);
        movilidadArma1 = (TextView) findViewById(R.id.movilidadArma1Text);
        cargadorArma1 = (TextView) findViewById(R.id.cargadorArma1Text);
        armaPrincipal2 = (TextView) findViewById(R.id.armaPrincipal2Text);
        dañoArma2 = (TextView) findViewById(R.id.dañoArma2Text);
        cadenciaArma2 = (TextView) findViewById(R.id.cadenciaArma2Text);
        movilidadArma2 = (TextView) findViewById(R.id.movilidadArma2Text);
        cargadorArma2 = (TextView) findViewById(R.id.cargadorArma2Text);
        armaSecundaria = (TextView) findViewById(R.id.armaSecundariaText);
        dañoArma3 = (TextView) findViewById(R.id.dañoArma3Text);
        cadenciaArma3 = (TextView) findViewById(R.id.cadenciaArma3Text);
        movilidadArma3 = (TextView) findViewById(R.id.movilidadArma3Text);
        cargadorArma3 = (TextView) findViewById(R.id.cargadorArma3Text);
        armaSecundaria2 = (TextView) findViewById(R.id.armaSecundaria2Text);
        dañoArma4 = (TextView) findViewById(R.id.dañoArma4Text);
        cadenciaArma4 = (TextView) findViewById(R.id.cadenciaArma4Text);
        movilidadArma4 = (TextView) findViewById(R.id.movilidadArma4Text);
        cargadorArma4 = (TextView) findViewById(R.id.cargadorArma4Text);
        habilidad = (TextView) findViewById(R.id.habilidadText);
        dificultad = (TextView) findViewById(R.id.dificultadText);
        velocidad = (TextView) findViewById(R.id.velocidadText);
        blindaje = (TextView) findViewById(R.id.blindajeText);


        buttonVideo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentVideo = new Intent(PersonajeVisualizar.this, Video.class);
                intentVideo.putExtra("Key",personaje);
                startActivity(intentVideo);



            }
        });
        DatabaseAcces databaseAcces = DatabaseAcces.getInstance(getApplicationContext());
        databaseAcces.open();

        Bundle bundle = getIntent().getExtras();
        personaje = bundle.getString("Key");

        if (personaje.equals("iana")) {
            imagePersonaje.setImageResource(R.drawable.iana_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            if (campos[6] == null) {
                armaSecundaria2.setVisibility(View.GONE);
                dañoArma4.setVisibility(View.GONE);
                cadenciaArma4.setVisibility(View.GONE);
                movilidadArma4.setVisibility(View.GONE);
                cargadorArma4.setVisibility(View.GONE);
            }
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);
        }
        if (personaje.equals("kali")) {
            imagePersonaje.setImageResource(R.drawable.kali_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            if (campos[4] == null) {
                armaPrincipal2.setVisibility(View.GONE);
                dañoArma2.setVisibility(View.GONE);
                cadenciaArma2.setVisibility(View.GONE);
                movilidadArma2.setVisibility(View.GONE);
                cargadorArma2.setVisibility(View.GONE);
            }
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria: " + campos[6]);
            dañoArma4.setText("Daño: " + arma4[1]);
            cadenciaArma4.setText("Cadencia: " + arma4[2]);
            movilidadArma4.setText("Movilidad: " + arma4[3]);
            cargadorArma4.setText("Cargador: " + arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);
        }
        if (personaje.equals("amaru")) {
            imagePersonaje.setImageResource(R.drawable.amaru_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("nokk")) {
            imagePersonaje.setImageResource(R.drawable.nokk_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("gridlock")) {
            imagePersonaje.setImageResource(R.drawable.gridlock_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setVisibility(View.GONE);
            dañoArma4.setVisibility(View.GONE);
            cadenciaArma4.setVisibility(View.GONE);
            movilidadArma4.setVisibility(View.GONE);
            cargadorArma4.setVisibility(View.GONE);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);
        }
        if (personaje.equals("nomad")) {
            imagePersonaje.setImageResource(R.drawable.nomad_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            if (campos[6] == null) {
                armaSecundaria2.setVisibility(View.GONE);
                dañoArma4.setVisibility(View.GONE);
                cadenciaArma4.setVisibility(View.GONE);
                movilidadArma4.setVisibility(View.GONE);
                cargadorArma4.setVisibility(View.GONE);
            }
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("maverick")) {
            imagePersonaje.setImageResource(R.drawable.maverick_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            if (campos[6] == null) {
                armaSecundaria2.setVisibility(View.GONE);
                dañoArma4.setVisibility(View.GONE);
                cadenciaArma4.setVisibility(View.GONE);
                movilidadArma4.setVisibility(View.GONE);
                cargadorArma4.setVisibility(View.GONE);
            }
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("lion")) {
            imagePersonaje.setImageResource(R.drawable.lion_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("finka")) {
            imagePersonaje.setImageResource(R.drawable.finka_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("dokkaebi")) {
            imagePersonaje.setImageResource(R.drawable.dokkaebi_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("zofia")) {
            imagePersonaje.setImageResource(R.drawable.zofia_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            if (campos[6] == null) {
                armaSecundaria2.setVisibility(View.GONE);
                dañoArma4.setVisibility(View.GONE);
                cadenciaArma4.setVisibility(View.GONE);
                movilidadArma4.setVisibility(View.GONE);
                cargadorArma4.setVisibility(View.GONE);
            }
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("ying")) {
            imagePersonaje.setImageResource(R.drawable.ying_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            if (campos[6] == null) {
                armaSecundaria2.setVisibility(View.GONE);
                dañoArma4.setVisibility(View.GONE);
                cadenciaArma4.setVisibility(View.GONE);
                movilidadArma4.setVisibility(View.GONE);
                cargadorArma4.setVisibility(View.GONE);
            }
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("jackal")) {
            imagePersonaje.setImageResource(R.drawable.jackal_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("hibana")) {
            imagePersonaje.setImageResource(R.drawable.hibana_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("capitao")) {
            imagePersonaje.setImageResource(R.drawable.capitao_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            if (campos[6] == null) {
                armaSecundaria2.setVisibility(View.GONE);
                dañoArma4.setVisibility(View.GONE);
                cadenciaArma4.setVisibility(View.GONE);
                movilidadArma4.setVisibility(View.GONE);
                cargadorArma4.setVisibility(View.GONE);
            }
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("blackbeard")) {
            imagePersonaje.setImageResource(R.drawable.blackbeard_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            if (campos[6] == null) {
                armaSecundaria2.setVisibility(View.GONE);
                dañoArma4.setVisibility(View.GONE);
                cadenciaArma4.setVisibility(View.GONE);
                movilidadArma4.setVisibility(View.GONE);
                cargadorArma4.setVisibility(View.GONE);
            }
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("buck")) {
            imagePersonaje.setImageResource(R.drawable.buck_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            if (campos[6] == null) {
                armaSecundaria2.setVisibility(View.GONE);
                dañoArma4.setVisibility(View.GONE);
                cadenciaArma4.setVisibility(View.GONE);
                movilidadArma4.setVisibility(View.GONE);
                cargadorArma4.setVisibility(View.GONE);
            }
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("sledge")) {
            imagePersonaje.setImageResource(R.drawable.sledge_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("thatcher")) {
            imagePersonaje.setImageResource(R.drawable.thatcher_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            if (campos[6] == null) {
                armaSecundaria2.setVisibility(View.GONE);
                dañoArma4.setVisibility(View.GONE);
                cadenciaArma4.setVisibility(View.GONE);
                movilidadArma4.setVisibility(View.GONE);
                cargadorArma4.setVisibility(View.GONE);
            }
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("ash")) {
            imagePersonaje.setImageResource(R.drawable.ash_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("thermite")) {
            imagePersonaje.setImageResource(R.drawable.thermite_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("montagne")) {
            imagePersonaje.setImageResource(R.drawable.montagne_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            if (campos[4] == null) {
                armaPrincipal2.setVisibility(View.GONE);
                dañoArma2.setVisibility(View.GONE);
                cadenciaArma2.setVisibility(View.GONE);
                movilidadArma2.setVisibility(View.GONE);
                cargadorArma2.setVisibility(View.GONE);
            }
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("twitch")) {
            imagePersonaje.setImageResource(R.drawable.twitch_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("blitz")) {
            imagePersonaje.setImageResource(R.drawable.blitz_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            if (campos[4] == null) {
                armaPrincipal2.setVisibility(View.GONE);
                dañoArma2.setVisibility(View.GONE);
                cadenciaArma2.setVisibility(View.GONE);
                movilidadArma2.setVisibility(View.GONE);
                cargadorArma2.setVisibility(View.GONE);
            }
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            if (campos[6] == null) {
                armaSecundaria2.setVisibility(View.GONE);
                dañoArma4.setVisibility(View.GONE);
                cadenciaArma4.setVisibility(View.GONE);
                movilidadArma4.setVisibility(View.GONE);
                cargadorArma4.setVisibility(View.GONE);
            }
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("iq")) {
            imagePersonaje.setImageResource(R.drawable.iq_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            if (campos[6] == null) {
                armaSecundaria2.setVisibility(View.GONE);
                dañoArma4.setVisibility(View.GONE);
                cadenciaArma4.setVisibility(View.GONE);
                movilidadArma4.setVisibility(View.GONE);
                cargadorArma4.setVisibility(View.GONE);
            }
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("fuze")) {
            imagePersonaje.setImageResource(R.drawable.fuze_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("glaz")) {
            imagePersonaje.setImageResource(R.drawable.glaz_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            if (campos[4] == null) {
                armaPrincipal2.setVisibility(View.GONE);
                dañoArma2.setVisibility(View.GONE);
                cadenciaArma2.setVisibility(View.GONE);
                movilidadArma2.setVisibility(View.GONE);
                cargadorArma2.setVisibility(View.GONE);
            }
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("oryx")) {
            imagePersonaje.setImageResource(R.drawable.oryx_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("wamai")) {
            imagePersonaje.setImageResource(R.drawable.wamai_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("goyo")) {
            imagePersonaje.setImageResource(R.drawable.goyo_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            if (campos[6] == null) {
                armaSecundaria2.setVisibility(View.GONE);
                dañoArma4.setVisibility(View.GONE);
                cadenciaArma4.setVisibility(View.GONE);
                movilidadArma4.setVisibility(View.GONE);
                cargadorArma4.setVisibility(View.GONE);
            }
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("warden")) {
            imagePersonaje.setImageResource(R.drawable.warden_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("mozzie")) {
            imagePersonaje.setImageResource(R.drawable.mozzie_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("kaid")) {
            imagePersonaje.setImageResource(R.drawable.kaid_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            if (campos[6] == null) {
                armaSecundaria2.setVisibility(View.GONE);
                dañoArma4.setVisibility(View.GONE);
                cadenciaArma4.setVisibility(View.GONE);
                movilidadArma4.setVisibility(View.GONE);
                cargadorArma4.setVisibility(View.GONE);
            }
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("clash")) {
            imagePersonaje.setImageResource(R.drawable.clash_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            if (campos[4] == null) {
                armaPrincipal2.setVisibility(View.GONE);
                dañoArma2.setVisibility(View.GONE);
                cadenciaArma2.setVisibility(View.GONE);
                movilidadArma2.setVisibility(View.GONE);
                cargadorArma2.setVisibility(View.GONE);
            }
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("maestro")) {
            imagePersonaje.setImageResource(R.drawable.maestro_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("alibi")) {
            imagePersonaje.setImageResource(R.drawable.alibi_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("vigil")) {
            imagePersonaje.setImageResource(R.drawable.vigil_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("ela")) {
            imagePersonaje.setImageResource(R.drawable.ela_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            if (campos[6] == null) {
                armaSecundaria2.setVisibility(View.GONE);
                dañoArma4.setVisibility(View.GONE);
                cadenciaArma4.setVisibility(View.GONE);
                movilidadArma4.setVisibility(View.GONE);
                cargadorArma4.setVisibility(View.GONE);
            }
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("lesion")) {
            imagePersonaje.setImageResource(R.drawable.lesion_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            if (campos[6] == null) {
                armaSecundaria2.setVisibility(View.GONE);
                dañoArma4.setVisibility(View.GONE);
                cadenciaArma4.setVisibility(View.GONE);
                movilidadArma4.setVisibility(View.GONE);
                cargadorArma4.setVisibility(View.GONE);
            }
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("mira")) {
            imagePersonaje.setImageResource(R.drawable.mira_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("echo")) {
            imagePersonaje.setImageResource(R.drawable.echo_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("caveira")) {
            imagePersonaje.setImageResource(R.drawable.caveira_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            if (campos[6] == null) {
                armaSecundaria2.setVisibility(View.GONE);
                dañoArma4.setVisibility(View.GONE);
                cadenciaArma4.setVisibility(View.GONE);
                movilidadArma4.setVisibility(View.GONE);
                cargadorArma4.setVisibility(View.GONE);
            }
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("valkyrie")) {
            imagePersonaje.setImageResource(R.drawable.valkyrie_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            if (campos[6] == null) {
                armaSecundaria2.setVisibility(View.GONE);
                dañoArma4.setVisibility(View.GONE);
                cadenciaArma4.setVisibility(View.GONE);
                movilidadArma4.setVisibility(View.GONE);
                cargadorArma4.setVisibility(View.GONE);
            }
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("frost")) {
            imagePersonaje.setImageResource(R.drawable.frost_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            if (campos[6] == null) {
                armaSecundaria2.setVisibility(View.GONE);
                dañoArma4.setVisibility(View.GONE);
                cadenciaArma4.setVisibility(View.GONE);
                movilidadArma4.setVisibility(View.GONE);
                cargadorArma4.setVisibility(View.GONE);
            }
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("mute")) {
            imagePersonaje.setImageResource(R.drawable.mute_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("smoke")) {
            imagePersonaje.setImageResource(R.drawable.smoke_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("castle")) {
            imagePersonaje.setImageResource(R.drawable.castle_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("pulse")) {
            imagePersonaje.setImageResource(R.drawable.pulse_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("doc")) {
            imagePersonaje.setImageResource(R.drawable.doc_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("rook")) {
            imagePersonaje.setImageResource(R.drawable.rook_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("jager")) {
            imagePersonaje.setImageResource(R.drawable.jager_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            if (campos[6] == null) {
                armaSecundaria2.setVisibility(View.GONE);
                dañoArma4.setVisibility(View.GONE);
                cadenciaArma4.setVisibility(View.GONE);
                movilidadArma4.setVisibility(View.GONE);
                cargadorArma4.setVisibility(View.GONE);
            }
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("bandit")) {
            imagePersonaje.setImageResource(R.drawable.bandit_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            if (campos[6] == null) {
                armaSecundaria2.setVisibility(View.GONE);
                dañoArma4.setVisibility(View.GONE);
                cadenciaArma4.setVisibility(View.GONE);
                movilidadArma4.setVisibility(View.GONE);
                cargadorArma4.setVisibility(View.GONE);
            }
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("tachanka")) {
            imagePersonaje.setImageResource(R.drawable.tachanka_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }
        if (personaje.equals("kapkan")) {
            imagePersonaje.setImageResource(R.drawable.kapkan_character);
            campos = databaseAcces.getTodoPersonaje(personaje);
            arma1 = databaseAcces.getStatsarmarPrincipal(personaje);
            arma2 = databaseAcces.getStatsarmarPrincipal2(personaje);
            arma3 = databaseAcces.getStatsarmarSecundaria(personaje);
            arma4 = databaseAcces.getStatsarmarSecundaria2(personaje);
            nombreClave.setText("Nombre Clave: " + campos[0]);
            nombre.setText("Nombre: " + campos[1]);
            nacionalidad.setText("Nacionalidad: " + campos[2]);
            armaPrincipal.setText("Arma Principal: " + campos[3]);
            dañoArma1.setText("Daño: " + arma1[1]);
            cadenciaArma1.setText("Cadencia: " + arma1[2]);
            movilidadArma1.setText("Movilidad: " + arma1[3]);
            cargadorArma1.setText("Cargador: " + arma1[4]);
            armaPrincipal2.setText("Arma Principal 2: " + campos[4]);
            dañoArma2.setText("Daño: " + arma2[1]);
            cadenciaArma2.setText("Cadencia: " + arma2[2]);
            movilidadArma2.setText("Movilidad: " + arma2[3]);
            cargadorArma2.setText("Cargador: " + arma2[4]);
            armaSecundaria.setText("Arma Secundaria: " + campos[5]);
            dañoArma3.setText("Daño: " + arma3[1]);
            cadenciaArma3.setText("Cadencia: " + arma3[2]);
            movilidadArma3.setText("Movilidad: " + arma3[3]);
            cargadorArma3.setText("Cargador: " + arma3[4]);
            armaSecundaria2.setText("Arma Secundaria 2: "+campos[6]);
            dañoArma4.setText("Daño: "+arma4[1]);
            cadenciaArma4.setText("Cadencia: "+arma4[2]);
            movilidadArma4.setText("Movilidad: "+arma4[3]);
            cargadorArma4.setText("Cargador: "+arma4[4]);
            habilidad.setText("Habilidad: "+campos[7]);
            dificultad.setText("Dificultad: "+campos[8]);
            velocidad.setText("Velocidad: "+campos[9]);
            blindaje.setText("Habilidad: "+campos[10]);

        }


    }
}
