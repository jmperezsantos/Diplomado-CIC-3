package mx.ipn.cic.mvcexample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mx.ipn.cic.mvcexample.model.PersonModel;

/**
 * 
 * @author jmperezsantos
 * 
 *         Clase de acceso a datos Conexión a MySQL
 *
 */
public class PersonDAO {

	public PersonDAO() {

	}

	public List<PersonModel> fetchAll() throws SQLException {

		List<PersonModel> persons = new ArrayList<>();

		Statement statement = null;

		Connection connection = null;

		try {

			connection = this.getDBConnection();

			String SQL = "SELECT * FROM person";

			statement = connection.createStatement();

			ResultSet rs = statement.executeQuery(SQL);

			while (rs.next()) {

				String name = rs.getString("name");
				String lastname = rs.getString("lastname");
				int age = rs.getInt("age");

				int id = rs.getInt("id");

				PersonModel person = new PersonModel(id, name, lastname, "", age);

				persons.add(person);

			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			if (statement != null) {
				statement.close();
			}

			if (connection != null) {
				connection.close();
			}

		}

		return persons;

	}

	public PersonModel fetchById(int id) throws SQLException {

		PersonModel person = null;

		PreparedStatement statement = null;

		Connection connection = null;

		try {

			connection = this.getDBConnection();

			String SQL = "SELECT * FROM person WHERE id = ?";

			statement = connection.prepareStatement(SQL);

			statement.setInt(1, id);

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				String name = rs.getString("name");
				String lastname = rs.getString("lastname");
				int age = rs.getInt("age");

				// int id = rs.getInt("id");

				person = new PersonModel(id, name, lastname, "", age);

			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			if (statement != null) {
				statement.close();
			}

			if (connection != null) {
				connection.close();
			}

		}

		return person;

	}

	public PersonModel create(PersonModel person) throws SQLException {

		PreparedStatement statement = null;
		Connection connection = null;

		try {

			connection = this.getDBConnection();

			String insert = "INSERT INTO person (name, lastname, age) values (?, ?, ?)";

			statement = connection.prepareStatement(insert);

			statement.setString(1, person.getName());
			statement.setString(2, person.getLastname());
			statement.setInt(3, person.getAge());

			statement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			if (statement != null) {
				statement.close();
			}

			if (connection != null) {
				connection.close();
			}

		}

		return person;

	}

	public PersonModel update(PersonModel person) throws SQLException {

		PreparedStatement statement = null;

		Connection connection = null;
		try {

			connection = this.getDBConnection();

			String SQL = "UPDATE person SET name = ?, lastname = ?, age = ? WHERE id = ?";

			statement = connection.prepareStatement(SQL);

			statement.setString(1, person.getName());
			statement.setString(2, person.getLastname());
			statement.setInt(3, person.getAge());

			statement.setInt(4, person.getId());

			statement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			if (statement != null) {
				statement.close();
			}

			if (connection != null) {
				connection.close();
			}

		}

		return person;
	}

	public boolean deleteById(int id) throws SQLException {

		PreparedStatement statement = null;

		Connection connection = null;
		try {

			connection = this.getDBConnection();

			String SQL = "DELETE person WHERE id = ?";

			statement = connection.prepareStatement(SQL);

			statement.setInt(1, id);

			statement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			if (statement != null) {
				statement.close();
			}

			if (connection != null) {
				connection.close();
			}

		}

		return true;
	}

	private Connection getDBConnection() {

		Connection connection = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("No hay Driver!");
			e.printStackTrace();
		}

		System.out.println("MySQL JDBC Driver Registered!");

		try {

			connection = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/mydatabase?serverTimezone=America/Mexico_City", "root", "Password123");

		} catch (SQLException e) {

			System.out.println("No se pudo conectar!");
			e.printStackTrace();

		}

		if (connection != null) {

			System.out.println("Lo logramos!");

		} else {

			System.out.println("No lo logramos, :'( ");

		}

		return connection;

	}

}
