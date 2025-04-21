package javatest;
import java.util.*;

public class ex_linkedlist {
	public static void main(String[] args) {
		
		LinkedList<String> fruits = new LinkedList<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Chery");
		fruits.add("Mango");
		fruits.add("Orange");
		
		System.out.println("첫 번째 과일 : " + fruits.get(0));
		System.out.println("마지막 과일 : " + fruits.getLast());
		
		fruits.remove("Banana");
		fruits.remove(2);
		
		System.out.println("현재 과일 리스트 :");
		for(String fruit : fruits) {
			System.out.println(" - " + fruit);
		}
		
	}

}
