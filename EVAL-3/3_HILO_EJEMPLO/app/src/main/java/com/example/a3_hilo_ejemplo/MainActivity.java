package com.example.a3_hilo_ejemplo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    ImageView imagen;
    String URL = "https://wallpapersinbox.files.wordpress.com/2011/11/google-wallpaper-02.jpg";
    Bitmap bitmap;

    Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            imagen.setImageBitmap(bitmap);
        }
    };

    Thread hilo = new Thread(){
        @Override
        public void run() {
            super.run();
            bitmap = cargarImagen(URL);
            Message msg = handler.obtainMessage();
            handler.sendMessage(msg);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen = findViewById(R.id.image);

        hilo.start();

    }

    private Bitmap cargarImagen(String url){
        Bitmap imagen = null;
        try {
            InputStream inputStream = (InputStream) new URL(url).getContent();
            imagen = BitmapFactory.decodeStream(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imagen;
    }


}
