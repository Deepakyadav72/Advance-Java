package Basic;

import java.util.*;
import java.lang.*;
class women implements Comparable<women>{
	int age;
	String name;
//	constructor 
	women(int age,String name){
		this.age=age;
		this.name=name;
	}
	public int compareTo(women w) {
		return this.age-w.age;
	}
}

public class natural_sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<women> list=new ArrayList<>();
		list.add(new women(45,"deepika"));
		list.add(new women(34,"urmila"));
		list.add(new women(8,"priya"));
		list.add(new women(23,"nirmala"));
		Collections.sort(list);
		for(women w:list) {
			System.out.println(w.age+" "+w.name);
		}
		

	}

}
