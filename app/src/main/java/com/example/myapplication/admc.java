package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class admc extends AppCompatActivity {
    private Button intro;
    private Button services;
    private Button units;
    private Button practices;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admc);
        intro = findViewById(R.id.intro);
        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openintroabtcen();
            }
        });
        services = findViewById(R.id.services);
        services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openservices();
            }
        });
        units = findViewById(R.id.units);
        units.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openspecialunit();
            }
        });
        practices = findViewById(R.id.practices);
        practices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbpp();
            }
        });

    }
    public void openbpp() {
        Intent intent19 = new Intent(this,bpp.class);
        startActivity(intent19);
    }
    public void openspecialunit() {
        Intent intent18 = new Intent(this,specialunit.class);
        startActivity(intent18);
    }
    public void openservices() {
        Intent intent17 = new Intent(this,servicespage.class);
        startActivity(intent17);
    }
    public void openintroabtcen() {
        Intent intent16 = new Intent(this,introabtcen.class);
        startActivity(intent16);
    }
}
