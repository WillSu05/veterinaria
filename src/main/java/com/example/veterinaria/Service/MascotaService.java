package com.example.veterinaria.Service;

import com.example.veterinaria.Entity.Mascota;

import java.util.List;

public interface MascotaService {
    Mascota buscarPorId (Long id);
    Mascota guardad(Mascota mascota, Long propietarioId);
    Mascota actualizar(Long id, Mascota mascota);
    void eliminar (Long id);
    List<Mascota> buscarPorPropietario(Long propietarioId);
    Mascota asignarVVeterinario(Long mascotaId, Long veterinarioId);

}
