package com.example.veterinaria.Service.Impl;

import com.example.veterinaria.Repository.MascotaRepository;
import com.example.veterinaria.Service.MascotaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MascotaServiceImpl {
    private final MascotaRepository mascotaRepository;
}
