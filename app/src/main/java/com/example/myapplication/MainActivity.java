package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnticipateInterpolator;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    private Button button;
    private Button button5;
    private Button button4;
    private Button button7;
    private Button button6;
    private Button button3;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle =new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpatientportal();
            }
        });
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openadmc();
            }
        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openpstu();
            }
        });
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openflagship();
            }
        });
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentraining();
            }
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openresearch();
            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendisability();
            }
        });

    }
    public  void opendisability() {
        Intent intent12 = new Intent(this,disability.class);
        startActivity(intent12);
    }
    public void openresearch() {
        Intent intent11 = new Intent(this,research.class);
        startActivity(intent11);
    }
    public void opentraining() {
        Intent intent10 = new Intent(this,training.class);
        startActivity(intent10);
    }
    public void openpstu() {
        Intent intent9 = new Intent(this,pstu.class);
        startActivity(intent9);
    }
    public void openpatientportal() {
        Intent intent7 = new Intent(this, patientportal.class);
        startActivity(intent7);
    }
    public void openadmc() {
        Intent intent8 = new Intent(this,admc.class);
        startActivity(intent8);
    }
    public void openflagship() {
        Intent intent9= new Intent(this,flagship.class);
        startActivity(intent9);
    }
    @Override

    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.nav_home:
                break;
            case R.id.nav_abv:
                Intent intent = new Intent(MainActivity.this,ABOUT.class);
                startActivity(intent);
                break;
            case R.id.nav_ocl:
                Intent intent1 = new Intent(MainActivity.this,Clinic.class);
                startActivity(intent1);
                break;
            case R.id.nav_rsc:
                Intent intent2 = new Intent(MainActivity.this,Resource.class);
                startActivity(intent2);
                break;
            case R.id.nav_gal:
                Intent intent3 = new Intent(MainActivity.this,Gallery.class);
                startActivity(intent3);
                break;
            case R.id.nav_cntct:
                Intent intent4 = new Intent(MainActivity.this,Contact.class);
                startActivity(intent4);
                break;
            case R.id.nav_flw:
                Intent intent5 = new Intent(MainActivity.this,follow.class);
                startActivity(intent5);
                break;
            case R.id.nav_staff:
                Intent intent6 = new Intent(MainActivity.this,Staff.class);
                startActivity(intent6);
                break;




        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
