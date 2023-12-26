package com.bootcampjava.C06E1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ingrediente {

    private Long codigoIngrediente;
    private String nombre;
    private Double cantidadCalorias;
}
