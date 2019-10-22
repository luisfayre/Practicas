package com.example.eval2_8_activity_result_lista;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ClimaAdaptador extends ArrayAdapter<Clima> {
Context context;
int resourse;
Clima[] cCiudades;

    public ClimaAdaptador(Context context, int resource, Clima[] objects) {
        super(context, resource, objects);

        this.context = context;
        this.resourse = resource;
        this.cCiudades =objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imgClima;
        TextView txtCiudad,txtTemp,txtClima;
        //CONVERTVIEW ES LAYOUT QUE PRESENTA UNA FILA EN LA LISTA
        if (convertView == null){
            //CREAR NUESTRO LAYOUT
            //INFLATER
            //LayoutInflater lInflator = ((Activity)context).getLayoutInflater();
            //convertView = lInflator.inflate(R.layout.layout_clima,parent,false);

            LayoutInflater llInflator = ((Activity)context).getLayoutInflater();
            convertView = llInflator.inflate(resourse, parent, false);

            //convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_clima, parent, false);
        }

        imgClima = convertView.findViewById(R.id.imagen_clima);
        txtCiudad = convertView.findViewById(R.id.ciudad);
        txtTemp = convertView.findViewById(R.id.temperatura);
        txtClima = convertView.findViewById(R.id.estado);

        imgClima.setImageResource(cCiudades[position].getImagen());
        txtCiudad.setText(cCiudades[position].getCiudad());
        txtTemp.setText(cCiudades[position].getTemp() +" C");
        txtClima.setText(cCiudades[position].getClima());


        return convertView;
    }
}
