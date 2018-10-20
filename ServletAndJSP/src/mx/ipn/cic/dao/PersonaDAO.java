package mx.ipn.cic.dao;

import java.util.ArrayList;
import java.util.List;

import mx.ipn.cic.model.Person;

//Obtención de datos (Conexión a MySQL)
public class PersonaDAO {
	
	public List<Person> getAll(){
		
		List<Person> lista = new ArrayList<>();
		
		for(int i = 0; i<5; i++) {
		
			Person person = new Person("Person " + i,
					"Lastname " + i,
					i, 
					"Genre " + i);
			
			lista.add(person);
			
		}
		
		return lista;
		
	}

}
