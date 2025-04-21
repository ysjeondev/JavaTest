package javatest;
import java.util.*;

//udc ==> LinkedList User define Class

class Person{
	String name;
	int age;
	
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
}
	
	public String toString() {
		return "이름 : " + name + ", 나이" + age;
	}
}

public class ex_linkedlist_udc{
	public static void main(String[] args) {
		LinkedList<Person> people = new LinkedList<>();
		
		people.add(new Person("홍길동", 25));
		people.add(new Person("강철수", 30));
		people.add(new Person("이영희", 30));
		
		for(Person p : people) {
			System.out.println(p);
		}
		
	}
}
