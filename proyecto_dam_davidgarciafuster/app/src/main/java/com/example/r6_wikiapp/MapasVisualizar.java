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

    private String mapa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapas_visualizar);

        iv = (ImageView) findViewById(R.id.iv);
        iv2 = (ImageView) findViewById(R.id.iv2);
        iv3 = (ImageView) findViewById(R.id.iv3);
        iv4 = (ImageView) findViewById(R.id.iv4);
        ArrayList<Integer> array_image = new ArrayList<Integer>();
        array_image.add(R.drawable.bank1);
        array_image.add(R.drawable.bank2);
        array_image.add(R.drawable.bank3);
        array_image.add(R.drawable.bank4);
        array_image.add(R.drawable.border1);
        array_image.add(R.drawable.border2);
        array_image.add(R.drawable.border3);

        Bundle bundle= getIntent().getExtras();
        mapa=bundle.getString("Key");

        if (mapa.equals("bank")){
            iv.setImageResource(array_image .get(0));
            iv2.setImageResource(array_image .get(1));
            iv3.setImageResource(array_image .get(2));
            iv4.setImageResource(array_image .get(3));
        }else

        if (mapa.equals("border")){
            iv.setImageResource(array_image .get(4));
            iv2.setImageResource(array_image .get(5));
            iv3.setImageResource(array_image .get(6));
            iv4.setVisibility(View.INVISIBLE);
        }

}
}
