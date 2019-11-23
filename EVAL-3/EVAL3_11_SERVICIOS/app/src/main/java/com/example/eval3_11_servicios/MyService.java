package com.example.eval3_11_servicios;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;



/**
 *
 * Servicio --> Salir a la actividad.
 *          Ejecutar tareas en segundo plano.
 *
 * */


public class MyService extends Service {

    Thread thread;

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.wtf("Myservices","onCreate");
        //AQUI HACE EL TRABAJO DEL SERVICIO
        //CUALQUIER PROCESO EXTENSO DEBE USAR UN THREAD
        new Thread(){
            @Override
            public void run() {
                super.run();
                while (true){
                    try {
                        Thread.sleep(500);
                        Log.wtf("Myservice","Tarea en segundo plano");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.wtf("Myservices","onDestroy");
        thread.interrupt();
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }



    /**
     *
     * Servicio --> BroadcastReciber --> Actividad
     *
     * */


}
