package com.bootcampjava.C03E1.controllers;

import com.bootcampjava.C03E1.models.Evento;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventoController {
    private List<Evento> listaEventos = new ArrayList<>();
    private Long id = 1L;

    @PostMapping("evento")
    public Evento createEvent(@RequestBody Evento evento) {
        Evento nuevoEvento = new Evento(id++, evento.getTitulo(), evento.getDescripcion(),evento.getFecha(), evento.getHora(), evento.getLugar(), evento.getPonente());
        listaEventos.add(nuevoEvento);
        return nuevoEvento;
    }

    @GetMapping("evento/{id}")
    public Evento obtenerEventoPorId(@PathVariable int id) {
        Evento resultadoBusquedaEventoPorId = listaEventos.stream().filter(evento -> evento.getId() == id).findFirst().orElse(null);
        return resultadoBusquedaEventoPorId;
    }

    @GetMapping("eventos")
    public List<Evento> obtenerListaEventos() {
        return listaEventos;
    }
}
