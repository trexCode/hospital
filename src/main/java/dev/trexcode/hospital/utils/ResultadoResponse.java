package dev.trexcode.hospital.utils;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ResultadoResponse {

	private String estatus;
	private String mensaje;
	private Object datos;

}