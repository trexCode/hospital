package dev.trexcode.hospital.ws.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.trexcode.hospital.model.Cita;
import dev.trexcode.hospital.model.Medico;
import dev.trexcode.hospital.service.CitaService;
import dev.trexcode.hospital.service.MedicoService;
import dev.trexcode.hospital.utils.ResultadoResponse;

@RestController
@RequestMapping("citas/api")
public class CitasRestController {

    private final ResultadoResponse resultado;
    private final MedicoService medicoService;
    private final CitaService citaService;

    public CitasRestController(ResultadoResponse resultado, MedicoService medicoService, CitaService citaService) {
        this.resultado = resultado;
        this.medicoService = medicoService;
        this.citaService = citaService;
    }
    
    @GetMapping(value = "obtenerMedicos")
    public ResponseEntity<List<Medico>> obtenerMedicos() {
        try {
            return new ResponseEntity<>(medicoService.obtenerMedicos(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "obtenercitas")
    public ResponseEntity<List<Cita>> obtenerCitas(){
        try {
            return new ResponseEntity<>(citaService.obtenerTodasCitas(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
