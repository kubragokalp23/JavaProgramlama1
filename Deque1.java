package src;

import java.util.Deque;
import java.util.LinkedList;

public class Deque1 {

	public static void main(String[] args) {
		/*
		 * 
		 *  add(element): 
			addFirst(element): 
			addLast(element): 
			offer(element): 
			offerFirst(element): 
			offerLast(element): 
			iterator(): 
			descendingIterator(): 
			push(element): en basa eleman ekler
			pop(element):  en bastaki elemani siler
			removeFirst():  ilk elemani siler
			removeLast():  son elemani siler
			poll():	pollFirst():  ilk elemani yazdirir
			pollLast(): son elemani yazdirir
			peek(): 
			peekFirst():
			peekLast():
			*/
		 Deque<String> dq = new LinkedList<String>(); 
		 dq.add("Burcin");
		 dq.offer("Kubra");
		 dq.offerFirst("Busra");
		 dq.addFirst("Fatmik");
		 dq.addLast("Seza");
		 dq.push("Deniz");
		 dq.removeFirst();
		 System.out.println(dq);
	//	 System.out.println(dq.peekLast());
		 for (int i = 0; i < 5; i++) {
			System.out.println(dq.poll());
		}
	}

}
