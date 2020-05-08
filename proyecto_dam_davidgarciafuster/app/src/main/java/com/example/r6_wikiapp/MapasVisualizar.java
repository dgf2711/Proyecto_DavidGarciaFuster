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
        ArrayList<Integer> array_image = new ArrayList<Integer>();
        array_image.add(R.drawable.bank1);
        array_image.add(R.drawable.bank2);
        array_image.add(R.drawable.bank3);
        array_image.add(R.drawable.bank4);
        array_image.add(R.drawable.border1);
        array_image.add(R.drawable.border2);
        array_image.add(R.drawable.border3);
        array_image.add(R.drawable.chalet1);
        array_image.add(R.drawable.chalet2);
        array_image.add(R.drawable.chalet3);
        array_image.add(R.drawable.chalet4);
        array_image.add(R.drawable.clubhouse1);
        array_image.add(R.drawable.clubhouse2);
        array_image.add(R.drawable.clubhouse3);
        array_image.add(R.drawable.clubhouse4);
        array_image.add(R.drawable.coastline1);
        array_image.add(R.drawable.coastline2);
        array_image.add(R.drawable.coastline3);
        array_image.add(R.drawable.coastline4);
        array_image.add(R.drawable.consulate1);
        array_image.add(R.drawable.consulate2);
        array_image.add(R.drawable.consulate3);
        array_image.add(R.drawable.consulate4);
        array_image.add(R.drawable.favela1);
        array_image.add(R.drawable.favela2);
        array_image.add(R.drawable.favela3);
        array_image.add(R.drawable.favela4);
        array_image.add(R.drawable.favela5);
        array_image.add(R.drawable.fortress1);
        array_image.add(R.drawable.fortress2);
        array_image.add(R.drawable.fortress3);
        array_image.add(R.drawable.hereford1);
        array_image.add(R.drawable.hereford2);
        array_image.add(R.drawable.hereford3);
        array_image.add(R.drawable.hereford4);
        array_image.add(R.drawable.hereford5);
        array_image.add(R.drawable.house1);
        array_image.add(R.drawable.house2);
        array_image.add(R.drawable.house3);
        array_image.add(R.drawable.house4);
        array_image.add(R.drawable.kafe1);
        array_image.add(R.drawable.kafe2);
        array_image.add(R.drawable.kafe3);
        array_image.add(R.drawable.kafe4);
        array_image.add(R.drawable.kanal1);
        array_image.add(R.drawable.kanal2);
        array_image.add(R.drawable.kanal3);
        array_image.add(R.drawable.kanal4);
        array_image.add(R.drawable.kanal5);
        array_image.add(R.drawable.oregon1);
        array_image.add(R.drawable.oregon2);
        array_image.add(R.drawable.oregon3);
        array_image.add(R.drawable.oregon4);
        array_image.add(R.drawable.oregon5);
        array_image.add(R.drawable.outback1);
        array_image.add(R.drawable.outback2);
        array_image.add(R.drawable.outback3);
        array_image.add(R.drawable.outback4);
        array_image.add(R.drawable.plane1);
        array_image.add(R.drawable.plane2);
        array_image.add(R.drawable.plane3);
        array_image.add(R.drawable.plane4);
        array_image.add(R.drawable.skyscraper1);
        array_image.add(R.drawable.skyscraper2);
        array_image.add(R.drawable.skyscraper3);
        array_image.add(R.drawable.skyscraper4);
        array_image.add(R.drawable.themepark1);
        array_image.add(R.drawable.themepark2);
        array_image.add(R.drawable.themepark3);
        array_image.add(R.drawable.tower1);
        array_image.add(R.drawable.tower2);
        array_image.add(R.drawable.tower3);
        array_image.add(R.drawable.tower4);
        array_image.add(R.drawable.villa1);
        array_image.add(R.drawable.villa2);
        array_image.add(R.drawable.villa3);
        array_image.add(R.drawable.villa4);
        array_image.add(R.drawable.villa5);
        array_image.add(R.drawable.yatch1);
        array_image.add(R.drawable.yatch2);
        array_image.add(R.drawable.yatch3);
        array_image.add(R.drawable.yatch4);
        array_image.add(R.drawable.yatch5);
        Bundle bundle= getIntent().getExtras();
        mapa=bundle.getString("Key");


        if (mapa.equals("bank")){
            iv.setImageResource(array_image.get(0));
            iv2.setImageResource(array_image.get(1));
            iv3.setImageResource(array_image.get(2));
            iv4.setImageResource(array_image.get(3));
            iv5.setVisibility(View.GONE);
        }else

        if (mapa.equals("border")){
            iv.setImageResource(array_image.get(4));
            iv2.setImageResource(array_image.get(5));
            iv3.setImageResource(array_image.get(6));
            iv4.setVisibility(View.GONE);
            iv5.setVisibility(View.GONE);
        }else
            if (mapa.equals("chalet")){
                iv.setImageResource(array_image.get(7));
                iv2.setImageResource(array_image.get(8));
                iv3.setImageResource(array_image.get(9));
                iv4.setImageResource(array_image.get(10));
                iv5.setVisibility(View.GONE);
            }else

            if (mapa.equals("clubhouse")){
                iv.setImageResource(array_image.get(11));
                iv2.setImageResource(array_image.get(12));
                iv3.setImageResource(array_image.get(13));
                iv4.setImageResource(array_image.get(14));
                iv5.setVisibility(View.GONE);
            }else

            if (mapa.equals("coastline")){
                iv.setImageResource(array_image.get(15));
                iv2.setImageResource(array_image.get(16));
                iv3.setImageResource(array_image.get(17));
                iv4.setImageResource(array_image.get(18));
                iv5.setVisibility(View.GONE);
            }else

            if (mapa.equals("consulate")){
                iv.setImageResource(array_image.get(19));
                iv2.setImageResource(array_image.get(20));
                iv3.setImageResource(array_image.get(21));
                iv4.setImageResource(array_image.get(22));
                iv5.setVisibility(View.GONE);
            }else

            if (mapa.equals("favela")){
                iv.setImageResource(array_image.get(23));
                iv2.setImageResource(array_image.get(24));
                iv3.setImageResource(array_image.get(25));
                iv4.setImageResource(array_image.get(26));
                iv5.setImageResource(array_image.get(27));
            }else

            if (mapa.equals("fortress")){
                iv.setImageResource(array_image.get(28));
                iv2.setImageResource(array_image.get(29));
                iv3.setImageResource(array_image.get(30));
                iv4.setVisibility(View.GONE);
                iv5.setVisibility(View.GONE);
            }else

            if (mapa.equals("hereford")){
                iv.setImageResource(array_image.get(31));
                iv2.setImageResource(array_image.get(32));
                iv3.setImageResource(array_image.get(33));
                iv4.setImageResource(array_image.get(34));
                iv5.setImageResource(array_image.get(35));
            }else

            if (mapa.equals("house")){
                iv.setImageResource(array_image.get(36));
                iv2.setImageResource(array_image.get(37));
                iv3.setImageResource(array_image.get(38));
                iv4.setImageResource(array_image.get(39));
                iv5.setVisibility(View.GONE);
            }else

            if (mapa.equals("kafe")){
                iv.setImageResource(array_image.get(40));
                iv2.setImageResource(array_image.get(41));
                iv3.setImageResource(array_image.get(42));
                iv4.setImageResource(array_image.get(43));
                iv5.setVisibility(View.GONE);
            }else

            if (mapa.equals("kanal")){
                iv.setImageResource(array_image.get(44));
                iv2.setImageResource(array_image.get(45));
                iv3.setImageResource(array_image.get(46));
                iv4.setImageResource(array_image.get(47));
                iv5.setImageResource(array_image.get(48));
            }else

            if (mapa.equals("oregon")){
                iv.setImageResource(array_image.get(49));
                iv2.setImageResource(array_image.get(50));
                iv3.setImageResource(array_image.get(51));
                iv4.setImageResource(array_image.get(52));
                iv5.setImageResource(array_image.get(53));
            }else

            if (mapa.equals("outback")){
                iv.setImageResource(array_image.get(54));
                iv2.setImageResource(array_image.get(55));
                iv3.setImageResource(array_image.get(56));
                iv4.setImageResource(array_image.get(57));
                iv5.setVisibility(View.GONE);
            }else

            if (mapa.equals("plane")){
                iv.setImageResource(array_image.get(58));
                iv2.setImageResource(array_image.get(59));
                iv3.setImageResource(array_image.get(60));
                iv4.setImageResource(array_image.get(61));
                iv5.setVisibility(View.GONE);
            }else

            if (mapa.equals("skyscraper")){
                iv.setImageResource(array_image.get(62));
                iv2.setImageResource(array_image.get(63));
                iv3.setImageResource(array_image.get(64));
                iv4.setImageResource(array_image.get(65));
                iv5.setVisibility(View.GONE);
            }else

            if (mapa.equals("themepark")){
                iv.setImageResource(array_image.get(66));
                iv2.setImageResource(array_image.get(67));
                iv3.setImageResource(array_image.get(68));
                iv4.setVisibility(View.GONE);
                iv5.setVisibility(View.GONE);
            }else

        if (mapa.equals("tower")){
            iv.setImageResource(array_image.get(69));
            iv2.setImageResource(array_image.get(70));
            iv3.setImageResource(array_image.get(71));
            iv4.setImageResource(array_image.get(72));
            iv5.setVisibility(View.GONE);
        } else

        if (mapa.equals("villa")){
            iv.setImageResource(array_image.get(73));
            iv2.setImageResource(array_image.get(74));
            iv3.setImageResource(array_image.get(75));
            iv4.setImageResource(array_image.get(76));
            iv5.setImageResource(array_image.get(77));
        }else

        if (mapa.equals("yatch")){
            iv.setImageResource(array_image.get(78));
            iv2.setImageResource(array_image.get(79));
            iv3.setImageResource(array_image.get(80));
            iv4.setImageResource(array_image.get(81));
            iv5.setImageResource(array_image.get(82));
        }

}
}
