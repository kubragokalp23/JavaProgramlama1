package src;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue1 {

	public static void main(String[] args) {
		/*
		 * Bu sýnýf stack sýnýfýndan farklý olarak özel durumlar dýþýnda ilk giren ilk çýkar mantýðý ile çalýþmaktadýr. FIFO (first in first out)
			
			add(eleman): Parametrede verilen elemaný kuyruða ekler. Ýþlemin baþarýsýz olmasý durumunda hata fýrlatýr.
			offer(eleman): Parametrede verilen elemaný kuyruða ekler. Ýþlemin baþarýsýz olmasý durumunda null döner.
			poll(): remove() Kuyruðun baþýndaki elemaný kuyruktan çýkartýr.
			peek(): element() Kuyrukta sýradaki elemana ulaþmak için kullanýlýr.
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
