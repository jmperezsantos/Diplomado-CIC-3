package mx.ipn.cic.mvcexample.model;

import java.io.Serializable;

public class PersonModel implements Serializable {

	private static final long serialVersionUID = -8806664715079795177L;

	private int id;
	private String name;
	private String lastname;
	private String address;
	private int age;

	public PersonModel() {
		super();

	}

	public PersonModel(int id, String name, String lastname, String address, int age) {
		this(name, lastname, address, age);
		this.setId(id);
	}

	public PersonModel(String name, String lastname, String address, int age) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.address = address;
		this.age = age;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("PersonModel [id=%s, name=%s, lastname=%s, address=%s, age=%s]", getId(), name, lastname,
				address, age);
	}

}
