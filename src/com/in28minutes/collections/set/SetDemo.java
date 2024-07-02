package com.in28minutes.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	// Only Unique numbers are allowed
	// No null values
	// Order of sorting is not done
	// hashset is preserved based on hashfunc.
	// Linkedhashset will preserve the order of insertion and display it in the same order.
	// Treeset is based on node elemets and right towards larger and left towards
	// smaller. Tree set sorts the orfer of the insertion.

	public static void main(String[] args) {

		Set<Integer> num = Set.of(4, 1, 7, 5);

		System.out.println("The numbers are " + num);

		Set<Integer> hashset = new HashSet<>();

		hashset.add(765432);
		hashset.add(76543);
		hashset.add(7654);
		hashset.add(765);
		hashset.add(76);
		hashset.add(7);

		System.out.println("The hashset numbers are " + hashset);
		
		Iterator<Integer> in =  hashset.iterator();
		while(in.hasNext()) {
			System.out.println("The elements are :-###" + in.next());
		}
		

		Set<Integer> linkedhashset = new LinkedHashSet<>();

		linkedhashset.add(765432);
		linkedhashset.add(76543);
		linkedhashset.add(7654);
		linkedhashset.add(765);
		linkedhashset.add(76);
		linkedhashset.add(7);

		System.out.println("The linkedhashset numbers are " + linkedhashset);

		Set<Integer> treeset = new TreeSet<>();
		treeset.add(765432);
		treeset.add(76543);
		treeset.add(7654);
		treeset.add(765);
		treeset.add(76);
		treeset.add(7);

		System.out.println("The treeset numbers are " + treeset);

		
		
	}

}
