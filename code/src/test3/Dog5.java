package test3;

public class Dog5 {
	public static void main(String[] args){
		Dog spot = new Dog("spot", "Ruff!");
		Dog scruff = new Dog("scruff", "Wurf!");
		System.out.println(spot.name + "  " + spot.says);
		System.out.println(scruff.name + "  " + scruff.says);
		Dog dog = new Dog(" ", " ");
		dog = spot;
		System.out.println(dog == spot);
		System.out.println(dog.equals(spot));
		Dog dog2 = new Dog(" ", " ");
		dog2.name = spot.name;
		dog2.says = spot.says;
		System.out.println(dog2 == spot);
		System.out.println(dog2.equals(spot));
	}
}

class Dog{
	public String name;
	public String says;
	public Dog(String n, String s){
		this.name = n;
		this.says = s;
	}
}