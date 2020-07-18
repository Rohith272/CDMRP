package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kannur extends AppCompatActivity {
    private Button button108;
    private Button button109;
    private Button button110;
    private Button button111;
    private Button button112;
    private Button button113;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kannur);
        button108 = findViewById(R.id.button108);
        button108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openanthoor();
            }
        });
        button109 = findViewById(R.id.button109);
        button109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openazhikkode();
            }
        });
        button110 = findViewById(R.id.button110);
        button110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openernholi();
            }
        });
        button111 = findViewById(R.id.button111);
        button111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmattanur();
            }
        });
        button112 = findViewById(R.id.button112);
        button112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpariyaram();
            }
        });
        button113 = findViewById(R.id.button113);
        button113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpayyanur();
            }
        });
    }
    public void openpayyanur() {
        Intent intent73 = new Intent(this,pariyaram.class);
        startActivity(intent73);
    }
    public void openpariyaram() {
        Intent intent72 = new Intent(this,pariyaram.class);
        startActivity(intent72);
    }
    public void openmattanur() {
        Intent intent71 = new Intent(this,mattanur.class);
        startActivity(intent71);
    }
    public void openernholi() {
        Intent intent70 = new Intent(this,ernholi.class);
        startActivity(intent70);
    }
    public void openazhikkode() {
            Intent intent69 = new Intent(this,azhikkode.class);
            startActivity(intent69);
        }
    public void openanthoor() {
        Intent intent68 = new Intent(this,anthoor.class);
        startActivity(intent68);
    }
}