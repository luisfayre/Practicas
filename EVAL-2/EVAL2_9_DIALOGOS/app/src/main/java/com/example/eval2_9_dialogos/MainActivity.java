package com.example.eval2_9_dialogos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.my_dialog);
                //VINCULAR LOS WIDGETS DEL CUADRO DE DIALOGO

                final EditText editText;
                Button btnOck;
                editText = dialog.findViewById(R.id.editText);
                btnOck = dialog.findViewById(R.id.button3);

                btnOck.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String sCade = editText.getText().toString();
                        Toast.makeText(getApplicationContext(), sCade, Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Cuadro de dialogo estandar")
                        .setMessage("Hola mundo curel!!!")
                        .setPositiveButton("Aceptar",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Toast.makeText(getApplicationContext(), "Boton Ok", Toast.LENGTH_SHORT).show();
                                    }
                                })
                        .setNegativeButton("No",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Toast.makeText(getApplicationContext(), "Boton No", Toast.LENGTH_SHORT).show();
                                    }
                                })
                        .setNeutralButton("Cancelar",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Toast.makeText(getApplicationContext(), "Boton Cancelar", Toast.LENGTH_SHORT).show();
                                    }
                                }).create().show();

            }
        });

    }


}
