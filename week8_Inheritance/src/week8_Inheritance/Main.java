package week8_Inheritance;

public class Main {

	public static void main(String[] args) {
		 Animal animal= new Animal();
	        Cat cat= new Cat();
	        Dog dog= new Dog();

	        // * Parent Class Examples
	        animal.eat();   animal.age= 6;
	        cat.eat();      cat.age= 3;
	        dog.eat();      dog.age= 8;

	        // * Child Class Examples
	        cat.meow();     cat.color= "Yellow";
	        dog.bark();     dog.breed= "Beagle";
	}

}
