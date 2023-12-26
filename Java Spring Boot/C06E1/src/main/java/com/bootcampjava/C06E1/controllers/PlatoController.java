package com.bootcampjava.C06E1.controllers;

import com.bootcampjava.C06E1.dto.PlatoDTO;
import com.bootcampjava.C06E1.services.IPlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlatoController {

    @Autowired
    private IPlatoService servicio;

    @GetMapping("/{nombre_plato}")
    public PlatoDTO obtenerPlatoPorNombre(@PathVariable("nombre_plato") String nombrePlato) {
        return servicio.obtenerPlatoPorNombre(nombrePlato);
    }
}
