package com.example.memorygame;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import static com.example.memorygame.R.drawable.lemon_01_300px;

public class MainActivity extends AppCompatActivity {

    private ImageView
            x1y1, x2y1, x3y1,
            x1y2, x2y2, x3y2,
            x1y3, x2y3, x3y3,
            x1y4, x2y4, x3y4;

    int clickCount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView x1y1 = (ImageView) findViewById(R.id.x1y1);
        final ImageView x2y2 = (ImageView) findViewById(R.id.x2y2);
        final ImageView x3y3 = (ImageView) findViewById(R.id.x3y3);
        final ImageView x1y4 = (ImageView) findViewById(R.id.x1y4);
        final ImageView x2y1 = (ImageView) findViewById(R.id.x2y1);
        final ImageView x3y2 = (ImageView) findViewById(R.id.x3y2);
        final ImageView x1y3 = (ImageView) findViewById(R.id.x1y3);
        final ImageView x2y4 = (ImageView) findViewById(R.id.x2y4);
        final ImageView x3y1 = (ImageView) findViewById(R.id.x3y1);
        final ImageView x1y2 = (ImageView) findViewById(R.id.x1y2);
        final ImageView x2y3 = (ImageView) findViewById(R.id.x2y3);
        final ImageView x3y4 = (ImageView) findViewById(R.id.x3y4);


        // draw the game table with truned-back (empty) cards
        x1y1.setImageResource(R.drawable.card_backside);
        x2y2.setImageResource(R.drawable.card_backside);
        x3y3.setImageResource(R.drawable.card_backside);
        x1y4.setImageResource(R.drawable.card_backside);
        x2y1.setImageResource(R.drawable.card_backside);
        x3y2.setImageResource(R.drawable.card_backside);
        x1y3.setImageResource(R.drawable.card_backside);
        x2y4.setImageResource(R.drawable.card_backside);
        x3y1.setImageResource(R.drawable.card_backside);
        x1y2.setImageResource(R.drawable.card_backside);
        x2y3.setImageResource(R.drawable.card_backside);
        x3y4.setImageResource(R.drawable.card_backside);




        ArrayList<Integer> figuresArray = new ArrayList<>();
        figuresArray.add(R.drawable.apple_01_300px);
        figuresArray.add(R.drawable.pear_01_300px);
        figuresArray.add(R.drawable.cherry_01_300px);
        figuresArray.add(R.drawable.orange_02_300px);
        figuresArray.add(R.drawable.lemon_01_300px);
        figuresArray.add(R.drawable.cabbage_01_300px);
        // shuffle the cards
        int figuresArrayLength = figuresArray.size();
        int random = (int) (Math.random() * figuresArrayLength);
        x1y1.setImageResource(figuresArray.get(random));
        figuresArray.remove(random);



        // assign the randomized figures to the cards


    }

}
