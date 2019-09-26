package com.example.eval2_extras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button boton;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton   = findViewById(R.id.button);
        editText = findViewById(R.id.editText);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto;
                intent = new Intent(getApplicationContext(),Main2Activity.class);
                texto =  editText.getText().toString();
                intent.putExtra("datos",texto);
                startActivity(intent);
            }
        });
    }
}
