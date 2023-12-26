package com.bootcampjava.C05E1.services;

import com.bootcampjava.C05E1.dto.CalificacionDTO;
import com.bootcampjava.C05E1.models.Calificacion;
import com.bootcampjava.C05E1.models.Estudiante;
import com.bootcampjava.C05E1.repositories.EstudianteRepository;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class CalificacionService implements ICalificacionService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public CalificacionDTO obtenerCalificacionPorMatricula(Long numMatricula) {
        Estudiante estudianteEncontrado = estudianteRepository
                .obtenerListaEstudiantes()
                .stream()
                .filter(estudiante -> estudiante.getNumMatricula().equals(numMatricula))
                .findFirst()
                .orElse(null);

        Calificacion calificacion = null;
        if (estudianteEncontrado != null) {
            calificacion = estudianteEncontrado.getCalificacion();
        }
        
        

        return new CalificacionDTO(
                numMatricula,
               estudianteEncontrado.obtenerNombreCompleto(),
                calificacion.getCalificacion1(),
                calificacion.getCalificacion2(),
                calificacion.getCalificacion3(),
                calificacion.getPromedio()
        );

    }

    @Override
    public List<CalificacionDTO> obtenerCalificacionesOrdenDescendente() {
        List<Estudiante> estudiantes = estudianteRepository.obtenerListaEstudiantes();

        List<CalificacionDTO> calificacionesOrdenDescendente = estudiantes.stream()
                .sorted(Comparator.comparingDouble((Estudiante estudiante) -> estudiante.getCalificacion().getPromedio()).reversed())
                .map(estudiante -> new CalificacionDTO(
                estudiante.getNumMatricula(),
                estudiante.obtenerNombreCompleto(),
                estudiante.getCalificacion().getCalificacion1(),
                estudiante.getCalificacion().getCalificacion2(),
                estudiante.getCalificacion().getCalificacion3(),
                estudiante.getCalificacion().getPromedio()
        ))
                .toList();

        return calificacionesOrdenDescendente;
    }

}