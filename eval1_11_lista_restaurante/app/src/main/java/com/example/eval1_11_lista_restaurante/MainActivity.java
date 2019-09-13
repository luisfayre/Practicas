package com.example.eval1_11_lista_restaurante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lista_items;

    Comida[] comoda_tipo = {
            new Comida(R.drawable.f1, "Comida 1", "Titulo 1"),
            new Comida(R.drawable.f1, "Comida 2", "Titulo 2"),
            new Comida(R.drawable.f1, "Comida 3", "Titulo 3")
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lista_items = findViewById(R.id.lista_items);





    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
