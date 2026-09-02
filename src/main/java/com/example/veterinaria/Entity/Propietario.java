package com.example.veterinaria.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table (name = "propietarios")
public class Propietario {
    private Long id;
    private String nombre;
    private String documento;
    private String telefono; 
}
