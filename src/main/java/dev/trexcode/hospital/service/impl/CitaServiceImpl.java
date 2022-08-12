package dev.trexcode.hospital.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.trexcode.hospital.model.Cita;
import dev.trexcode.hospital.repository.CitaRepository;
import dev.trexcode.hospital.service.CitaService;

@Service
public class CitaServiceImpl implements CitaService {

    private final CitaRepository citaRepository;

    public CitaServiceImpl(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    @Override
    public List<Cita> obtenerTodasCitas() {
        return citaRepository.obtenerTodasCitas();
    }
    
}
