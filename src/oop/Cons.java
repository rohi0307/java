package oop;

public class Cons {

	// data members of the class.
	String name;
	int id;

	Cons(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public static void main(String[] args) {
		Cons geek1 = new Cons("avinash", 68);
		System.out.println("GeekName :" + geek1.name + " and GeekId :" + geek1.id);
	}
}
