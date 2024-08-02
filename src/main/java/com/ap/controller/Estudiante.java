package com.ap.controller;

// si deseo crear el toString(), equals(), hashCode() y un constructor mas los gett y setts
// solo ingreso @Data y la liberia en pom.xml
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class Estudiante {
	private int id;
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String correoElectronico;
	private String grado;
	private Date fechaInscripcion;
}
