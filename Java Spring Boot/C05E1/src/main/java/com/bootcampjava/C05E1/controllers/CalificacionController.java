package com.bootcampjava.C05E1.controllers;

import com.bootcampjava.C05E1.dto.CalificacionDTO;
import com.bootcampjava.C05E1.services.ICalificacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calificaciones")
public class CalificacionController {

    @Autowired
    private ICalificacionService calificacionService;

    @GetMapping("/{num_matricula}")
    public CalificacionDTO obtenerCalificaciones(@PathVariable("num_matricula") Long numMatricula) {
        return calificacionService.obtenerCalificacionPorMatricula(numMatricula);
    }
    
    @GetMapping("/ordendesc")
    public List<CalificacionDTO> obtenerCalificacionesOrdenDescendente() {
        return calificacionService.obtenerCalificacionesOrdenDescendente();
    }
}
