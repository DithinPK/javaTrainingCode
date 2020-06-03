class Animal{	
	
	public void eat() {
		System.out.println("Eating...!");
	}	
}

class Dog extends Animal{
	
	public void bark() {
		
		System.out.println("Dog is barking...!");		
	}
}
public class Inheritance{	

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.eat();
		dog.bark();
	}

}
