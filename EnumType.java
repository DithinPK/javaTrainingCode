
public class EnumType {

	public static void main(String[] args) {

		Animals animal = Animals.DOG;

		switch (animal) {
		case CAT:
			System.out.println("CAT");
			break;
		case DOG:
			System.out.println("DOG");
			break;
		case BULL:
			System.out.println("BULL");
			break;
		default:
			break;
		}

		System.out.println(Animals.DOG);
		System.out.println(Animals.DOG.getClass());
	}

}
