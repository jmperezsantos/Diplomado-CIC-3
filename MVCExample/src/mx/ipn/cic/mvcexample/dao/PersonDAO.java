package mx.ipn.cic.mvcexample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

		PreparedStatement statement = null;

		Connection connection = null;
		try {

			connection = this.getDBConnection();

			String SQL = "SELECT * FROM person";

			statement = connection.prepareStatement(SQL);

			ResultSet rs = statement.executeQuery();

			while (rs.next()) {

				String name = rs.getString("name");
				String lastname = rs.getString("lastname");
				int age = rs.getInt("age");

				PersonModel person = new PersonModel(name, lastname, "", age);

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

	public PersonModel fetchById(int id) {

		return null;
	}

	public PersonModel create(PersonModel person) throws SQLException {

		PreparedStatement statement = null;

		Connection connection = null;
		try {

			connection = this.getDBConnection();

			String SQL = "INSERT INTO person (name, lastname, age) values (?, ?, ?)";

			statement = connection.prepareStatement(SQL);

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

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/midb", "root", "password");

		} catch (SQLException e) {

			System.out.println("No se pudo conectar!");
			e.printStackTrace();

		}

		if (connection != null) {

			System.out.println("Lo logramos!");

		} else {

			System.out.println("Failed to make connection!");

		}

		return connection;

	}

}
