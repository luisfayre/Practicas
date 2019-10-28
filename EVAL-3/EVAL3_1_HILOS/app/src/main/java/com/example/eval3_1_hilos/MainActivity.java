package com.example.eval3_1_hilos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView text;
    Thread thread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        text = findViewById(R.id.textView);

        thread= new Thread(){
            @Override
            public void run() {
                super.run();

                for (int i = 0; i <10; i++) {
                    try {
                        text.setText("i" + i);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                }
            }
        };
        
        /**Star: Isa el metodo run que acavamos de sobreescribir en otro hilo aparte.
         * Run: Ejecuta el metodo run en el mosmo hilo de ejecicuin.
         * */
        //thread.start();
        thread.start();

        //Thereads con el Runnable (interface)
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10; i++) {
                    try {
                        text.setText("i"+i);
                        Thread.sleep(1000);
                        //Log.wtf("hilo","asd");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Funcionando", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        thread.interrupt();
    }
}
