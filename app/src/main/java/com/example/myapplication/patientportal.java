package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class patientportal extends AppCompatActivity {
    private Button button101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientportal);
        button101 = findViewById(R.id.button101);
        button101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openregister();
            }
        });
    }
    public void openregister(){
        Intent intent60 = new Intent(this,register.class);
        startActivity(intent60);
    }
}
