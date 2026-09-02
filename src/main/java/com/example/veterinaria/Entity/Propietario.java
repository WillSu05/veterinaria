package com.example.veterinaria.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "propietarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Propietario {
    @Id
    private Long id;
    private String nombre;
    private String documento;
    private String telefono;
}
