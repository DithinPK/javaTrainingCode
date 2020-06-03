
public class PassingByValue {

	public static void main(String[] args) {

		int value = 7;

		System.out.println("1.Value: " + value);
		
		show(value);
		
		System.out.println("4.Value: "+value);

	}

	public static void show(int value) {
		
		System.out.println("2.Value: " + value);

		value = 8;
		
		System.out.println("3.Value: " + value);
	}

}
