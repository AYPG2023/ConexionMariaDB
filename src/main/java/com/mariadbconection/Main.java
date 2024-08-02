package com.mariadbconection;

import com.ap.dao.EstudianteDAO;

import java.util.Date;
import java.util.List;
import com.ap.controller.Estudiante;

public class Main {

	public static void main(String[] args) {
		EstudianteDAO estudianteDAO = new EstudianteDAO();

        // Crear un nuevo estudiante
        Estudiante nuevoEstudiante = new Estudiante();
        nuevoEstudiante.setNombre("Anderson");
        nuevoEstudiante.setApellido("Perdomo");
        nuevoEstudiante.setFechaNacimiento(new Date());
        nuevoEstudiante.setGenero("M");
        nuevoEstudiante.setDireccion("Los Verdes 1-67 Zona 3");
        nuevoEstudiante.setTelefono("3284-2586");
        nuevoEstudiante.setCorreoElectronico("andersonperdomo525@gmail.com");
        nuevoEstudiante.setGrado("5to");
        nuevoEstudiante.setFechaInscripcion(new Date());
        estudianteDAO.insertarEstudiante(nuevoEstudiante);
		
        Estudiante estudiante = estudianteDAO.obtenerEstudiante(1);
        if(estudiante != null) {
        	System.out.println("Estudiante ID: " + estudiante.getId());
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Apellido: " + estudiante.getApellido());
        } else {
            System.out.println("Estudiante no encontrado.");
        }

        // Obtener todos los estudiantes
        List<Estudiante> estudiantes = estudianteDAO.obtenerTodosEstudiantes();
        for (Estudiante est : estudiantes) {
            System.out.println("ID: " + est.getId() + ", Nombre: " + est.getNombre() + ", Apellido: " + est.getApellido());
        }

        // Actualizar un estudiante
        if (estudiante != null) {
            estudiante.setNombre("Juan Actualizado");
            estudianteDAO.actualizarEstudiante(estudiante);
        }

        // Eliminar un estudiante
        estudianteDAO.eliminarEstudiante(1);
    }
}
