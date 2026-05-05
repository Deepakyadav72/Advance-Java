package Deepak;

import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list=new LinkedList<>();
		//value inserting
		list.add(20);
		list.add(30);
		list.add(233);
		list.add(40);
		list.add(223);
		list.add(200);
		list.add(90);
		list.add(50);
		list.add(70);
		
		System.out.println("LinkedList iss"+list);
		
		//first element
		
		System.out.println("LinkedList iss"+list.getFirst());
		System.out.println("LinkedList iss"+list.getLast());
		
		list.addFirst(123);
		list.addLast(234);
		
		System.out.println("LinkedList iss"+list.getFirst());
		System.out.println("LinkedList iss"+list.getLast());
		
		
		System.out.println("LinkedList is :"+list);
		
		list.add(5,000);
		System.out.println("LinkedList iss"+list);
		System.out.println("LinkedList size is:"+list.size());
		
		//remove
		System.out.println("LinkedList remove is:"+list.remove(7));
		
		//remove First
		
		
		System.out.println("LinkedList size is:"+list.removeFirst());
		System.out.println("LinkedList iss"+list);

	    //add
		System.out.println("LinkedList size is:"+list.add(500));
		System.out.println("LinkedList iss"+list);
		
		//AddFirst
//		System.out.println("LinkedList size is:"+list.addFirst(450));
	}
	

}
