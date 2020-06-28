package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Staff extends AppCompatActivity {
    private Button button90;

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
    }
    public void opendirectors() {
        Intent intent90 = new Intent(this,directors.class);
        startActivity(intent90);
    }
}
