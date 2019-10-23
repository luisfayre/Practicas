package com.example.eval1_5_radiogroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioGroup radioButton_comida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButton_comida = findViewById(R.id.radioButton_comida);
        radioButton_comida.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
        String mensaje = null;

        if (checkId == R.id.rb_burritos){
            mensaje = "Burritos";
        }else  if (checkId == R.id.rb_burritos){
            mensaje = "Burritos";
        }
        else  if (checkId == R.id.rb_burritos){
            mensaje = "Burritos";
        }else  if (checkId == R.id.rb_burritos){
            mensaje = "Burritos";
        }



        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();

    }
}
