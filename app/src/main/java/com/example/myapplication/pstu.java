package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pstu extends AppCompatActivity {
    private Button button8;
    private Button button9;
    private Button button10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pstu);
        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openintrdctn();
            }
        });
        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensa();
            }
        });
        button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlbvrp();
            }
        });
    }
    public void openlbvrp() {
        Intent intent22 = new Intent(this,lbvrp.class);
        startActivity(intent22);
    }
    public void opensa() {
        Intent intent21 = new Intent(this,sa.class);
        startActivity(intent21);
    }
    public void openintrdctn() {
        Intent intent20 = new Intent(this,intrdctn.class);
        startActivity(intent20);
    }
}
