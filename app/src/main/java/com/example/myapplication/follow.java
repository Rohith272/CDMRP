package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class follow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow);
        Button button86 = findViewById(R.id.button86);
        Button button87 = findViewById(R.id.button87);
        Button button88 = findViewById(R.id.button88);
        Button button89 = findViewById(R.id.button89);
        button86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/cdmrpuoc/"));
                startActivity(Getintent);
            }
        });
        button87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/c_d_m_r_p?igshid=1ig01an9q32bt"));
                startActivity(Getintent);
            }
        });
        button88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/company/cdmrp"));
                startActivity(Getintent);
            }
        });
        button89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Getintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCsCJMZzFSIUIAKw00A66ZaQ"));
                startActivity(Getintent);
            }
        });


    }
}
