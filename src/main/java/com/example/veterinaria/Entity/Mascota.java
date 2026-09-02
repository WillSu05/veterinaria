package com.example.veterinaria.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Mascotas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mascota {
    private Long id;
    private String nombre;
    private String especie;
    private String raza;
    private Integer edad;
    private double peso;
}
