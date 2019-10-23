package com.example.eval2_8_activity_result_lista;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter_Comida extends ArrayAdapter<Comida> {
    Context context;
    int resourse;
    Comida[] cComida;

    public Adapter_Comida(Context context, int resource, Comida[] objects) {
        super(context, resource, objects);

        this.context = context;
        this.resourse = resource;
        this.cComida =objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView img_Comida;
        TextView txt_titulo,txt_desc;
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

        img_Comida = convertView.findViewById(R.id.imagen_view);
        txt_titulo = convertView.findViewById(R.id.txt_nombre);
        txt_desc = convertView.findViewById(R.id.txt_desc);

        img_Comida.setImageResource(cComida[position].getImagen());
        txt_titulo.setText(cComida[position].getTitulo());
        txt_desc.setText(cComida[position].getDescrip());


        return convertView;
    }
}