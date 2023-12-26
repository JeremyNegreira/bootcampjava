package com.bootcampjava.C06E1.models;

import com.bootcampjava.C06E1.dto.IngredienteDTO;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Plato {

    private Long codigoPlato;
    private String nombre;
    private Double precio;
    private List<Ingrediente> listaIngredientes;
}
