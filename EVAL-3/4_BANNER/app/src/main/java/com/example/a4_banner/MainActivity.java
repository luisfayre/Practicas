package com.example.a4_banner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView banner;
    SeekBar seekBar;
    int tiempo = 500;
    int iCont = 0;

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
