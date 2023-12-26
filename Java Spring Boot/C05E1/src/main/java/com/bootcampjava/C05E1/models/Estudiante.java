package com.bootcampjava.C05E1.models;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Estudiante {

    private Long numMatricula;
    private String nombre;
    private String apellido;
    private LocalDateTime fechaNacimiento;
    private Calificacion calificacion;
    
    public String obtenerNombreCompleto() {
        return nombre + " " + apellido;
    }
}
