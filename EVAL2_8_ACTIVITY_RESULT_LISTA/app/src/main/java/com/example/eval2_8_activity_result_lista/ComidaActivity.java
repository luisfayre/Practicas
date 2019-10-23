package com.example.eval2_8_activity_result_lista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class ComidaActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    Comida[] cComida = {
            new Comida(),
            new Comida(R.drawable.comida_1,"Hamburgesa","El mejor sason de todo el mundo"),
            new Comida(R.drawable.comida_2,"Carne","La merjor carne de todas"),
            new Comida(R.drawable.comida_3,"Asado","El mejor asado de todos")

    };

    ListView lstClima;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida);

        lstClima = findViewById(R.id.list_comida);

        lstClima.setAdapter(new Adapter_Comida(
                this,
                R.layout.layaut_adapter,
                cComida));
        lstClima.setOnItemClickListener(this);

        intent  = new Intent(this, MainActivity.class);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Toast.makeText(this,cComida[position].getTitulo(), Toast.LENGTH_SHORT).show();

        intent.putExtra("ciudad",cComida[position].getTitulo());
        intent.putExtra("temperatura",cComida[position].getDescrip());
        setResult(Activity.RESULT_OK,intent);
        finish();


    }
}
