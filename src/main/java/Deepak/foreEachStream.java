package Deepak;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;
import java.util.*;


// Stream API

public class foreEachStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=Arrays.asList(23,22,34,54,21,76);
		
		//===========Filter=============
//		list.stream().filter(n->n%2==0).forEach(System.out::println);
		
		
		//==Combine task
//		list.stream().filter(n->n>10).sorted().map(n->n*n).forEach(System.out::println);
		
		// =====Reducer ===
		
		int sum=list.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
	}

}
