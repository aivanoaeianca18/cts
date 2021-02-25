package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	private Zookeper zookeper;
	private List<Animal> animals;
	public Zoo(Zookeper zookeper, List<Animal> animals) {
		super();
		this.zookeper = zookeper;
		this.animals = animals;
	}
	public Zoo() {
		super();
		this.zookeper = new Zookeper();
		this.zookeper.setName("Gigel");
		this.animals = new ArrayList<>();
	}
	public Zookeper getZookeper() {
		return zookeper;
	}
	public void setZookeper(Zookeper zookeper) {
		this.zookeper = zookeper;
	}
	public List<Animal> getAnimals() {
		return animals;
	}
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	
	public void addAnimal(Animal animal) {
		this.animals.add(animal);
	}
	
	public void feedAllAnimals() {
		
		for(Animal a : this.animals) {
			zookeper.feed(a);
		}
	}

}
