package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class speechtherapy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speechtherapy);
        Button button55 = findViewById(R.id.button55);
        Button button56 = findViewById(R.id.button56);
        Button button57 = findViewById(R.id.button57);
        Button button58 = findViewById(R.id.button58);
        Button button59 = findViewById(R.id.button59);
        Button button60 = findViewById(R.id.button60);

        button55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=spbLYcQwDRw&t=2s"));
                startActivity(Getintent);
            }
        });


        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=B3qjQj2ATWs&t=3s"));
                startActivity(Getintent);

            }
        });

        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=RIN95T2X8QI&t=8s"));
                startActivity(Getintent);

            }
        });

        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=BAmLXJrbeyk&t=5s"));
                startActivity(Getintent);

            }
        });

        button59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=07JdKT0pB14&t=3s"));
                startActivity(Getintent);

            }
        });

        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=2n8VRyelCzQ&t=63s"));
                startActivity(Getintent);

            }
        });
    }
}
