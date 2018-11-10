package mx.ipn.cic.mvcexample.services;

import java.sql.SQLException;
import java.util.List;

import mx.ipn.cic.mvcexample.dao.PersonDAO;
import mx.ipn.cic.mvcexample.model.PersonModel;

public class PersonService {

	private PersonDAO personDAO;

	public PersonService() {

		this.personDAO = new PersonDAO();

	}

	public List<PersonModel> findAll() {

		try {
			return this.personDAO.fetchAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public PersonModel findById(int id) {

		try {
			return this.personDAO.fetchById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

	public PersonModel create(PersonModel person) {

		try {
			return this.personDAO.create(person);
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

	public PersonModel update(PersonModel person) {

		try {
			return this.personDAO.update(person);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public boolean deleteById(int id) {

		try {
			return this.personDAO.deleteById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return true;

	}

}
