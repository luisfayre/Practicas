package com.example.eval2_mensaje;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.nio.channels.InterruptedByTimeoutException;

public class MainActivity extends AppCompatActivity {

    EditText telefono, mensaje;
    Button enviar;
Intent sms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        telefono = findViewById(R.id.telefono);
        mensaje = findViewById(R.id.texto);
        enviar   = findViewById(R.id.enviar);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sTel = "smsto:"+ telefono.getText().toString();
                sms = new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel));

                sms.putExtra("sms_body", mensaje.getText().toString());

                startActivity(sms);
            }
        });

    }
}
