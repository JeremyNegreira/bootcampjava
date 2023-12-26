package com.bootcampjava.C07E1.services;

import com.bootcampjava.C07E1.models.Vehiculo;
import com.bootcampjava.C07E1.repositories.VehiculoRepository;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoService implements IVehiculoService {

    @Autowired
    private VehiculoRepository repositorio;

    @Override
    public List<Vehiculo> obtenerVehiculosPorPrecio() {
        return repositorio
                .obtenerListaVehiculos()
                .stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getPrecio))
                .toList();
    }

    @Override
    public Vehiculo obtenerVehiculoPorId(Long id) {
        return repositorio.obtenerListaVehiculos().stream()
                .filter(vehiculo -> vehiculo.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Vehiculo> obtenerTodosLosVehiculos() {
        return repositorio.obtenerListaVehiculos();
    }

    @Override
    public void agregarVehiculo(Vehiculo vehiculoNuevo) {
        repositorio.agregarListaVehiculos(vehiculoNuevo);
    }

}
