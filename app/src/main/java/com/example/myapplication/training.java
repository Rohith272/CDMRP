package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class training extends AppCompatActivity {
    private Button button20;
    private Button button21;
    private Button button22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
        button20 = findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openiatp();
            }
        });
        button21 = findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openuctp();
            }
        });
        button22 = findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openrtp();
            }
        });
    }
    public void openrtp() {
        Intent intent30 = new Intent(this,rtp.class);
        startActivity(intent30);
    }
    public void openuctp() {
        Intent intent29 = new Intent(this,uctp.class);
        startActivity(intent29);
    }
    public void openiatp() {
        Intent intent28 = new Intent(this,iatp.class);
        startActivity(intent28);
    }
}
