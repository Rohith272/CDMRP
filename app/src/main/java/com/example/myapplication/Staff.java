package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Staff extends AppCompatActivity {
    private Button button90;
    private Button button91;
    private Button button92;
    private Button button93;
    private Button button94;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);
        button90 = findViewById(R.id.button90);
        button90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendirectors();
            }
        });
        button91 = findViewById(R.id.button91);
        button91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendmo();
            }
        });
        button92 = findViewById(R.id.button92);
        button92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendp();
            }
        });
        button93 = findViewById(R.id.button93);
        button93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencclo();
            }
        });
        button94 = findViewById(R.id.button94);
        button94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openot();
            }
        });
    }
    public void openot() {
        Intent intent55 = new Intent(this,ot.class);
        startActivity(intent55);
    }
    public void opencclo() {
        Intent intent54 = new Intent(this,cclo.class);
        startActivity(intent54);
    }
    public void opendp() {
        Intent intent53 = new Intent(this,dp.class);
        startActivity(intent53);
    }
    public void opendmo() {
        Intent intent52 = new Intent(this,dmo.class);
        startActivity(intent52);
    }
    public void opendirectors() {
        Intent intent51 = new Intent(this,directors.class);
        startActivity(intent51);
    }
}
