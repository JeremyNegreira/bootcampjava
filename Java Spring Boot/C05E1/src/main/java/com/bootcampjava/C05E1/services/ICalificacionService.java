package com.bootcampjava.C05E1.services;

import com.bootcampjava.C05E1.dto.CalificacionDTO;
import java.util.List;

public interface ICalificacionService {
    public CalificacionDTO obtenerCalificacionPorMatricula(Long numMatricula);

    public List<CalificacionDTO> obtenerCalificacionesOrdenDescendente();
}
