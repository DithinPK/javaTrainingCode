class Fruit {

	String name;	

	String setFruitName() {

		String fruit_name=name;
		return fruit_name;
	}

	String getFruitName() {

		return name;
	}
}

public class GettersAndSetters {

	public static void main(String[] args) {

		Fruit fruit1 = new Fruit();

		fruit1.name = "Apple";		

		Fruit fruit2 = new Fruit();

		fruit2.name = "Orange";		
		
		String fruitItem=fruit1.getFruitName();
		
		System.out.println("fruitItem : "+fruitItem);

		System.out.println("Fruit1 Obejct values are");
		System.out.println(fruit1.name);
		fruit1.setFruitName();

		System.out.println("\nfruit2 Obejct values are");
		System.out.println(fruit2.name);
		fruit2.setFruitName();
		
		fruitItem=fruit2.getFruitName();
		
		System.out.println("fruitItem : "+fruitItem);

	}

}
