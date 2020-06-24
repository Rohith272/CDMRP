package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class flagship extends AppCompatActivity {
    private Button button11;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flagship);
        button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openddp();
            }
        });
        button13 = findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmfp();
            }
        });
        button14 = findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openaquafit();
            }
        });
        button15 = findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openragam();
            }
        });
        button16 = findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencbld();
            }
        });
        button17 = findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlifeskilltraining();
            }
        });
    }
    public void openlifeskilltraining() {
        Intent intent28 = new Intent(this,lifeskilltraining.class);
        startActivity(intent28);
    }
    public void opencbld() {
        Intent intent27 = new Intent(this,cbld.class);
        startActivity(intent27);
    }
    public void openragam() {
        Intent intent26 = new Intent(this,ragam.class);
        startActivity(intent26);
    }
    public void openaquafit() {
        Intent intent25 = new Intent(this,aquafit.class);
        startActivity(intent25);
    }
    public void openmfp(){
        Intent intent24 = new Intent(this,mfp.class);
        startActivity(intent24);
    }
    public void openddp() {
        Intent intent23 = new Intent(this,ddp.class);
        startActivity(intent23);
    }
}
