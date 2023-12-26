package com.bootcampjava.C06E1.services;

import com.bootcampjava.C06E1.dto.PlatoDTO;
import com.bootcampjava.C06E1.repositories.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class PlatoService implements IPlatoService {

    @Autowired
    private PlatoRepository repositorioPlatos;

    @Override
    public PlatoDTO obtenerPlatoPorNombre(String nombrePlato) {
        
        return null;
        
    }
}