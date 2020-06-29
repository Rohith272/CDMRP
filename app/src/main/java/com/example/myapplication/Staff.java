package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Staff extends AppCompatActivity {
    private Button button90;
    private Button button91;

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
