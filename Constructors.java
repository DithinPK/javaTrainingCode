
class Bird {

	String birdName;
	String birdcolour;

	public Bird() {
		System.out.println("Default Constructor is running");
		birdName = "Parrot";
	}

	public Bird(String birdcolour) {
		System.out.println("Parameterized Constructor is running");
		this.birdcolour = birdcolour;
	}

	public void displayName() {
		System.out.println("Bird Name : " + birdName);
	}

	public void displayColour() {
		System.out.println("Bird colour: " + birdcolour);
	}
}

public class Constructors {

	public static void main(String[] args) {

		Bird birdN = new Bird();
		birdN.displayName();
		Bird birdC = new Bird("Green");
		birdC.displayColour();
		

	}

}
