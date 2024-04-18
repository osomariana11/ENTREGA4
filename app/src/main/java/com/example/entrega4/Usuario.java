package com.example.entrega4;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Usuario {
    private String nombre;
    private String correo;
    private String carrera;

    public Usuario() {
    }

    public Usuario(String nombre, String correo, String carrera) {
        this.nombre = nombre;
        this.correo = correo;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCarrera() {
        return carrera;
    }
}
