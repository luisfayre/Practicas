package com.example.eval2_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText nombre,apellido,edad;
    RadioGroup radioGroup;
    Button button;
    Intent inDatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.editText_nombre);
        apellido = findViewById(R.id.editText_apellido);
        edad = findViewById(R.id.editText_edad);
        radioGroup = findViewById(R.id.radioButton);
        button = findViewById(R.id.button);

        inDatos = new Intent(getApplicationContext(),Secundaria.class);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("nombre",nombre.getText().toString());
                bundle.putString("apellido",apellido.getText().toString());
                int iEdad = Integer.parseInt(edad.getText().toString());
                bundle.putInt("edad",iEdad);
                int iSexo;
                if (radioGroup.getCheckedRadioButtonId() == R.id.radioButton_mucho){
                    iSexo = 1;
                }else if(radioGroup.getCheckedRadioButtonId() == R.id.radioButtonmaso){
                    iSexo = 2;
                }else if(radioGroup.getCheckedRadioButtonId() == R.id.radioButton_poc){
                    iSexo = 3;
                }else{
                    iSexo = 4;
                }

                bundle.putInt("sexo",iSexo);
                inDatos.putExtras(bundle);
                startActivity(inDatos);
            }
        });

    }
}
