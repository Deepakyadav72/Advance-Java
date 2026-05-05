package Deepak;
import java.util.*;
import java.lang.*;
class Human implements Comparable <Human>{
	
	int age;
	String name;
	
	Human(int age,String name){
		this.age=age;
		this.name=name;
		
	}
	public int compareTo(Human h1) {
		return this.age-h1.age;
	}
}

public class Comparables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Human>List=new ArrayList<>();
		
		List.add(new Human(22,"Akash"));
		List.add(new Human(32,"Rishabh"));
		List.add(new Human(21,"Ansh"));
		List.add(new Human(25,"vikas"));
		List.add(new Human(40,"Abhi"));
		List.add(new Human(50,"Akash"));
		List.add(new Human(45,"RAman"));
		
		Collections.sort(List);
		for(Human h:List) {
			System.out.println(h.age+" "+h.name);
		}

	}

}
