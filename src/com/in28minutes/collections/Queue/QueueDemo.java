package com.in28minutes.collections.Queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


class StringLengthComparator implements Comparator<String>{
	public int compare(String value1, String value2) {
		return Integer.compare(value1.length(), value2.length());
	}
}

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<>();
		
		System.out.println(queue.poll());  //null
		
		queue.offer("Apple");
		
		System.out.println(queue.poll());   //apple
		
		queue.addAll(List.of("banana","orange","grapes"));
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		
		System.out.println(queue.poll());
		
		System.out.println(queue.poll());
		
		
		Queue<String> queue1 = new PriorityQueue<>(new StringLengthComparator());
		queue1.addAll(List.of("Zebra", "Monkey", "Cat"));
		System.out.println(queue1.poll());
		System.out.println(queue1.poll());
		System.out.println(queue1.poll());

	}

}
