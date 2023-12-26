package com.bootcampjava.C05E1.controllers;

import com.bootcampjava.C05E1.models.Estudiante;
import com.bootcampjava.C05E1.services.IEstudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private IEstudianteService estudianteService;

    @GetMapping
    public List<Estudiante> obtenerEstudiantes() {
        return estudianteService.obtenerTodosEstudiantes();
    }
}
