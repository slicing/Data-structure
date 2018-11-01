package Slow.slicing.triangle;

public class BinarySearchApp {
	public static void main(String[] args) {
		int maxSize = 100;
		OrdArray array;
		array = new OrdArray(maxSize);
		array.insert(72);
		array.insert(90);
		array.insert(45);
		array.insert(126);
		array.insert(54);
		array.insert(99);
		array.insert(27);
		array.insert(135);
		array.insert(81);
		array.insert(18);
		array.insert(108);
		array.insert(9);
		array.insert(117);
		array.insert(63);
		array.insert(36);
		array.disPlay();
		int searchKey  = 27;
		if (array.find(searchKey) != array.size())
			System.out.println("Found " + searchKey);
		else
			System.out.println("Can`t find " + searchKey);
	}
}
