package FINAL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase abstracta que representa un destino vacacional.
 */
abstract class Destino {
    private String nombre;
    private double costo;

    public Destino(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return "Destino: " + nombre + ", Costo: $" + costo;
    }
}

/**
 * Clase que representa un destino en una ciudad.
 */
class DestinoCiudad extends Destino {
    private String ciudad;

    public DestinoCiudad(String nombre, double costo, String ciudad) {
        super(nombre, costo);
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ciudad: " + ciudad;
    }
}

/**
 * Clase que representa un destino en una playa.
 */
class DestinoPlaya extends Destino {
    private String playa;

    public DestinoPlaya(String nombre, double costo, String playa) {
        super(nombre, costo);
        this.playa = playa;
    }

    public String getPlaya() {
        return playa;
    }

    @Override
    public String toString() {
        return super.toString() + ", Playa: " + playa;
    }
}

