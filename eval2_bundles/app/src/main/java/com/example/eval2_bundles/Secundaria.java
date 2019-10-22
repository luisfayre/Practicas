package com.example.eval2_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        textView = findViewById(R.id.textView);
        textView.append(bundle.getString("nombre") + "");
        textView.append(bundle.getString("apellido") + "");
        textView.append(bundle.getString("edad") + "");

        switch (bundle.getInt("sexo")){
            case 1:
            textView.append("Mucho");
            break;
            case 2:
                textView.append("Maso");
                break;
            case 3:
                textView.append("Poco");
                break;
            default:
                textView.append("Isc");
                break;

        }
    }
}
