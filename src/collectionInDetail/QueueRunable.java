package collectionInDetail;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRunable {

	public static void main(String ages[]) {
		
		Queue<Integer> pq = new LinkedList<>();
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(1);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}
