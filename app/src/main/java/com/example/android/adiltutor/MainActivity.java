package com.example.android.adiltutor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView rushat = (ImageView)findViewById(R.id.rushat);

        rushat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open = new Intent(MainActivity.this,RushatActivity.class);
                startActivity(open);
            }
        });

        ImageView adil = (ImageView)findViewById(R.id.adil);

        adil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open1 = new Intent(MainActivity.this,AdilActivity.class);
                startActivity(open1);
            }
        });


    }



}
