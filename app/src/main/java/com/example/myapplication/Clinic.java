package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Clinic extends AppCompatActivity {
    private Button button99;
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
    }
    public void openmalappuram(){
        Intent intent61 = new Intent(this,malappuram.class);
        startActivity(intent61);
    }
}
