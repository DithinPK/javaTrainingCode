
public class RuntimeException {
	
	public static void main(String[] arg) {
		
		String[] text= {"Apple","Banana","Orange"};
		
		try {
		System.out.println("Fruit: "+text[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
	}

}
