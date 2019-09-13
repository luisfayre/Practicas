package com.example.eval1_9_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener{
    String[] animal = {"Perro",
            "Perro1",
            "Perro2",
            "Perro3",
            "Perro4",
            "Perro5",
            "Perro6",
            "Perro7",
            "Perro8",
            "Perro9",
            "Perro10"

    };

    ListView lista;
    TextView texto_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.list_view_datos);
        texto_ = findViewById(R.id.texto_);

        lista.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,animal));
        lista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        texto_.setText(animal[position]);
    }
}
