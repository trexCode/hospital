package dev.trexcode.hospital.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "CITAS", schema = "HOSPITAL")
public class Cita {
    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONSULTORIO")
    private Consultorio consultorio;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MEDICO")
    private Medico medico;
    @Column(name = "HORA_CONSULTA", nullable = false)
    private String horaConsulta;
    @Column(nullable = false)
    private String paciente;

    public Cita(Long id, String horaConsulta, String paciente, Long idMedico, String nombre, String apellidoPaterno, String apellidoMaterno, String especialidad, Long idConsultorio, Long piso) {
        this.id = id;
        this.horaConsulta = horaConsulta;
        this.paciente = paciente;
        this.medico = new Medico(idMedico, nombre, apellidoPaterno, apellidoMaterno, especialidad);
        this.consultorio = new Consultorio(idConsultorio, piso);
    }
}
