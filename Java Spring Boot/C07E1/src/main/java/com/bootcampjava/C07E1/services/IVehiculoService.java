package com.bootcampjava.C07E1.services;

import com.bootcampjava.C07E1.models.Vehiculo;
import java.util.List;

public interface IVehiculoService {

    public Vehiculo obtenerVehiculoPorId(Long id);

    public List<Vehiculo> obtenerVehiculosPorPrecio();

    public List<Vehiculo> obtenerTodosLosVehiculos();

    public void agregarVehiculo(Vehiculo vehiculo);
}
