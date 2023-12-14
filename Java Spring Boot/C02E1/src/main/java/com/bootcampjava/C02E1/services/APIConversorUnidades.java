package com.bootcampjava.C02E1.services;

public class APIConversorUnidades {

    /**
     * Recibe un parámetro numérico en cm y devuelve un mensaje convirtiéndolo a
     * metros.
     *
     * @param unidadEnCentimetros
     * @return mensaje de conversión a metros
     */
    public static String convertCentimetersToMeters(double unidadEnCentimetros) {
        return "El equivalente a " + unidadEnCentimetros + "cm es " + (unidadEnCentimetros / 100) + "metros.";
    }
}
