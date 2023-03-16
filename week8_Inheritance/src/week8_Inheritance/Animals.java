package week8_Inheritance;

class Animal {
    public String name;
    public int age;

    public void eat() {
        System.out.println("Eating...");
    }
}

class Cat extends Animal {
    public String color;

    public void meow() {
        System.out.println("MEOWW");
    }
}

class Dog extends Animal {
    public String breed;

    public void bark() {
        System.out.println("BARK! BARK!");
    }
}
	
