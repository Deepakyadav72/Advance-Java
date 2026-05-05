package Deepak;

import java.util.*;
import java.util.stream.Collectors;



public class PeakApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list1=Arrays.asList(1,2,3,4,5,6,7);
		
		
		list1.stream().peek(n->System.out.println("Before:"+n))
		.map(n->2*n).peek(n->System.out.println("After:"+n))
		.collect(Collectors.toList());
		
		long count =list1.stream().count();
		System.err.println("count:"+count);
		//=====Sum =============
		int sum=list1.stream().mapToInt(n->n).sum();
		System.out.println("Sum:"+sum);
		
	 //	find First 
		
		Optional<Integer>first=list1.stream().findFirst();
		System.out.println("Find first :"+first.get());
		
		
		// find any
		
		Optional<Integer>findany=list1.stream().findAny();
		System.out.println("Find first :"+findany);
		
		// anymatch 
		
		boolean iseven=list1.stream().anyMatch(n->n%2==0);
		
		System.out.println("AnyMatch :" +iseven);
		
		// all match
		
boolean odd=list1.stream().allMatch(n->n%2==1);
		
		System.out.println("All Match :" +odd);
		
		
		
	}

}
