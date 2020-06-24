package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resource extends AppCompatActivity {
    private Button button33;
    private Button button34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource);
        button33 = findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhomeprogram();
            }
        });
        button34 = findViewById(R.id.button34);
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendaily();
            }
        });
    }
    public void opendaily() {
        Intent intent43 = new Intent(this,daily.class);
        startActivity(intent43);
    }
    public void openhomeprogram() {
        Intent intent33 = new Intent(this,homeprogram.class);
        startActivity(intent33);
    }
}
