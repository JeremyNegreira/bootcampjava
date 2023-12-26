package com.bootcampjava.C06E1.services;

import com.bootcampjava.C06E1.dto.IngredienteDTO;
import com.bootcampjava.C06E1.dto.PlatoDTO;
import com.bootcampjava.C06E1.models.Ingrediente;
import com.bootcampjava.C06E1.models.Plato;
import com.bootcampjava.C06E1.repositories.IngredienteRepository;
import com.bootcampjava.C06E1.repositories.PlatoRepository;
import java.util.Comparator;
import java.util.List;
import java.util.spi.ToolProvider;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class PlatoService implements IPlatoService {

    @Autowired
    private PlatoRepository repositorioPlatos;

    @Autowired
    private IngredienteRepository repositorioIngredientes;

    @Override
    public PlatoDTO obtenerPlatoPorNombre(String nombrePlato) {
        Plato platoEncontrado = repositorioPlatos
                .loadDataBase()
                .stream()
                .filter((Plato plato) -> plato.getNombre().equalsIgnoreCase(nombrePlato))
                .findFirst()
                .orElse(null);

        if (platoEncontrado == null) {
            return new PlatoDTO();
        }

        List<Ingrediente> listaIngredientes = repositorioIngredientes
                .loadDataBaseIngedient()
                .stream()
                .filter((Ingrediente ingrediente) -> platoEncontrado.getListaIngredientes().contains(ingrediente)).toList();

        List<IngredienteDTO> listaIngredientesDTO = listaIngredientes
                .stream()
                .map(ingrediente -> {
                    IngredienteDTO ingredienteDTO = new IngredienteDTO();
                    ingredienteDTO.setNombre(ingrediente.getNombre());
                    ingredienteDTO.setCantidadCalorias(ingrediente.getCantidadCalorias());
                    return ingredienteDTO;
                })
                .toList();

        Double totalCalorias = listaIngredientesDTO
                .stream()
                .mapToDouble(IngredienteDTO::getCantidadCalorias)
                .sum();

        IngredienteDTO ingredienteMasCalorico = listaIngredientesDTO
                .stream()
                .sorted(Comparator.comparingDouble(IngredienteDTO::getCantidadCalorias).reversed())
                .findFirst()
                .orElse(null);

        String nombreIngredienteMasCalorico = ingredienteMasCalorico != null ? ingredienteMasCalorico.getNombre() : "";

        return new PlatoDTO(nombrePlato, totalCalorias, listaIngredientesDTO, ingredienteMasCalorico);
    }
}
