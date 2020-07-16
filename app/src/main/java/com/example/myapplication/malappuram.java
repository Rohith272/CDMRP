package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class malappuram extends AppCompatActivity {
    private Button button104;
    private Button button105;
    private Button button106;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malappuram);
        button104 = findViewById(R.id.button104);
        button104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openanakkayam();
            }
        });
        button105 = findViewById(R.id.button105);
        button105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openkaruvarakund();
            }
        });
        button106 = findViewById(R.id.button106);
        button106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openthanalur();
            }
        });
    }
    public void openthanalur(){
        Intent intent64 = new Intent(this,thanalur.class);
        startActivity(intent64);
    }
    public void openkaruvarakund(){
        Intent intent63 = new Intent(this,karuvarakund.class);
        startActivity(intent63);
    }

    public void openanakkayam() {
        Intent intent62 = new Intent(this, anakkayam.class);
        startActivity(intent62);
    }
}