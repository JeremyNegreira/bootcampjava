package com.bootcampjava.C06E1.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlatoDTO {
    private String nombrePlato;
    private double totalCalorias;
    private List<IngredienteDTO> listaIngredientes;
    private IngredienteDTO ingredienteMasCalorico;
    
}
