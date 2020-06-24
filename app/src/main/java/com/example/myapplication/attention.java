package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class attention extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attention);
        Button button72 = findViewById(R.id.button72);
        Button button73 = findViewById(R.id.button73);
        Button button74 = findViewById(R.id.button74);
        Button button75 = findViewById(R.id.button75);
        Button button76 = findViewById(R.id.button76);
        Button button77 = findViewById(R.id.button77);
        Button button78 = findViewById(R.id.button78);
        Button button79 = findViewById(R.id.button79);
        Button button80 = findViewById(R.id.button80);

        button72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=878i6drh0hc"));
                startActivity(Getintent);
            }
        });


        button73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=fsfwNU5PGws&t=5s"));
                startActivity(Getintent);

            }
        });

        button74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=lhp72vrcX-0&t=2s"));
                startActivity(Getintent);

            }
        });

        button75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=7BF_rRnLvUo&t=14s"));
                startActivity(Getintent);

            }
        });

        button76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=goi5_DjVZX8&t=30s"));
                startActivity(Getintent);

            }
        });

        button77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Jf7JVJSbUwQ&t=12s"));
                startActivity(Getintent);

            }
        });
        button78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=0dUmvqNH0bI"));
                startActivity(Getintent);

            }
        });
        button79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=LrHe20gCtpo"));
                startActivity(Getintent);

            }
        });
        button80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=8d3G1eveQVo"));
                startActivity(Getintent);

            }
        });

    }
}
