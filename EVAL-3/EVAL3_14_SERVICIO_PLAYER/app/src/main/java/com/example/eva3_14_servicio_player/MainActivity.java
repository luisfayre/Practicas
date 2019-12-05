package com.example.eva3_14_servicio_player;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent miRolita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miRolita = new Intent(getApplicationContext(), MyService.class);
    }

    public void reproducir(View v) {
        startService(miRolita);
    }

    public void finalizar(View v) {
        stopService(miRolita);
    }
}
