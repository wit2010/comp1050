package iterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Example1 {

	public static void initialize(List<Integer> list, int size) {
		for (int i = 0; i < size; i++)
			list.add(0);
	}
	
	public static long enumerate(List<?> list) {
		long start = System.currentTimeMillis();

		for (int i = 0; i < list.size(); i++)
			list.get(i);
		
		long stop = System.currentTimeMillis();
		return stop - start;
	}

	public static void main(String[] args) {
		int size = 100000;
		
		List<Integer> list1 = new ArrayList<>();
		initialize(list1, size);
		System.out.println("ArrayList: " + enumerate(list1));
		
		List<Integer> list2 = new LinkedList<>();
		initialize(list2, size);
		System.out.println("LinkedList: " + enumerate(list2));
	}

}
