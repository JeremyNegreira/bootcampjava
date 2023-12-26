package com.bootcampjava.C05E1.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CalificacionDTO implements Serializable {

    private Long id;
    private String nombreEstudiante;
    private Double calificacion1;
    private Double calificacion2;
    private Double calificacion3;
    private Double promedio;
}