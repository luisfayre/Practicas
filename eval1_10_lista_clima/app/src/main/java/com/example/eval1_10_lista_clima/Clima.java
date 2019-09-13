package com.example.eval1_10_lista_clima;

public class Clima {
    private int imagen;
    private String ciudad;
    private double temp;
    private String clima;

    public Clima(int atmospher, String aldama, int i, String chido) {
        this.imagen = R.drawable.sunny;
        this.ciudad = ciudad;
        this.temp = temp;
        this.clima = clima;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }
}
