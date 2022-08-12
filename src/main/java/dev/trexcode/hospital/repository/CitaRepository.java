package dev.trexcode.hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dev.trexcode.hospital.model.Cita;

public interface CitaRepository extends JpaRepository<Cita, Long> {
    @Query("SELECT NEW Cita(c.id, c.horaConsulta, c.paciente, medico.id, medico.nombre, medico.apellidoPaterno, medico.apellidoMaterno, medico.especialidad, consultorio.id, consultorio.piso) FROM Cita c")
    List<Cita> obtenerTodasCitas();
}
