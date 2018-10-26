package Slow.slicing.linklist;

public class FirstLastApp {
	public static void main(String[] args) {
		FirstLastList lastList = new FirstLastList();
		lastList.insertFirst(22);
		lastList.insertFirst(44);
		lastList.insertFirst(66);

		lastList.insertLast(11);
		lastList.insertLast(33);
		lastList.insertLast(55);
		lastList.displayList();
		lastList.deleteFirst();
		lastList.deleteFirst();
		lastList.displayList();
	}
}
