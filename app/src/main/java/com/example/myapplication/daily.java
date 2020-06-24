package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class daily extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily);
        Button button45 = findViewById(R.id.button45);
        Button button46 = findViewById(R.id.button46);
        Button button50 = findViewById(R.id.button50);
        Button button51 = findViewById(R.id.button51);
        Button button52 = findViewById(R.id.button52);
        Button button53 = findViewById(R.id.button53);

        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=iA0zx5qrNps"));
                startActivity(Getintent);
            }
        });


        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=CdbyvaKP6RI&t=20s"));
                startActivity(Getintent);

            }
        });

        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=7rtfsij_Osk&t=2s"));
                startActivity(Getintent);

            }
        });

        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=IKiRVitrEWU&pbjreload=10"));
                startActivity(Getintent);

            }
        });

        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=VcmXw2mK6K8&t=29s"));
                startActivity(Getintent);

            }
        });

        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jCITVp8WNZk&t=30s"));
                startActivity(Getintent);

            }
        });
    }
}

