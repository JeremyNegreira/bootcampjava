package com.bootcampjava.C02E1.controllers;

import com.bootcampjava.C02E1.services.APIConversorUnidades;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversionController {

    /**
     * Recibe un parámetro numérico en cm y devuelve un mensaje convirtiéndolo a
     * metros.
     *
     * @param unidadEnCentimetros
     * @return mensaje de conversión a metros
     */
    @GetMapping("/")
    public String convert(@RequestParam double unidadEnCentimetros) {
        return APIConversorUnidades.convertCentimetersToMeters(unidadEnCentimetros);
    }
}
