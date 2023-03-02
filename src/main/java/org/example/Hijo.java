package org.example;

public class Hijo extends Padre {

    private String nombre;

    public Hijo() {
    }

    public Hijo(String nombre, Long fortuna, String nombre1) {
        super(nombre, fortuna);
        this.nombre = nombre1;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
