package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class physiotherapy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physiotherapy);
        Button button61 = findViewById(R.id.button61);
        Button button62 = findViewById(R.id.button62);
        Button button63 = findViewById(R.id.button63);
        Button button64 = findViewById(R.id.button64);
        Button button65 = findViewById(R.id.button65);
        Button button66 = findViewById(R.id.button66);
        Button button67 = findViewById(R.id.button67);
        Button button68 = findViewById(R.id.button68);
        Button button69 = findViewById(R.id.button69);
        Button button70 = findViewById(R.id.button70);


        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jtEbDCVuvnY"));
                startActivity(Getintent);
            }
        });


        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=sP9vtEtOj48&t=12s"));
                startActivity(Getintent);

            }
        });

        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=yTpf1P_kTDA"));
                startActivity(Getintent);

            }
        });

        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("hhttps://www.youtube.com/watch?v=rblOjLivsls"));
                startActivity(Getintent);

            }
        });

        button65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=bk_IsscgLf0"));
                startActivity(Getintent);

            }
        });

        button66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=WahFZEWuuCo&t=10s"));
                startActivity(Getintent);

            }
        });
        button67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=wcFagQ5N2EM&t=8s"));
                startActivity(Getintent);

            }
        });
        button68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=yCYtqQCk2RI&pbjreload=10"));
                startActivity(Getintent);

            }
        });
        button69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=qTqCaO3AAnA"));
                startActivity(Getintent);

            }
        });
        button70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=zTCqtsSvoJY&t=120s"));
                startActivity(Getintent);

            }
        });

    }
}
