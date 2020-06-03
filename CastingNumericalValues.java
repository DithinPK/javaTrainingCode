
public class CastingNumericalValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intValue=10;
		long longValue=1990;
		double doubleValue=13.27;
		float floatValue=12.2f;
		
		intValue=(int) longValue;
		System.out.println(intValue);
		
		doubleValue=intValue;
		System.out.println(doubleValue);
		
		intValue=(int) floatValue;
		System.out.println(intValue);
		

	}

}
