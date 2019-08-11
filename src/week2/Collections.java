package week2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Collections {

	static ArrayList<String> arrayList;
	static Queue<Integer> pq;
	static Queue<Integer> linkedList;
	static Map<Integer, String> map;
	static Set<Integer> hashSet;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//-------ArrayList
		arrayList = new ArrayList<>();
		for (int i = 0; i != 10; i++) {
			arrayList.add("Elements");
		}
		System.out.println("ArrayList element: " + arrayList);

		//-------PQ
		pq = new PriorityQueue<>();
		for (int i = 0; i != 10; i++) {
			pq.add((int) (Math.random() * 10));
		}
		System.out.print("PQ  :");
		for (int i = 0; i != 10; i++) {
			System.out.print(pq.poll());
		}

		//-------LinkedList
		linkedList = new LinkedList<>();
		for (int i = 0; i != 10; i++) {
			linkedList.add((int) (Math.random() * 10));
		}
		System.out.print("\nLinkedList  :");
		for (int i = 0; i != 10; i++) {
			System.out.print(linkedList.poll());
		}
		
		//-------HashMap
		map = new HashMap<>();
		for (int i = 0; i != 10; i++) {
			map.put(i,""+(int) (Math.random() * 10));
		}
		System.out.print("\nmap: "+map);	
		
		//-------HashSet
		hashSet = new HashSet<>();
		System.out.println();
		System.out.println(hashSet.add(1));
		System.out.println(hashSet.add(1));//can not add the same number in to set
		System.out.println(hashSet.add(3));
	}

}
