package com.bootcampjava.C06E1.repositories;

import com.bootcampjava.C06E1.dto.IngredienteDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

@Repository
public class IngredienteRepository {

    private List<IngredienteDTO> loadDataBase() {
        File file = null;
        try {
            //aquí colocamos la url de nuestro archivo json que queremos cargar
            file = ResourceUtils.getFile("classpath:ingredients.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<IngredienteDTO>> typeRef = new TypeReference<>() {
        };
        List<IngredienteDTO> ingreDTO = null;
        try {
            ingreDTO = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ingreDTO;
    }

    public List<IngredienteDTO> obtenerListaIngredientes() {
        return loadDataBase();
    }
}
