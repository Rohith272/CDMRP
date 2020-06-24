package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class covid19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid19);

        Button button47 = findViewById(R.id.button47);
        Button button48 = findViewById(R.id.button48);
        Button button49 = findViewById(R.id.button49);

        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=W9vvaRBPEMw"));
                startActivity(Getintent);
            }
        });


        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=kzw0eLRR9dw&t=11s"));
                startActivity(Getintent);

            }
        });

        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=6TekH5MP64E"));
                startActivity(Getintent);

            }
        });
    }
}
