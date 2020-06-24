package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class homeprogram extends AppCompatActivity {
    private Button button37;
    private Button button38;
    private Button button39;
    private Button button40;
    private Button button41;
    private Button button42;
    private Button button43;
    private Button button44;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeprogram);
        button37 = findViewById(R.id.button37);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencovid19();
            }
        });
        button38 = findViewById(R.id.button38);
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendaily();
            }
        });
        button39 = findViewById(R.id.button39);
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbehaviour();
            }
        });
        button40 = findViewById(R.id.button40);
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openspeechtherapy();
            }
        });
        button41 = findViewById(R.id.button41);
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openphysiotherapy();
            }
        });
        button42 = findViewById(R.id.button42);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openoccupational();
            }
        });
        button43 = findViewById(R.id.button43);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openattention();
            }
        });
        button44 = findViewById(R.id.button44);
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlearning();
            }
        });

    }
    public void openlearning() {
        Intent intent50 = new Intent(this,learnning.class);
        startActivity(intent50);
    }
    public void openattention() {
        Intent intent49 = new Intent(this,attention.class);
        startActivity(intent49);
    }
    public void openoccupational() {
        Intent intent48 = new Intent(this,occupational.class);
        startActivity(intent48);
    }
    public void openspeechtherapy() {
        Intent intent46 = new Intent(this,speechtherapy.class);
        startActivity(intent46);
    }
    public void openphysiotherapy() {
        Intent intent47 = new Intent(this,physiotherapy.class);
        startActivity(intent47);
        }
    public void openbehaviour() {
        Intent intent45 = new Intent(this,behaviour.class);
        startActivity(intent45);
    }
    public void opendaily()  {
        Intent intent44 = new Intent(this,daily.class);
        startActivity(intent44);
    }
    public void opencovid19() {
        Intent intent41 = new Intent(this,covid19.class);
        startActivity(intent41);
    }

}
