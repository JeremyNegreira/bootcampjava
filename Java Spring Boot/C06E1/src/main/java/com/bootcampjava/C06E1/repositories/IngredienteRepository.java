package com.bootcampjava.C06E1.repositories;

import com.bootcampjava.C06E1.models.Ingrediente;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.springframework.util.ResourceUtils;

public class IngredienteRepository {

    public List<Ingrediente> loadDataBaseIngedient() {
        File file = null;
        try {
            file = ResourceUtils.getFile("src\\main\\java\\com.bootcampjava.C06E1.resources\\ingredients.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Ingrediente>> typeRef = new TypeReference<>() {
        };
        List<Ingrediente> listaIngredientes = null;
        try {
            listaIngredientes = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaIngredientes;
    }
}
