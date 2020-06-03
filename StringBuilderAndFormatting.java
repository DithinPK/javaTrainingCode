
public class StringBuilderAndFormatting {

	public static void main(String[] args) {
		
		String info ="My Name is Dithin";
		info+=" ";
		info+="I am a developer";
		
		System.out.println(info);
		
		StringBuilder sb=new StringBuilder();
		sb.append("My Name is Das");
		sb.append(" ").append("I am a developer");
		 
		System.out.println(sb.toString());
		
		System.out.println("\nString formatter");
		
		System.out.printf("Total cost %-10d; Quantity is %d\n",5,120);
	}

}
