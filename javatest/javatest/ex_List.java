package javatest;

import java.util.ArrayList;
import java.util.List;

public class ex_List {
	public static void main(String[] args) {
		List<String> fruit = new ArrayList<String>();
		
		fruit.add("apple");
		fruit.add("banana");
		fruit.add("melon");
		fruit.add("lemon");
		
		int size=fruit.size();
		
		for(int i=0 ; i<size;i++) {
			String str=fruit.get(i);
			System.out.println(i+":"+str);
		}
		fruit.remove(0);
	}
}


