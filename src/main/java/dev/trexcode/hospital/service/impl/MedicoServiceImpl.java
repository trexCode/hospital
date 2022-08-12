package dev.trexcode.hospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.trexcode.hospital.model.Medico;
import dev.trexcode.hospital.repository.MedicoRepository;
import dev.trexcode.hospital.service.MedicoService;

@Service
public class MedicoServiceImpl implements MedicoService{

    @Autowired
    MedicoRepository medicoRepository;

    @Override
    public List<Medico> obtenerMedicos() {
        return medicoRepository.findAll();
    }
    
}
