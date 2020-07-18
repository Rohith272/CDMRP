package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kozhikode extends AppCompatActivity {
    Button button107;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kozhikode);
        button107 = findViewById(R.id.button107);
        button107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openthiruvagoor();
            }
        });
    }
    public void openthiruvagoor() {
        Intent intent67 = new Intent(this,thiruvagoor.class);
        startActivity(intent67);
    }
}