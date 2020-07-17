package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Clinic extends AppCompatActivity {
    private Button button99;
    private Button button102;
    private Button button103;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinic);
        button99 = findViewById(R.id.button99);
        button99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmalappuram();
            }
        });
        button102 = findViewById(R.id.button102);
        button102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openkozhikode();
            }
        });
        button103 = findViewById(R.id.button103);
        button103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openkannur();
            }
        });
    }
    public void openkannur() {
        Intent intent66 = new Intent(this,kannur.class);
        startActivity(intent66);
    }
    public void openkozhikode() {
        Intent intent65 = new Intent(this,kozhikode.class);
        startActivity(intent65);
    }
    public void openmalappuram(){
        Intent intent61 = new Intent(this,malappuram.class);
        startActivity(intent61);
    }
}
