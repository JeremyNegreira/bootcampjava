package com.bootcampjava.C01E2.controllers;

import com.bootcampjava.C01E2.models.DatoCurioso;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatoCuriosoController {

    @GetMapping("/")
    public String getRandomRefran() {
        List<DatoCurioso> datosCuriososList = new ArrayList<>();

        datosCuriososList.add(new DatoCurioso("Se han encontrado tarros de miel en tumbas egipcias que tienen más de 3000 años, y aún son comestibles. La miel tiene propiedades antibacterianas y antifúngicas naturales que la hacen resistente a la descomposición."));
        datosCuriososList.add(new DatoCurioso("Los flamencos rosados ​​nacen con plumaje gris o blanco. Su distintivo color rosado se desarrolla debido a la ingesta de alimentos ricos en betacarotenos, como los crustáceos y las algas."));
        datosCuriososList.add(new DatoCurioso("Si colocas todos los posibles arreglos de las 26 letras del alfabeto en un libro, tendrías la \"Biblioteca de Babel\". En teoría, esta biblioteca contendría todas las obras escritas y por escribir, pero la mayoría de ellas serían incomprensibles."));
        datosCuriososList.add(new DatoCurioso("El agujero negro más cercano a la Tierra se encuentra en el sistema estelar V616 Monocerotis, a unos 3,000 años luz de distancia. A pesar de su relativa cercanía, no representa una amenaza para nuestro sistema solar."));
        datosCuriososList.add(new DatoCurioso("Debido a su tamaño y estructura corporal, los elefantes son incapaces de levantar simultáneamente las cuatro patas del suelo para dar un salto. Aunque pueden correr a una velocidad sorprendente para su tamaño, el salto está fuera de su capacidad física."));

        Random random = new Random();
        int randomIndex = random.nextInt(datosCuriososList.size());

        return datosCuriososList.get(randomIndex).getTexto();
    }
}
