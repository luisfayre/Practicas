package com.example.eval3_9_asynk_task_banner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Message;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtMostrar;

    ImageView banner;
    SeekBar seekBar;
    int tiempo = 500;
    int iCont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //txtMostrar = findViewById(R.id.txtmostrar);

        banner = findViewById(R.id.imageView_Banner);
        seekBar = findViewById(R.id.seekBar);

        MiclaseAsin miclaseAsin = new MiclaseAsin();
        miclaseAsin.execute();
    }

    class MiclaseAsin extends AsyncTask<Integer,String,String> {

        //TODO TODOS PUEDEN INTERACTUAR CON LA INTERFAZ GRAFICA EXCEPTO EL doInBackground

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            txtMostrar.setText("INICIO DE LA CALSE ASYN");

        }
        @Override
        protected String doInBackground(Integer... integers) {
            int iVeces = integers[0];
            int iDemora = integers[1];

            while (true) {
                try {
                    Thread.sleep(tiempo);
                    publishProgress(""+ i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i=0; i < iVeces; i++){
                try {
                    Thread.sleep(iDemora);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            return "FIN DE LA ASYNCRONA";
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);
            txtMostrar.setText(values[0]);

        }
        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            txtMostrar.append(s);

        }
    }
}
