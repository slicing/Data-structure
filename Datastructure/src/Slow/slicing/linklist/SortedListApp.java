package Slow.slicing.linklist;

public class SortedListApp {
	public static void main(String[] args) {
		SortedList theSorted = new SortedList();
		theSorted.insert(20);
		theSorted.insert(40);
		theSorted.displayList();
		theSorted.insert(50);
		theSorted.insert(30);
		theSorted.displayList();
		theSorted.remove();
		theSorted.remove();
		theSorted.displayList();
	}
}
