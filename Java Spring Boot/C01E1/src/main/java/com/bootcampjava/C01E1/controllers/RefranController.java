package com.bootcampjava.C01E1.controllers;

import com.bootcampjava.C01E1.models.Refran;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class RefranController {

    @GetMapping("/")
    public String getRandomRefran() {
        List<Refran> refranesList = new ArrayList<>();

        refranesList.add(new Refran("A buen entendedor, pocas palabras bastan"));
        refranesList.add(new Refran("A caballo regalado, no le mires el diente"));
        refranesList.add(new Refran("A la tercera va la vencida"));
        refranesList.add(new Refran("A mal tiempo, buena cara"));
        refranesList.add(new Refran("A quien madruga, Dios le ayuda"));

        Random random = new Random();
        int randomIndex = random.nextInt(refranesList.size());

        return refranesList.get(randomIndex).getTexto();
    }
}
