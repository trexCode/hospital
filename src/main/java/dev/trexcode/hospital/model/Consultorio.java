package dev.trexcode.hospital.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "CONSULTORIOS", schema = "HOSPITAL")
public class Consultorio {
    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long piso;
    @OneToMany(mappedBy = "consultorio")
    private List<Cita> cita;

    public Consultorio(Long id, Long piso) {
        this.id = id;
        this.piso = piso;
    }
}
