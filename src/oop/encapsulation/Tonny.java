package oop.encapsulation;

public class Tonny {
	private String name;
	private int version;

	public String getname() {		// Change to public and return 
		return name;
	}

	public void setname(String name) {  //set name as normal method pass parameter to method using object and assign with this keyword.
		this.name = name;
	}

	public int getversion() {
		return version;
	}

	public void setversion(int version) {
		this.version = version;
	}

}
