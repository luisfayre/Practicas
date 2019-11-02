package com.example.eval2_actionview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText_telefono;
    Button llamar;

    Intent marcar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_telefono = findViewById(R.id.editText_telefono);
        llamar = findViewById(R.id.button);

        //Pantalla de marcacion -->Requiere permisos, la otra no requiere permisos
        //Directo desde la app, No requiere permisos

        //URI similar a la URL

        llamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sTel = "tel:" + editText_telefono.getText().toString();
                marcar = new Intent(Intent.ACTION_CALL, Uri.parse(sTel));
                startActivity(marcar);
            }
        });
    }
}
