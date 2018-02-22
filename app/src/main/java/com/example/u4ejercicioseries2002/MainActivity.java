package com.example.u4ejercicioseries2002;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnNuevaSerie (View view){
        Intent i = new Intent(getApplicationContext(),FormularioActivity.class);
        startActivity(i);
    }

    public void btnVerSeries (View view){
        Intent i = new Intent(getApplicationContext(),ListaSeriesActivity.class);
        startActivity(i);

    }
}
