package com.example.eval1_11_lista_restaurante;

import android.widget.ImageView;

public class Comida {

    private int imagen;
    private String descripcion;
    private String titulo;

    public Comida(int imagen, String descripcion, String titulo) {
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.titulo = titulo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
