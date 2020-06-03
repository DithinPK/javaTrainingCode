import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queues {

	public static void main(String[] args) {
		
		Queue<Integer> q1=new ArrayBlockingQueue<Integer>(3); 
			
		q1.add(10);
		q1.add(20);
		q1.add(30);		
		
		for(Integer value:q1) {
			System.out.println(value);			
		}
		
	}

}
