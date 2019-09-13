package com.example.eval1_11_lista_restaurante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    Comida[] cComida = {
            new Comida(),
            new Comida(R.drawable.comida_1,"Hamburgesa","El mejor sason de todo el mundo"),
            new Comida(R.drawable.comida_2,"Carne","La merjor carne de todas"),
            new Comida(R.drawable.comida_3,"Asado","El mejor asado de todos")

    };

    ListView lstClima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstClima = findViewById(R.id.list_comida);

        lstClima.setAdapter(new Adapter_Comida(
                this,
                R.layout.layaut_adapter,
                cComida));
        lstClima.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Toast.makeText(this,cComida[position].getTitulo(), Toast.LENGTH_SHORT).show();

    }
}
