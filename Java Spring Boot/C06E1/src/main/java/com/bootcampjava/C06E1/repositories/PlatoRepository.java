package com.bootcampjava.C06E1.repositories;

import com.bootcampjava.C06E1.dto.PlatoDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

@Repository
public class PlatoRepository {

    private List<PlatoDTO> loadDataBase() {
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:dishes.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<PlatoDTO>> typeRef = new TypeReference<>() {
        };
        List<PlatoDTO> platoDTO = null;
        try {
            platoDTO = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return platoDTO;
    }

    public List<PlatoDTO> obtenerListaPlatos() {
        return loadDataBase();
    }
}
