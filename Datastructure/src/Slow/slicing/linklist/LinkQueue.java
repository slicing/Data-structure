package Slow.slicing.linklist;

public class LinkQueue {
	private FirstLastList theList;
	public LinkQueue(){
		theList = new FirstLastList();
	}
	public boolean isEmpty(){
		return theList.isEmpty();
	}
	public void insert(long value){
		theList.insertLast(value);
	}
	public long remove(){
		return theList.deleteFirst();
	}
	public void displayQueue(){
		System.out.print("Queue ( front --> rear): ");
		theList.displayList();
	}
}
