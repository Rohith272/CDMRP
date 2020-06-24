package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class learnning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnning);
        Button button81 = findViewById(R.id.button81);
        Button button82 = findViewById(R.id.button82);
        Button button83 = findViewById(R.id.button83);
        Button button84 = findViewById(R.id.button84);
        Button button85 = findViewById(R.id.button85);


        button81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=fe_7GV11w_Q&t=11s"));
                startActivity(Getintent);
            }
        });


        button82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=q6TgSW7unF8&t=10s"));
                startActivity(Getintent);

            }
        });

        button83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=_2htS3eFr1E&t=4s"));
                startActivity(Getintent);

            }
        });

        button84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JFPQpseN6lM"));
                startActivity(Getintent);

            }
        });

        button85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=qbMathRnDHk&t =23s"));
                startActivity(Getintent);

            }
        });

    }
}
