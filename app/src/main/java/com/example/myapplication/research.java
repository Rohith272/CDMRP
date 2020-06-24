package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class research extends AppCompatActivity {
    private Button button12;
    private Button button18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research);
        button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openiarp();
            }
        });
        button18 = findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openorp();
            }
        });
    }
    public void openorp() {
        Intent intent32 = new Intent(this, orp.class);
        startActivity(intent32);
    }
    public void openiarp() {
        Intent intent31 = new Intent(this,iarp.class);
        startActivity(intent31);

        }

    }

