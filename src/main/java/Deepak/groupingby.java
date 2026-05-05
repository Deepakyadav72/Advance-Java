package Deepak;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingby {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,32,43,13,25,67);
		// Partitioning by
		// Grouping by
		Map<Integer,List<Integer>> groupMap=list.stream().collect(Collectors.groupingBy(n->n%2));
		System.out.println("grouping by :"+groupMap);
		
		//Partitioning by
		
		Map<Boolean,List<Integer>> partMap=list.stream().collect(Collectors.partitioningBy(n->n>12));
		System.out.println("partitioning by"+ partMap);	
		
		
		List<String> List2=Arrays.asList("Varun ","vdesad","gyuedu","deepak");
		Map<Boolean, List<String>> partMap2=List2.stream()
				.collect(Collectors.partitioningBy(n->n.length()>4));
		System.out.println("part map 2"+ partMap2);	
		
		
		
		//  Without Flatmap
		
		List<List<Integer>> list5=Arrays.asList(Arrays.asList(20,30,23,50),Arrays.asList(10,28,5,32),Arrays.asList(30,23,46,32,78));
		System.out.println("Without flatMap:"+list5);
		
		
		//  FlatMap
		
		List<Integer> result=list5.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(result);
	}

}
