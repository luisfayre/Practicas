package com.example.eval3_2_handelrs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView texto;
    Thread tHilo;
    //HANDLER

    Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            //AQUI YA SE PUEDE INTERACTURAR CON LA INTERFAZ GRAFICA
            //ESTAMOS EN EL HILO PRINCIPAL
            String mensa = (String) msg.obj;
            texto.append(mensa);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.txtMensaje);

        tHilo = new Thread(){
            @Override
            public void run() {
                super.run();
                int i = 0;
                while(true){
                    try {
                        Thread.sleep(500);
                        String sCade = "\n " + i;
                        Message msg = handler.obtainMessage(1, sCade);
                        handler.sendMessage(msg);
                        Log.wtf("Hilo", sCade);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                    i++;
                }
            }
        };
        tHilo.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
