package Slow.slicing.Array;

import java.lang.reflect.Array;

public class HighArrayApp {
	public static void main(String[] args) {
		int maxSize = 100;
		HighArray array;
		array = new HighArray(maxSize);
		array.insert(11);
		array.insert(22);
		array.insert(33);
		array.insert(44);
		array.insert(55);
		array.insert(66);
		array.insert(77);
		array.insert(88);
		array.display();
		int value = 36;
		if(array.find(value))
			System.out.println("Found " +value);
		else
			System.out.println("Can`t find " +value);
		array.delete(00);
		array.delete(22);
		array.delete(44);
		array.display();
		long max;
		max = array.getMax();
		System.out.println(max);
		array.removeMax();
		array.sort();
		array.display();
		array.noDup();


	}
}
