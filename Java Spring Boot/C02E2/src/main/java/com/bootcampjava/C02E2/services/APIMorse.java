package com.bootcampjava.C02E2.services;

public class APIMorse {

    private static final String[] codigosMorseLetras = {
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
        ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
        "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
    };

    private static final String[] codigosMorseNumeros = {
        "-----", ".----", "..---", "...--", "....-", ".....",
        "-....", "--...", "---..", "----."
    };

    public static String traducirPalabraAMorse(String palabra) {
        palabra = palabra.toUpperCase(); // Convertir a mayúsculas para simplificar la traducción

        StringBuilder palabraEnMorse = new StringBuilder();

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            String codigoMorse = obtenerCodigoMorse(caracter);
            palabraEnMorse.append(codigoMorse).append(" ");
        }

        return palabraEnMorse.toString().trim();
    }

    /**
     * Traduce a morse aprovechando el valor numérico del char en base al array correspondiente.
     * 
     * @param caracter
     * @return Traduccion del carácter o ? si no se ha encontrado.
     */
    private static String obtenerCodigoMorse(char caracter) {
        // Verificar si es una letra o número, o si no ponemos un ?
        if (Character.isLetter(caracter)) {
            int indice = caracter - 'A';
            return codigosMorseLetras[indice];
        } else if (Character.isDigit(caracter)) {
            int indice = caracter - '0';
            return codigosMorseNumeros[indice];
        } else {
            return "?";
        }
    }
}
