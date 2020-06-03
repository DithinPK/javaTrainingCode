
public class Polymorphism {

	public void sum(int num1, int num2) {
		System.out.println("sum of two number: " + (num1 + num2));
	}

	public void sum(int num1, int num2, int num3) {
		System.out.println("sum of three number: " + (num1 + num2 + num3));
	}

	public static void main(String arg[]) {

		Polymorphism ply=new Polymorphism();
		ply.sum(10,17);
		ply.sum(27,12, 1990);
	}

}
