package com.example.game;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class level_2 extends AppCompatActivity {
    Button b;
    TextView tx;
    AlertDialog.Builder a,aa;
    EditText fly;
    EditText run;
    EditText eat;
    EditText apple;
    EditText meat;
    EditText fish ;
    EditText drink;
    EditText play;
    MediaPlayer ts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_2);
        /*
        a =new AlertDialog.Builder(getApplicationContext());
        a.setTitle("مرحبا مره اخري");
        a.setMessage("يجب عليك الاجابه علي جميع الاسئله بشكل صحيح  \n ثم تطغط علي الزر  ");
        a.setCancelable(false);
        a.setPositiveButton(" هيابنا ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }


        });
        a.show();

         */
        //**************************************************************************************
        fly=findViewById(R.id.fly);
        run=findViewById(R.id.run);
        eat=findViewById(R.id.eat);
        apple=findViewById(R.id.apple);
        meat=findViewById(R.id.meat);
        fish=findViewById(R.id.fish);
        drink=findViewById(R.id.drink);
        play=findViewById(R.id.play);

String n=getIntent().getStringExtra("n");
//***************************************************************************************
        b=findViewById(R.id.b);
//****************************************************************************
        tx=findViewById(R.id.tx1);
        tx.setText(" رائع لقد وصلت للمرحله الثانيه انت رائع "+n);
//***************************************************************************
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f=String.valueOf(fly.getText()) ;
                String r=String.valueOf(run.getText());
                String e=String.valueOf( eat.getText()) ;
                String a=String.valueOf( apple.getText()) ;
                String m=String.valueOf(meat.getText());
                String fi=String.valueOf(fish.getText());
                String d=String.valueOf(drink.getText());
                String p=String.valueOf( play.getText());
                if(f.equalsIgnoreCase("fly")
                        &&r.equalsIgnoreCase("run")&&
                        e.equalsIgnoreCase("eat")&&
                        a.equalsIgnoreCase("apple")
                        &&m.equalsIgnoreCase("meat")&&
                        fi.equalsIgnoreCase("fish")&&
                        d.equalsIgnoreCase("drink")&&
                        p.equalsIgnoreCase("play")){
                    fly.setBackground(getResources().getDrawable(R.drawable.pcpc));
                    run.setBackground(getResources().getDrawable(R.drawable.pcpc));
                    eat.setBackground(getResources().getDrawable(R.drawable.pcpc));
                    apple.setBackground(getResources().getDrawable(R.drawable.pcpc));
                    meat.setBackground(getResources().getDrawable(R.drawable.pcpc));
                    fish.setBackground(getResources().getDrawable(R.drawable.pcpc));
                    drink.setBackground(getResources().getDrawable(R.drawable.pcpc));
                    play.setBackground(getResources().getDrawable(R.drawable.pcpc));
                    aa = new AlertDialog.Builder(level_2.this);
                    aa.setTitle("Wowo");
                    ts=MediaPlayer.create(getApplicationContext(),R.raw.ts);
                    ts.start();
                    aa.setMessage(" لقد اجبت علي جميع الاسئله بصحيح رائع  \n   انت رائع لقد انهيت السباق ممتاز  ");
                    aa.setCancelable(false);
                    aa.setPositiveButton(" انت رائع ", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }


                    });
                    Intent fa=new Intent(level_2.this,first_page.class);
                    fa.putExtra("m","win");
                    setResult(RESULT_OK,fa);
                    finish();
                    Toast.makeText(getApplicationContext(),"رائع اكمل التعلم في شئ اخر",Toast.LENGTH_LONG).show();
                    aa.show();

//توقفت لحد هنا
                }else {
                    /*
                    fly.setBackground(getResources().getDrawable(R.drawable.err));
                    run.setBackground(getResources().getDrawable(R.drawable.err));
                    eat.setBackground(getResources().getDrawable(R.drawable.err));
                    apple.setBackground(getResources().getDrawable(R.drawable.err));
                    meat.setBackground(getResources().getDrawable(R.drawable.err));
                    fish.setBackground(getResources().getDrawable(R.drawable.err));
                    drink.setBackground(getResources().getDrawable(R.drawable.err));
                    play.setBackground(getResources().getDrawable(R.drawable.err));

                     */
                    aa = new AlertDialog.Builder(level_2.this);
                    aa.setTitle("لا تستسلم ");
                    aa.setMessage("حاول مره اخري هناك خطاء ما في الكلمات \nاعد كتابتها بشكل صحيح وحاول مره اخري  ");
                    aa.setCancelable(false);
                    aa.setPositiveButton(" انت رائع ", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }


                    });

                    aa.show();
                }
                if(f.equalsIgnoreCase("fly")){
                    fly.setBackground(getResources().getDrawable(R.drawable.pcpc));
                } if(r.equalsIgnoreCase("run")){
                    run.setBackground(getResources().getDrawable(R.drawable.pcpc));
                } if(a.equalsIgnoreCase("apple")){
                    apple.setBackground(getResources().getDrawable(R.drawable.pcpc));
                } if(m.equalsIgnoreCase("meat")){
                    meat.setBackground(getResources().getDrawable(R.drawable.pcpc));
                } if(fi.equalsIgnoreCase("fish")){
                    fish.setBackground(getResources().getDrawable(R.drawable.pcpc));
                } if(d.equalsIgnoreCase("drink")){
                    drink.setBackground(getResources().getDrawable(R.drawable.pcpc));
                } if(e.equalsIgnoreCase("eat")){
                    eat.setBackground(getResources().getDrawable(R.drawable.pcpc));
                } if(p.equalsIgnoreCase("play")){
                    play.setBackground(getResources().getDrawable(R.drawable.pcpc));
                }
                if(!f.equalsIgnoreCase("fly")){
                    fly.setBackground(getResources().getDrawable(R.drawable.err));
                } if(!r.equalsIgnoreCase("run")){
                    run.setBackground(getResources().getDrawable(R.drawable.err));
                } if(!a.equalsIgnoreCase("apple")){
                    apple.setBackground(getResources().getDrawable(R.drawable.err));
                } if(!m.equalsIgnoreCase("meat")){
                    meat.setBackground(getResources().getDrawable(R.drawable.err));
                } if(!fi.equalsIgnoreCase("fish")){
                    fish.setBackground(getResources().getDrawable(R.drawable.err));
                } if(!d.equalsIgnoreCase("drink")){
                    drink.setBackground(getResources().getDrawable(R.drawable.err));
                } if(!e.equalsIgnoreCase("eat")){
                    eat.setBackground(getResources().getDrawable(R.drawable.err));
                } if(!p.equalsIgnoreCase("play")){
                    play.setBackground(getResources().getDrawable(R.drawable.err));
                }

            }
        });
        //************************************************************************************************
        /*
        (!f.equalsIgnoreCase("fly")0
                        ||!r.equalsIgnoreCase("run")||0
                        !e.equalsIgnoreCase("eat")||0
                        !a.equalsIgnoreCase("apple")0
                        ||!m.equalsIgnoreCase("meat")||0
                        !fi.equalsIgnoreCase("fish")||0
                        !d.equalsIgnoreCase("drink")||0
                        !p.equalsIgnoreCase("play"))
         */
///*****************************************************************************************************
    }
}