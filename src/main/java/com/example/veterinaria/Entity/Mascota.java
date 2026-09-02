package com.example.veterinaria.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Mascotas")
public class Mascota {
    private Long id;
    private String nombre;
    private String especie;
    private String raza;
    private Integer edad;
    private double peso;
}
