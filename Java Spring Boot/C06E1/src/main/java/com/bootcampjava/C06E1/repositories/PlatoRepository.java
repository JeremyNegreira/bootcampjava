package com.bootcampjava.C06E1.repositories;

import com.bootcampjava.C06E1.models.Plato;
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

    public List<Plato> loadDataBase() {
        File file = null;
        try {
            file = ResourceUtils.getFile("src\\main\\java\\com.bootcampjava.C06E1.resources\\dishes.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Plato>> typeRef = new TypeReference<>() {
        };
        List<Plato> listaPlatos = null;
        try {
            listaPlatos = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaPlatos;
    }
}
