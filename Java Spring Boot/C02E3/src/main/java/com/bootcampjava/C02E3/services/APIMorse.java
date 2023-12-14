package com.bootcampjava.C02E3.services;

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

    // Solo dos espacios porque luego se añade otro al concatenar
    private static final String codigoMorseEspacio = "  ";

    public static String traducirOracionAMorse(String palabra) {
        palabra = palabra.toUpperCase(); // Convertir a mayúsculas para simplificar la traducción
        palabra = palabra.replace("%20", " "); // Sustituimos los desagradables %20 por espacios

        String palabraEnMorse = "";

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            if (caracter != ' ') {
                String codigoMorse = obtenerCodigoMorse(caracter);
                palabraEnMorse += codigoMorse + " ";
            } else {
                palabraEnMorse += "   ";
            }
        }

        return palabraEnMorse;
    }

    /**
     * Traduce a morse aprovechando el valor numérico del char en base al array
     * correspondiente.
     *
     * @param caracter
     * @return Traduccion del carácter o ? si no se ha encontrado.
     */
    private static String obtenerCodigoMorse(char caracter) {
        // Verificar si es una letra o número, o si no ponemos un ?
        if (Character.isDigit(caracter)) {
            int indice = caracter - '0';
            return codigosMorseNumeros[indice];
        } else if (Character.isLetter(caracter)) {
            int indice = caracter - 'A';
            return codigosMorseLetras[indice];
        } else {
            return "?";
        }
    }
}
