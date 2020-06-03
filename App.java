
public class App {

	public static void main(String[] args) {

		ImplementingIterable im=new ImplementingIterable();
		for(String urls: im) {
			System.out.println(urls);
		}
	}

}
