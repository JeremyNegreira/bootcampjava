package com.bootcampjava.C05E1.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Data
public class Calificacion {

    private static Long contadorId = 0L;
    private Long id;
    private Double calificacion1;
    private Double calificacion2;
    private Double calificacion3;
    private Double promedio;

    public Calificacion(Double calificacion1, Double calificacion2, Double calificacion3) {
        this.id = ++contadorId;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
        this.promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }
}
