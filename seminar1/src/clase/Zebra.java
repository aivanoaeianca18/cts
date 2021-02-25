package clase;

public class Zebra extends Animal{
	
	private int age;

	public Zebra(String name) {
		super(name);
		this.age=5;
	}

	public Zebra(String name, int age) {
		super(name);
		this.age = age;
	}

}
