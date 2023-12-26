package com.bootcampjava.C05E1.services;

import com.bootcampjava.C05E1.models.Estudiante;
import com.bootcampjava.C05E1.repositories.EstudianteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService implements IEstudianteService {
    
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> obtenerTodosEstudiantes() {
        return estudianteRepository.obtenerListaEstudiantes();
    }
}
