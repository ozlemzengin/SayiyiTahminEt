package com.zengin.sayiyitahminet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    ImageView imageView;
    TextView textView5;
    Button buttonbasla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.imageView);
        textView5 = (TextView) findViewById(R.id.textView5);
        buttonbasla = (Button) findViewById(R.id.buttonbasla);
        buttonbasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Ekran2.class);
                startActivity(i);
                finish();

            }
        });
       // Intent intent = new Intent(MainActivity.this, Ekran2.class);
        //startActivity(intent);
    }}




