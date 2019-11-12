package com.example.eval3_6_banner_post;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tHilo.start();

        banner = findViewById(R.id.imageView_Banner);
        seekBar = findViewById(R.id.seekBar);

        thread.start();

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                switch (i) {
                    case 1:
                        i = 10;
                        break;
                    case 2:
                        i = 9;
                        break;
                    case 3:
                        i = 8;
                        break;
                    case 4:
                        i = 7;
                        break;
                    case 5:
                        i = 6;
                        break;
                    case 6:
                        i = 5;
                        break;
                    case 7:
                        i = 4;
                        break;
                    case 8:
                        i = 3;
                        break;
                    case 9:
                        i = 2;
                        break;
                    case 10:
                        i = 1;
                        break;

                }
                tiempo = i * 300;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
