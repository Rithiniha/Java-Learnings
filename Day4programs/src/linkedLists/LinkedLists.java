package linkedLists;

import java.util.*;

public class LinkedLists {

	public static void main(String[] args) {
        LinkedList <Integer> link = new LinkedList<>();
		
		link.add(100);
		link.add(200);
		link.add(300);
		link.add(400);
		link.addFirst(500);
		link.addLast(600);
		
		System.out.println(link);
		
		System.out.println(link.get(0));
		System.out.println(link.set(0, 1000));
		System.out.println("........................");
		System.out.println(link.remove(2));
		System.out.println("........................");
		System.out.println(link.isEmpty());
		System.out.println("........................");
		link.clear();
		
	//	for(int i=1;i<=10;i++) {
	//	     System.out.println(i);
		
	//        }
		//System.out.println(link);
	}

}
