package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class disability extends AppCompatActivity {
    private Button button23;
    private Button button24;
    private Button button25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disability);
        button23 = findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpgd();
            }
        });
        button24 = findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openshortterm();
            }
        });
        button25 = findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openonline();
            }
        });
    }
    public  void openonline(){
        Intent intent15 = new Intent(this,online.class);
        startActivity(intent15);
    }
    public void openshortterm() {
        Intent intent14 = new Intent(this,shortterm.class);
        startActivity(intent14);
    }
    public void openpgd() {
        Intent intent13 = new Intent(this,pgd.class);
        startActivity(intent13);
    }
}
