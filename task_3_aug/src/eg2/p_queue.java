package eg2;

import java.util.*;

public class p_queue {
	
	public static void main(String[] args) {

		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("ujjwal");
		pq.add("kumar");
		pq.add("keshri");
		pq.add("u2jj");
		pq.add("golu");
		pq.add("aman");

		System.out.println(pq.peek());

	
		System.out.println(pq.poll());

	
		pq.remove("golu");
		System.out.println("\n final pririority queue is " + pq);
		
		
		String ele=pq.peek();
		System.out.println("extract an element from " + ele);
		
		
		
		Iterator iq=pq.iterator();
		if(iq.hasNext()) {
			System.out.println("iterate over an loop is " + iq.next());
		}
		
	}


}
