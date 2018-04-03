package com.vorldline.basketcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

import org.w3c.dom.Text;
/*
* Author : Gabriel Ibenye
* Email: gabrielibenye@gmail.com
* Date Started: 2nd of April, 2018
* Date Finished: 3rd of April, 2018
* In: My village
* */
public class MainActivity extends AppCompatActivity {

    String home;
    String away;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home = getIntent().getExtras().getString("HOME");
        away = getIntent().getExtras().getString("AWAY");

        TextView Hname = (TextView)findViewById(R.id.Hname);
        TextView Aname = (TextView)findViewById(R.id.Aname);

        if(home.isEmpty())
            Hname.setText("home");
        else
            Hname.setText(home);

        if(away.isEmpty())
            Aname.setText("away");
        else
            Aname.setText(away);

        TextView homeScore = (TextView)findViewById(R.id.homeScore);
        TextView awayScore = (TextView)findViewById(R.id.awayScore);
        homeScore.setText("0");
        awayScore.setText("0");




        Button home1 = (Button)findViewById(R.id.home1);
        Button home2 = (Button)findViewById(R.id.home2);
        Button home3 = (Button)findViewById(R.id.home3);
        Button away1 = (Button)findViewById(R.id.away1);
        Button away2 = (Button)findViewById(R.id.away2);
        Button away3 = (Button)findViewById(R.id.away3);
        Button resetButton = (Button)findViewById(R.id.resetButton);





        home3.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView homeScore = (TextView)findViewById(R.id.homeScore);
                        int Score = Integer.parseInt(homeScore.getText().toString());
                        int newScore = Score + 3;
                        homeScore.setText(String.valueOf(newScore));
                    }
                }
        );

        home2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView homeScore = (TextView)findViewById(R.id.homeScore);
                        int Score = Integer.parseInt(homeScore.getText().toString());
                        int newScore = Score + 2;
                        homeScore.setText(String.valueOf(newScore));
                    }
                }
        );

        home1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView homeScore = (TextView)findViewById(R.id.homeScore);
                        int Score = Integer.parseInt(homeScore.getText().toString());
                        int newScore = Score + 1;
                        homeScore.setText(String.valueOf(newScore));
                    }
                }
        );

        away3.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView awayScore = (TextView)findViewById(R.id.awayScore);
                        int Score = Integer.parseInt(awayScore.getText().toString());
                        int newScore = Score + 3;
                        awayScore.setText(String.valueOf(newScore));
                    }
                }
        );

        away2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView awayScore = (TextView)findViewById(R.id.awayScore);
                        int Score = Integer.parseInt(awayScore.getText().toString());
                        int newScore = Score + 2;
                        awayScore.setText(String.valueOf(newScore));
                    }
                }
        );

        away1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView awayScore = (TextView)findViewById(R.id.awayScore);
                        int Score = Integer.parseInt(awayScore.getText().toString());
                        int newScore = Score + 1;
                        awayScore.setText(String.valueOf(newScore));
                    }
                }
        );

        resetButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView awayScore = (TextView)findViewById(R.id.awayScore);
                        TextView homeScore = (TextView)findViewById(R.id.homeScore);
                        homeScore.setText("0");
                        awayScore.setText("0");
                    }
                }
        );

    }




}
