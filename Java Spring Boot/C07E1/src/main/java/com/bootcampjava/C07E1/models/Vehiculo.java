package com.bootcampjava.C07E1.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Vehiculo {
    private static Long contadorId = 3L;
    private Long id;
    private String marca;
    private String modelo;
    private int kilometros;
    private int puertas;
    private double precio;

    public Vehiculo(String marca, String modelo, int kilometros, int puertas, double precio) {
        this.id = ++contadorId;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
        this.puertas = puertas;
        this.precio = precio;
    }
}

