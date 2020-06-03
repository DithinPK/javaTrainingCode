class Camera {

	public void start() {

		System.out.println("Camera started...!");
	}
}

class Mobile extends Camera {

	public void start() {

		System.out.println("Mobile started...!");
	}
}

public class UpcastingAndDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Camera camera1 = new Camera();
		camera1.start();
		Mobile mobile1 = new Mobile();
		mobile1.start();

		Camera camera2 = new Mobile();
		camera2.start();
	}

}
