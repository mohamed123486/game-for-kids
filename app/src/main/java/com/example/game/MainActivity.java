package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edit;
Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit=findViewById(R.id.edit);
        Login=findViewById(R.id.Login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=edit.getText().toString();
                if(n.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Please Enter your name",Toast.LENGTH_LONG).show();
                }else {
                    Intent i = new Intent(MainActivity.this, first_page.class);
                    i.putExtra("n", n);
                    startActivity(i);
                }
            }
        });

    }
}