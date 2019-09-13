package com.example.eval1_4_eventos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button por_int;
    Button btn_clase_anonima;
    Button btn_clase_externa;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        por_int = findViewById(R.id.btn_int);
        btn_clase_anonima = findViewById(R.id.btn_clase_anonima);
        btn_clase_externa = findViewById(R.id.btn_clase_externa);

        por_int.setOnClickListener(this);
        btn_clase_anonima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Anonima", Toast.LENGTH_LONG).show();
            }
        });

        eventosClick eve_clic = new eventosClick();
        eve_clic.setContext(this);
        btn_clase_externa.setOnClickListener(eve_clic);

    }

    public void miClick(View v) {
        Toast.makeText(this, "Por XML", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Por Listener", Toast.LENGTH_SHORT).show();
    }

}
