package Slow.slicing.Array;

public class OrdArrayApp {
	public static void main(String[] args) {
		int maxSize = 100;
		OrdArray array;
		array = new OrdArray(maxSize);
		array.insert(11);
		array.insert(22);
		array.insert(33);
		array.insert(44);
		array.insert(55);
		array.insert(66);
		array.insert(77);
		array.insert(88);
		int searchKey = 55;
		if(array.find(searchKey) != array.size())
			System.out.println("Found" + searchKey);
		else
			System.out.println("Can`t Found" + searchKey);

		array.display();
		array.delete(55);
		array.delete(66);
		array.display();
	}
}
