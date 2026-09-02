package com.example.veterinaria.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Mascotas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "NOMBRE OBLIGATORIO")
    @Column(nullable = false, unique = true)
    private String nombre;

    @NotBlank(message = "ESPECIE OBLIGATORIO")
    @Column(nullable = false)
    private String especie;

    @NotBlank(message = "RAZA OBLIGATORIO")
    @Column(nullable = false)
    private String raza;

    @NotNull(message = "EDAD OBLIGATORIA")
    @Min(value = 0, message = "EDAD NO PUEDE SER NEGATIVA")
    @Column(nullable = false)
    private Integer edad;

    @NotNull(message = "PESO OBLIGATORIO")
    @Positive(message = "PESO MAYOR A 0")
    @Column(nullable = false)
    private double peso;
}
