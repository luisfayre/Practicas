package com.example.eval1_4_eventos;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class eventosClick implements View.OnClickListener {
    private Context context;

    @Override
    public void onClick(View view) {
        Toast.makeText(context, "Externo", Toast.LENGTH_LONG).show();
    }
    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
