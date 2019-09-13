package com.example.eval1_11_lista_restaurante;

import android.content.Context;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class Adapter_Comida extends AdapterView {
    Context context;
    int resourse;
    Comida[] comida;

    public Adapter_Comida(Context context, Context context1, int resourse, Comida[] comida) {
        super(context);
        this.context = context1;
        this.resourse = resourse;
        this.comida = comida;
    }

    @Override
    public Adapter getAdapter() {

        return null;
    }

    @Override
    public void setAdapter(Adapter adapter) {

    }

    @Override
    public View getSelectedView() {
        return null;
    }

    @Override
    public void setSelection(int i) {

    }
}
