package com.bootcampjava.C07E1.controllers;

import com.bootcampjava.C07E1.models.Vehiculo;
import com.bootcampjava.C07E1.services.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles/")
public class VehiculoController {

    @Autowired
    private IVehiculoService servicio;

    @PostMapping("")
    public void agregarVehiculo(@RequestBody Vehiculo vehiculo) {
        Vehiculo vehiculoNuevo = new Vehiculo(vehiculo.getMarca(), vehiculo.getModelo(), vehiculo.getKilometros(), vehiculo.getPuertas(), vehiculo.getPrecio());
        servicio.agregarVehiculo(vehiculoNuevo);
    }

    @GetMapping("")
    public List<Vehiculo> obtenerTodosLosVehiculos() {
        return servicio.obtenerTodosLosVehiculos();
    }

    @GetMapping("prices")
    public List<Vehiculo> obtenerVehiculosPorPrecio() {
        return servicio.obtenerVehiculosPorPrecio();
    }

    @GetMapping("{id}")
    public Vehiculo obtenerVehiculoPorId(@PathVariable Long id) {
        return servicio.obtenerVehiculoPorId(id);
    }
}

