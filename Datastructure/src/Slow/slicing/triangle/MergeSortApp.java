package Slow.slicing.triangle;

public class MergeSortApp {
	public static void main(String[] args) {
		int maxSize = 100;
		DArray array;
		array = new DArray(maxSize);
		array.insert(64);
		array.insert(21);
		array.insert(33);
		array.insert(70);
		array.insert(12);
		array.insert(85);
		array.insert(44);
		array.insert(3);
		array.insert(99);
		array.insert(0);
		array.insert(108);
		array.insert(36);
		array.disPlay();
		array.mergeSort();
		array.disPlay();
	}
}
