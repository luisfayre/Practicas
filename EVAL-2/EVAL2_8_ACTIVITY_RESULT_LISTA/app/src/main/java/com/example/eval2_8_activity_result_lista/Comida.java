package com.example.eval2_8_activity_result_lista;

public class Comida {
    private int imagen;
    private String titulo;
    private String descrip;

    public Comida() {
        imagen = R.drawable.comida_1;
        titulo = "Chihuahua";
        descrip = "El infierno";
    }

    public Comida(int imagen, String titulo, String descrip) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.descrip = descrip;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String clima) {
        this.descrip = descrip;
    }
}