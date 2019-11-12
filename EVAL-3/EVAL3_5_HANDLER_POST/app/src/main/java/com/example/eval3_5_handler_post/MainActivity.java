package com.example.eval3_5_handler_post;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView txtMensaje;
    ImageView banner;
    SeekBar seekBar;
    int tiempo = 500;
    int iCont = 0;

    Handler handler = new Handler();
    //AQUI NO POEMOS MODIFICAR LA UI

    Thread tHilo = new Thread(){
        @Override
        public void run() {
            super.run();
            while (true){
                try {
                    Thread.sleep(500);
                    handler.post(rModificarUi);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    Runnable rModificarUi = new Runnable() {
        @Override
        public void run() {
            //AQUI VA EL TRABAJAO DE MODOFICAR LA UI
            txtMensaje.append("Hola Mundo");
            txtMensaje.append("\n");
        }
    };

    Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            switch (iCont) {
                case 0:
                    banner.setImageResource(R.drawable.cloudy);
                    iCont++;
                    break;
                case 1:
                    banner.setImageResource(R.drawable.snow);
                    iCont++;
                    break;
                case 2:
                    banner.setImageResource(R.drawable.sunny);
                    iCont++;
                    break;
                default:
                    iCont = 0;
            }
        }
    };

    Thread thread = new Thread(){
        @Override
        public void run() {
            super.run();

            while (true) {
                try {
                    Thread.sleep(tiempo);
                    Message msg = handler.obtainMessage();
                    handler.sendMessage(msg);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tHilo.start();
       txtMensaje = findViewById(R.id.prueba);
    }
}
