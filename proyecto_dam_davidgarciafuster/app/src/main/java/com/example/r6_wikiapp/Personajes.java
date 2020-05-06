package com.example.r6_wikiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Personajes extends AppCompatActivity {
    private ImageView attacker;
    private ImageView defender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personajes);
        attacker = (ImageView) findViewById(R.id.attacker_image);
        defender = (ImageView) findViewById(R.id.defender_image);

        attacker.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentAttackers = new Intent(Personajes.this, Attackers.class);
                startActivity(intentAttackers);
            }
        });
        defender.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentDefenders = new Intent(Personajes.this, Defenders.class);
                startActivity(intentDefenders);
            }
        });
    }
}
