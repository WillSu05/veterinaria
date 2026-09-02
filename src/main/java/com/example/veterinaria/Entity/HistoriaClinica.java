package com.example.veterinaria.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "Historias Clinicas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistoriaClinica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "FECHA DE APERTURA OBLIGATORIA")
    @Column(name = "fecha_apertura", nullable = false)
    private LocalDate fechaApertura;
    @Column(columnDefinition = "TEXT")
    private String antecedentes;
    @Column(columnDefinition = "TEXT")
    private String observaciones;

}
