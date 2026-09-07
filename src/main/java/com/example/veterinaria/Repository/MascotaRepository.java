package com.example.veterinaria.Repository;

import com.example.veterinaria.Entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MascotaRepository extends JpaRepository<Mascota, Long> {
}
