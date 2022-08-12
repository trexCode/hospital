package dev.trexcode.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.trexcode.hospital.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{
    
}
