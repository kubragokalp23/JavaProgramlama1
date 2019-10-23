package src;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue1 {

	public static void main(String[] args) {
		/*
		 * Bu s�n�f stack s�n�f�ndan farkl� olarak �zel durumlar d���nda ilk giren ilk ��kar mant��� ile �al��maktad�r. FIFO (first in first out)
			
			add(eleman): Parametrede verilen eleman� kuyru�a ekler. ��lemin ba�ar�s�z olmas� durumunda hata f�rlat�r.
			offer(eleman): Parametrede verilen eleman� kuyru�a ekler. ��lemin ba�ar�s�z olmas� durumunda null d�ner.
			poll(): remove() Kuyru�un ba��ndaki eleman� kuyruktan ��kart�r.
			peek(): element() Kuyrukta s�radaki elemana ula�mak i�in kullan�l�r.
			clear()
			
		 * */
		
		Queue <Integer> q =new LinkedList<>();
		Scanner sc= new Scanner(System.in);
		for (int i = 1; i <=5; i++) {
			System.out.println("Bir deger giriniz : ");
			int sayi = sc.nextInt();
			if(q.add(sayi)) {
				System.out.println("Sayi eklendi");
			}
			else {
				System.out.println("Sayi eklenemedi.");
			}
		}
		for (Integer i : q) {
			System.out.print(i+" ");
		}
		
		
	}
		
}
