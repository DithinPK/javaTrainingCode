import java.util.Iterator;
import java.util.LinkedList;

public class ImplementingIterable implements Iterable<String> {

	public LinkedList<String> url = new LinkedList<String>();

	public ImplementingIterable() {

		url.add("www.facebook.com");
		url.add("www.google.com");
		url.add("www.youtube.com");
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return url.iterator();
	}	

}
