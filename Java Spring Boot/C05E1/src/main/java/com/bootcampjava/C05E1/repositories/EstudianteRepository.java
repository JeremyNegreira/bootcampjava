package com.bootcampjava.C05E1.repositories;

import com.bootcampjava.C05E1.models.Calificacion;
import com.bootcampjava.C05E1.models.Estudiante;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class EstudianteRepository {

    private List<Estudiante> listaEstudiantes = Arrays.asList(
            new Estudiante(1L, "Roberto", "García", LocalDateTime.of(1995, 5, 15, 0, 0),
                    new Calificacion(8.5, 7.8, 9.2)),
            new Estudiante(2L, "Laura", "Fernández", LocalDateTime.of(1998, 9, 22, 0, 0),
                    new Calificacion(7.0, 8.2, 7.5)),
            new Estudiante(3L, "Carlos", "López", LocalDateTime.of(1997, 3, 10, 0, 0),
                    new Calificacion(9.2, 9.5, 8.8))
    );

    public List<Estudiante> obtenerListaEstudiantes() {
        return listaEstudiantes;
    }
}
