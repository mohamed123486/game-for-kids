package com.example.game;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class first_page extends AppCompatActivity {
Button l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
TextView name;
MediaPlayer m;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 20 && resultCode == RESULT_OK) {
            l2 = findViewById(R.id.l2);
            String a = data.getStringExtra("m");
            l2.setBackground(getResources().getDrawable(R.drawable.bcc));
            l2.setEnabled(true);
            m = MediaPlayer.create(getApplicationContext(), R.raw.wn);
            m.start();
        } else if (requestCode == 22 && resultCode == RESULT_OK) {
          //  l2.setBackground(getResources().getDrawable(R.drawable.bcc));
            l3 = findViewById(R.id.l3);
            name.setText(getResources().getText(R.string.gret));
            l3.setEnabled(true);
            m = MediaPlayer.create(getApplicationContext(), R.raw.wn);
            m.start();
            l3.setBackground(getResources().getDrawable(R.drawable.bcc));
        } else if (requestCode == 24 && resultCode == RESULT_OK) {
            l4 = findViewById(R.id.l4);
            l4.setBackground(getResources().getDrawable(R.drawable.bcc));
            name.setText(getResources().getText(R.string.gret));
            l4.setEnabled(true);
            m = MediaPlayer.create(getApplicationContext(), R.raw.wn);
            m.start();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        String n=getIntent().getStringExtra("n");
        name=findViewById(R.id.name);
        name.setText(getResources().getText(R.string.hello)+" "+n);
        findViewById(R.id.l1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l1=new Intent(first_page.this,level1.class);
                startActivityForResult(l1,20);

            }
        });
        findViewById(R.id.l2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ll=new Intent(first_page.this, level_2.class);
                ll.putExtra("n",n);
                startActivityForResult(ll,22);

            }
        });
        findViewById(R.id.l3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ll=new Intent(first_page.this, level3.class);
                ll.putExtra("n",n);
                startActivityForResult(ll,24);
            }
        });
    }

}