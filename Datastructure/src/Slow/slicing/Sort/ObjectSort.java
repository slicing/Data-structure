package Slow.slicing.Sort;

public class ObjectSort {
	public static void main(String[] args) {
		int maxSize = 100;
		ArrayInOb arr;
		arr = new ArrayInOb(maxSize);
		arr.insert("Evans","Patty",24);
		arr.insert("Smith","Doc",59);
		arr.insert("Smith","Lorraine",37);
		arr.insert("Yee","Tom",43);
		arr.insert("Vang","Minh",72);
		arr.disPlay();
		arr.insertSort();
		arr.disPlay();
	}
}
