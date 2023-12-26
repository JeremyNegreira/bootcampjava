package com.bootcampjava.C07E1.repositories;

import com.bootcampjava.C07E1.models.Vehiculo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class VehiculoRepository {

    private List<Vehiculo> listaVehiculos = new ArrayList<>(Arrays.asList(
            new Vehiculo("Peugeot", "206", 150000, 5, 7500),
            new Vehiculo("Toyota", "Corolla", 120000, 4, 18000),
            new Vehiculo("Ford", "Fiesta", 80000, 3, 12000)
    ));

    public List<Vehiculo> obtenerListaVehiculos() {
        return listaVehiculos;
    }
    
    public void agregarListaVehiculos(Vehiculo vehiculoNuevo) {
        listaVehiculos.add(vehiculoNuevo);
    }
}

