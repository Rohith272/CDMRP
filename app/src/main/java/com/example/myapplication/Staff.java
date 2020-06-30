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
    private Button button95;
    private Button button96;
    private Button button97;
    private Button button98;
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
        button95 = findViewById(R.id.button95);
        button95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openphysio();
            }
        });
        button96 = findViewById(R.id.button96);
        button96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openspeech();
            }
        });
        button97 = findViewById(R.id.button97);
        button97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openspecialedu();
            }
        });
        button98 = findViewById(R.id.button98);
        button98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openofficeassi();
            }
        });
    }
    public void openofficeassi() {
        Intent intent59 = new Intent(this,officeassi.class);
        startActivity(intent59);
    }
    public void openspecialedu() {
        Intent intent58 = new Intent(this,specialedu.class);
        startActivity(intent58);
    }
    public void openspeech() {
        Intent intent57 = new Intent(this,speech.class);
        startActivity(intent57);
    }
    public void openphysio() {
        Intent intent56 = new Intent(this,physio.class);
        startActivity(intent56);
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
