package Slow.slicing.Sort;

public class BubbleSortApp {
	public static void main(String[] args) {
		int maxSize = 100;
		ArrayBub arr;
		arr = new ArrayBub(maxSize);/*
		for(int i =0 ;i<maxSize;i++){
			long n = (long)(java.lang.Math.random()*(maxSize - 1));
			arr.insert(n);
		}*/
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.display();
		//arr.bubbleSort();
		arr.oddEvenSort();
		arr.display();
	}
}
