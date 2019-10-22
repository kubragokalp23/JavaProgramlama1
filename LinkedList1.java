package ArrayList;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		/*
		 * add : eleman ekler
		 * addFirst : en basa ekler
		 * addLast : en sona ekler
		 * clear : tum elemanlari sile
		 * contains : listede eleman varligi sorgusu yapar
		 * get : indisteki elemani cagirmak icin kulanilir
		 * getfirst - getlast
		 * indexOf
		 * lastIndexOf
		 * listIterator
		 * remove
		 * removeFirst
		 * removeLast
		 * clone : 
		 * 
		 * */
		LinkedList<String> linkedList =new LinkedList<>();
		linkedList.add("MERCEDES");
		linkedList.add("AUDI");
		linkedList.add("BMW");		
		linkedList.addLast("FORD");
		linkedList.addFirst("PORSHE");
		for (String araba : linkedList) {
			System.out.println(araba);
		}

		System.out.println("ilk eleman : "+linkedList.getFirst());
		System.out.println("Son eleman : "+linkedList.getLast());

		linkedList.remove(0);
		System.out.println("Yeni ilk eleman : "+linkedList.getFirst());
		
		linkedList.removeLast();
		System.out.println("Yeni son eleman : "+linkedList.getLast());
	}

}
