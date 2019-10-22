package com.example.eval2_8_activity_result_lista;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnClima,btnRestaurante;
    TextView txtCiudad,txtTemperatura,txtClima;
    final int RESULT_CODE = 100;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClima = findViewById(R.id.button);
        btnRestaurante = findViewById(R.id.button2);

        txtCiudad = findViewById(R.id.textView);

        intent  = new Intent(this, ClimaActivity.class);


        btnClima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(intent, RESULT_CODE);
                //startActivity(intent);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case RESULT_CODE:
                //Algunos con los datos
                if(resultCode == Activity.RESULT_OK){
                    //Aqui recibimos datos
                    txtCiudad.setText(data.getStringExtra("ciudad"));
                }else {
                    Toast.makeText(this, "ACCION CANSELADA", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
        }
    }
}
