class Thing {

	public static String description;

	public static void show() {
		System.out.println("Static sample program is "+description);
	}
}

public class Static {

	public static void main(String[] args) {

		Thing.description = "Running";
		Thing.show();
	}

}
