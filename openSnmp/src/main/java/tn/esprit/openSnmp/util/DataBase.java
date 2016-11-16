/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.openSnmp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alaa
 */
public class DataBase {
	private static Connection connection;
	private static DataBase dataBase;

	private DataBase() {

	}

	public static DataBase getInstance() {
		if (dataBase == null) {
			dataBase = new DataBase();
		}
		return dataBase;
	}

	public static Connection getConnections(String dbName, String userName, String password) {
		if (connection == null) {

			System.out.println("-------- MySQL JDBC Connection Testing ------------");

			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("Where is your MySQL JDBC Driver?");
				e.printStackTrace();

			}
			System.out.println("MySQL JDBC Driver Registered!");

			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_monitoring", "root", "");

				System.out.println(connection);

			} catch (SQLException e) {
				System.out.println("Connection Failed! Check output console");
				e.printStackTrace();

			}

		}
		return connection;
	}

}
