class Robot {

	public void speak(String text) {
		System.out.println(text);
	}

	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}
}

public class MethodParameters {

	public static void main(String[] args) {

		Robot robot = new Robot();
		robot.speak("Hi i am John Snow");
		robot.jump(6);

	}

}
