package clase;

public class Zookeper {

	private String name;


	public void setName(String name) {
		this.name = name;
	}


	public void feed(Animal a) {
		System.out.println(name+" hraneste animalul "+ a.getName());
		
	}
	
}
