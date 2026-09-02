package com.example.veterinaria.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
    private Long id;
    private LocalDate fechaApertura;
    private String antecedentes;
    private String observaciones;

}
