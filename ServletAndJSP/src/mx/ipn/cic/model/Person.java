package mx.ipn.cic.model;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -7877513641967264166L;
	
	private String name;
	private String lastname;
	private int age;
	private String genre;

	public Person() {
		super();
	}

	public Person(String name, String lastname, int age, String genre) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return String.format("Person [name=%s, lastname=%s, age=%s, genre=%s]", 
				name, 
				lastname, 
				age, 
				genre);
	}

}
