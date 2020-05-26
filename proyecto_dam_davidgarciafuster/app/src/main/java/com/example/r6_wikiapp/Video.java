package com.example.r6_wikiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {
    private VideoView videoView;
    private String personaje;
    private String path;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        Bundle bundle = getIntent().getExtras();
        personaje = bundle.getString("Key");

        if(personaje.equals("iana")|personaje.equals("oryx")){
             path = "android.resource://" + getPackageName() + "/" + R.raw.ianaoryx;
        }
        if(personaje.equals("kali")|personaje.equals("wamai")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.wamai;
        }
        if(personaje.equals("amaru")|personaje.equals("goyo")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.goyoyamaru;
        }
        if(personaje.equals("nokk")|personaje.equals("warden")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.wardennokk;
        }
        if(personaje.equals("gridlock")|personaje.equals("mozzie")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.ianaoryx;
        }
        if(personaje.equals("nomad")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.nomad;
        }
        if(personaje.equals("maverick")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.maverick;
        }
        if(personaje.equals("lion")|personaje.equals("finka")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.finkalion;
        }
        if(personaje.equals("dokkaebi")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.dokkaebi;
        }
        if(personaje.equals("zofia")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.zofia;
        }
        if(personaje.equals("ying")|personaje.equals("lesion")|personaje.equals("ela")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.yingelalesionl;
        }
        if(personaje.equals("jackal")|personaje.equals("mira")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.mirajackal;
        }
        if(personaje.equals("hibana")|personaje.equals("echo")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.hibanaechol;
        }
        if(personaje.equals("capitao")|personaje.equals("caveira")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.capitaocaveira;
        }
        if(personaje.equals("blackbeard")|personaje.equals("valkyrie")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.clackbeardvalkyrie;
        }
        if(personaje.equals("buck")|personaje.equals("frost")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.buckfrost;
        }
        if(personaje.equals("sledge")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.sledge;
        }
        if(personaje.equals("thatcher")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.thatcher;
        }
        if(personaje.equals("ash")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.ash;
        }
        if(personaje.equals("thermite")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.thermite;
        }
        if(personaje.equals("montagne")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.montagne;
        }
        if(personaje.equals("twitch")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.twitch;
        }
        if(personaje.equals("blitz")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.blitz;
        }
        if(personaje.equals("iq")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.iq;
        }
        if(personaje.equals("fuze")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.fuze;
        }
        if(personaje.equals("glaz")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.glaz;
        }
        if(personaje.equals("kaid")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.kaid;
        }
        if(personaje.equals("clash")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.clash;
        }
        if(personaje.equals("maestro")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.maestro;
        }
        if(personaje.equals("alibi")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.alibi;
        }
        if(personaje.equals("vigil")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.vigil;
        }
        if(personaje.equals("mute")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.mute;
        }
        if(personaje.equals("smoke")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.smoke;
        }
        if(personaje.equals("castle")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.castle;
        }
        if(personaje.equals("pulse")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.pulse;
        }
        if(personaje.equals("doc")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.doc;
        }
        if(personaje.equals("rook")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.rook;
        }
        if(personaje.equals("jager")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.jager;
        }
        if(personaje.equals("bandit")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.bandit;
        }
        if(personaje.equals("tachanka")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.tachanka;
        }
        if(personaje.equals("kapkan")){
            path = "android.resource://" + getPackageName() + "/" + R.raw.kapkan;
        }


        VideoView videoView = (VideoView)findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse(path));
        MediaController mc = new MediaController(this);
        videoView.setMediaController(mc);
        videoView.start();
    }
}
