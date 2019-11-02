package com.example.eval2_8_activity_result_lista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ClimaActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    Clima[] cCiudades = {
            new Clima(),
            new Clima(R.drawable.atmospher,"Aldama",25,"Chido"),
            new Clima(R.drawable.atmospher,"Delecias",30,"Chido"),
            new Clima(R.drawable.atmospher,"Camargo",40,"Chido"),
            new Clima(R.drawable.atmospher,"Juarez",50,"Chido"),
            new Clima(R.drawable.atmospher,"Cuahtécon",25,"Chido"),
            new Clima(R.drawable.atmospher,"Parral",25,"Chido"),
            new Clima(R.drawable.atmospher,"Meoqui",25,"Chido"),
            new Clima(R.drawable.atmospher,"Aldama",25,"Chido"),
            new Clima(R.drawable.atmospher,"Aldama",25,"Chido"),
            new Clima(R.drawable.atmospher,"Aldama",25,"Chido")

    };

    ListView lstClima;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clima);

        lstClima = findViewById(R.id.lista);

        lstClima.setAdapter(new ClimaAdaptador(
                this,
                R.layout.layout_clima,
                cCiudades));
        lstClima.setOnItemClickListener(this);

        intent  = new Intent(this, MainActivity.class);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        Toast.makeText(this,cCiudades[position].getCiudad(), Toast.LENGTH_SHORT).show();


        intent.putExtra("ciudad",cCiudades[position].getCiudad());
        intent.putExtra("temperatura",cCiudades[position].getTemp());
        intent.putExtra("clima",cCiudades[position].getClima());

        setResult(Activity.RESULT_OK,intent);
        finish();

       // startActivity(intent);

    }

}
