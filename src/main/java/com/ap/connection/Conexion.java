package com.ap.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static final String URL = "jdbc:mariadb://localhost:3307/UMG";
	private static final String USER = "root";
	private static final String PASSWORD = "Ander2023@";
	private static Connection connection = null;

	public static Connection getConnection() {

		if (connection == null) {
			try {
				Class.forName("org.mariadb.jdbc.Driver");
				connection = DriverManager.getConnection(URL, USER, PASSWORD);
				System.out.println("Conexion exitosa.");
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println("Error al conectar la base de datos");
				e.printStackTrace();
			}
		}
		return connection;

	}

	// Funciona para cerrar la conexion
	public static void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
				System.out.println("Conexion cerrada.");
			} catch (SQLException e) {
				e.printStackTrace();

			}

		}

	}

}
