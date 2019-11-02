package com.example.eval1_10_lista_clima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    Clima[] cCiudades = {
            new Clima(),
            new Clima(R.drawable.atmospher,"Aldama",25,"Chido"),
            new Clima(R.drawable.atmospher,"Aldama",25,"Chido"),
            new Clima(R.drawable.atmospher,"Aldama",25,"Chido"),
            new Clima(R.drawable.atmospher,"Aldama",25,"Chido"),
            new Clima(R.drawable.atmospher,"Aldama",25,"Chido"),
            new Clima(R.drawable.atmospher,"Aldama",25,"Chido"),
            new Clima(R.drawable.atmospher,"Aldama",25,"Chido"),
            new Clima(R.drawable.atmospher,"Aldama",25,"Chido"),
            new Clima(R.drawable.atmospher,"Aldama",25,"Chido"),
            new Clima(R.drawable.atmospher,"Aldama",25,"Chido")

    };

    ListView lstClima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstClima = findViewById(R.id.lista);

        lstClima.setAdapter(new climaAdaptador(
                this,
                R.layout.layout_clima,
                cCiudades));
        lstClima.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
     Toast.makeText(this,cCiudades[position].getCiudad(), Toast.LENGTH_SHORT).show();

    }
}
