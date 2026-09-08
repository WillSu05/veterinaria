package com.example.veterinaria.Service;

import com.example.veterinaria.Entity.HistoriaClinica;

import java.util.List;

public interface HistoriaClinicaService {
    List<HistoriaClinica> listarTodos();
    HistoriaClinica buscarPorId(Long id);
    HistoriaClinica crear(HistoriaClinica historia, Long mascotaID);
    HistoriaClinica actualizar (Long id, HistoriaClinica historia);
    void eliminar(Long id);
}
