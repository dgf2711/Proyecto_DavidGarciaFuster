package com.example.r6_wikiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MapasVisualizar extends AppCompatActivity {
    private ImageView iv;
    private ImageView iv2;
    private ImageView iv3;
    private ImageView iv4;
    private ImageView iv5;
    private String mapa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapas_visualizar);
        SharedPreferences preferencias=getSharedPreferences("name",MODE_PRIVATE);

        iv = (ImageView) findViewById(R.id.iv);
        iv2 = (ImageView) findViewById(R.id.iv2);
        iv3 = (ImageView) findViewById(R.id.iv3);
        iv4 = (ImageView) findViewById(R.id.iv4);
        iv5 = (ImageView) findViewById(R.id.iv5);

        Bundle bundle= getIntent().getExtras();
        mapa=bundle.getString("Key");


        if (mapa.equals("bank")){
            iv.setImageResource(R.drawable.bank1);
            iv2.setImageResource(R.drawable.bank2);
            iv3.setImageResource(R.drawable.bank3);
            iv4.setImageResource(R.drawable.bank4);
            iv5.setVisibility(View.GONE);
        }else

        if (mapa.equals("border")){
            iv.setImageResource(R.drawable.border1);
            iv2.setImageResource(R.drawable.border2);
            iv3.setImageResource(R.drawable.border3);
            iv4.setVisibility(View.GONE);
            iv5.setVisibility(View.GONE);
        }else
            if (mapa.equals("chalet")){
                iv.setImageResource(R.drawable.chalet1);
                iv2.setImageResource(R.drawable.chalet2);
                iv3.setImageResource(R.drawable.chalet3);
                iv4.setImageResource(R.drawable.chalet4);
                iv5.setVisibility(View.GONE);
            }else

            if (mapa.equals("clubhouse")){
                iv.setImageResource(R.drawable.clubhouse1);
                iv2.setImageResource(R.drawable.clubhouse2);
                iv3.setImageResource(R.drawable.clubhouse3);
                iv4.setImageResource(R.drawable.clubhouse4);
                iv5.setVisibility(View.GONE);
            }else

            if (mapa.equals("coastline")){
                iv.setImageResource(R.drawable.clubhouse1);
                iv2.setImageResource(R.drawable.clubhouse2);
                iv3.setImageResource(R.drawable.clubhouse3);
                iv4.setImageResource(R.drawable.clubhouse4);
                iv5.setVisibility(View.GONE);
            }else

            if (mapa.equals("consulate")){
                iv.setImageResource(R.drawable.consulate1);
                iv2.setImageResource(R.drawable.consulate2);
                iv3.setImageResource(R.drawable.consulate3);
                iv4.setImageResource(R.drawable.consulate4);
                iv5.setVisibility(View.GONE);
            }else

            if (mapa.equals("favela")){
                iv.setImageResource(R.drawable.favela1);
                iv2.setImageResource(R.drawable.favela2);
                iv3.setImageResource(R.drawable.favela3);
                iv4.setImageResource(R.drawable.favela4);
                iv5.setImageResource(R.drawable.favela5);
            }else

            if (mapa.equals("fortress")){
                iv.setImageResource(R.drawable.fortress1);
                iv2.setImageResource(R.drawable.fortress2);
                iv3.setImageResource(R.drawable.fortress3);
                iv4.setVisibility(View.GONE);
                iv5.setVisibility(View.GONE);
            }else

            if (mapa.equals("hereford")){
                iv.setImageResource(R.drawable.hereford1);
                iv2.setImageResource(R.drawable.hereford2);
                iv3.setImageResource(R.drawable.hereford3);
                iv4.setImageResource(R.drawable.hereford4);
                iv5.setImageResource(R.drawable.hereford5);
            }else

            if (mapa.equals("house")){
                iv.setImageResource(R.drawable.house1);
                iv2.setImageResource(R.drawable.house2);
                iv3.setImageResource(R.drawable.house3);
                iv4.setImageResource(R.drawable.house3);
                iv5.setVisibility(View.GONE);
            }else

            if (mapa.equals("kafe")){
                iv.setImageResource(R.drawable.kafe1);
                iv2.setImageResource(R.drawable.kafe2);
                iv3.setImageResource(R.drawable.kafe3);
                iv4.setImageResource(R.drawable.kafe4);
                iv5.setVisibility(View.GONE);
            }else

            if (mapa.equals("kanal")){
                iv.setImageResource(R.drawable.kanal1);
                iv2.setImageResource(R.drawable.kanal2);
                iv3.setImageResource(R.drawable.kanal3);
                iv4.setImageResource(R.drawable.kanal4);
                iv5.setImageResource(R.drawable.kanal5);
            }else

            if (mapa.equals("oregon")){
                iv.setImageResource(R.drawable.oregon1);
                iv2.setImageResource(R.drawable.oregon2);
                iv3.setImageResource(R.drawable.oregon3);
                iv4.setImageResource(R.drawable.oregon4);
                iv5.setImageResource(R.drawable.oregon5);
            }else

            if (mapa.equals("outback")){
                iv.setImageResource(R.drawable.outback1);
                iv2.setImageResource(R.drawable.outback2);
                iv3.setImageResource(R.drawable.outback3);
                iv4.setImageResource(R.drawable.outback4);
                iv5.setVisibility(View.GONE);
            }else

            if (mapa.equals("plane")){
                iv.setImageResource(R.drawable.plane1);
                iv2.setImageResource(R.drawable.plane2);
                iv3.setImageResource(R.drawable.plane3);
                iv4.setImageResource(R.drawable.plane4);
                iv5.setVisibility(View.GONE);
            }else

            if (mapa.equals("skyscraper")){
                iv.setImageResource(R.drawable.skyscraper1);
                iv2.setImageResource(R.drawable.skyscraper2);
                iv3.setImageResource(R.drawable.skyscraper3);
                iv4.setImageResource(R.drawable.skyscraper4);
                iv5.setVisibility(View.GONE);
            }else

            if (mapa.equals("themepark")){
                iv.setImageResource(R.drawable.themepark1);
                iv2.setImageResource(R.drawable.themepark2);
                iv3.setImageResource(R.drawable.themepark3);
                iv4.setVisibility(View.GONE);
                iv5.setVisibility(View.GONE);
            }else

        if (mapa.equals("tower")){
            iv.setImageResource(R.drawable.tower1);
            iv2.setImageResource(R.drawable.tower2);
            iv3.setImageResource(R.drawable.tower3);
            iv4.setImageResource(R.drawable.tower4);
            iv5.setVisibility(View.GONE);
        } else

        if (mapa.equals("villa")){
            iv.setImageResource(R.drawable.villa1);
            iv2.setImageResource(R.drawable.villa2);
            iv3.setImageResource(R.drawable.villa3);
            iv4.setImageResource(R.drawable.villa4);
            iv5.setImageResource(R.drawable.villa5);
        }else

        if (mapa.equals("yatch")){
            iv.setImageResource(R.drawable.yatch1);
            iv2.setImageResource(R.drawable.yatch2);
            iv3.setImageResource(R.drawable.yatch3);
            iv4.setImageResource(R.drawable.yatch4);
            iv5.setImageResource(R.drawable.yatch5);
        }

}
}
